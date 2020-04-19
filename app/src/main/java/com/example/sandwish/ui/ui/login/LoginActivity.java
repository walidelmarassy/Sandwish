package com.example.sandwish.ui.ui.login;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelProviders;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;

import com.example.sandwish.R;
import com.example.sandwish.data.services.ApiInterface;
import com.example.sandwish.ui.ui.register.RegisterActivity;
import com.example.sandwish.databinding.ActivityLoginBinding;

import javax.inject.Inject;

public class LoginActivity extends AppCompatActivity {
    @Inject
    ApiInterface iServices;
    @Inject
    SharedPreferences.Editor editor;
    @Inject
    SharedPreferences preferences;
    String mobormail;
    private ActivityLoginBinding binding;
    LoginViewModel loginViewModel;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        initiateDI();
        renderView();
        binding.createaccount.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(LoginActivity.this, RegisterActivity.class);
                startActivity(intent);

            }
        });
    }
    @Override
    public void onBackPressed() {
        setResult(RESULT_CANCELED, new Intent());
        finish();
    }


    private void renderView() {
        binding = DataBindingUtil.setContentView(this, R.layout.activity_login);
        loginViewModel = ViewModelProviders.of(this).get(LoginViewModel.class);


    }

    private void initiateDI() {
    }
}
