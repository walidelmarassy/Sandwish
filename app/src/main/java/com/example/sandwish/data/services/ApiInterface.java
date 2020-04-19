package com.example.sandwish.data.services;

import androidx.annotation.Nullable;

import com.example.sandwish.data.request.ForgetPasswordBody;
import com.example.sandwish.data.request.LoginBody;
import com.example.sandwish.data.response.Forgetpasswordresponse;
import com.example.sandwish.data.response.LoginResponse;
import com.example.sandwish.data.response.RegisterResponse;

import io.reactivex.Single;
import retrofit2.http.Body;
import retrofit2.http.Header;
import retrofit2.http.POST;

public interface ApiInterface {
    @POST("ApiAuth/LogIn")
    Single<LoginResponse>login(@Header("x-lang") @Nullable String lang, @Body LoginBody jsonObject);
    @POST ("ApiCustomers/Register")
    Single<RegisterResponse>register();
    @POST("ApiCustomers/ForgetPassword")
    Single<Forgetpasswordresponse>forgetPassword(@Header("x-lang") @Nullable String lang,@Body ForgetPasswordBody forgetPasswordBody);






}
