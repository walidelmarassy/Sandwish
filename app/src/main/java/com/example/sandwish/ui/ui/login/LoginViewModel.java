package com.example.sandwish.ui.ui.login;

import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

import com.example.sandwish.data.request.ForgetPasswordBody;
import com.example.sandwish.data.request.LoginBody;
import com.example.sandwish.data.response.ApiResponse;
import com.example.sandwish.data.services.ApiInterface;

import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.disposables.CompositeDisposable;
import io.reactivex.schedulers.Schedulers;

public class LoginViewModel extends ViewModel {
    private MutableLiveData<ApiResponse> responseLiveData ;
    private ApiInterface apiInterface;
    private CompositeDisposable disposable = new CompositeDisposable();
    public void set(ApiInterface iService) {
        this.apiInterface = iService;
    }
    public void login(String lang , LoginBody object){
        disposable.add(
                apiInterface.login(lang,object).subscribeOn(Schedulers.io()).observeOn(AndroidSchedulers.mainThread())
                        .doOnSubscribe(__ -> responseLiveData.postValue(ApiResponse.loading()))
                        .subscribe(
                                loginResponse -> responseLiveData.postValue(ApiResponse.success(loginResponse)),
                                throwable -> responseLiveData.postValue(ApiResponse.error(throwable))
                        ));
    }
    public void forgetPassword(String lang, ForgetPasswordBody email){
        disposable.add(apiInterface.forgetPassword(lang,email)
                .subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .doOnSubscribe(disposable -> {})
                .subscribe(
                        response -> responseLiveData.postValue(ApiResponse.success(response)),
                        throwable -> responseLiveData.postValue(ApiResponse.error(throwable))
                ));
    }





}
