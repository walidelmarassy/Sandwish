package com.example.sandwish.ui.ui.register;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.example.sandwish.R;
import com.example.sandwish.databinding.ActivitySignupBinding;
import com.example.sandwish.ui.ui.login.LoginActivity;

public class RegisterActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        final ActivitySignupBinding binding = DataBindingUtil.setContentView(this, R.layout.activity_signup);
        binding.alreadyhaveaccount.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(RegisterActivity.this, LoginActivity.class);
                startActivity(intent);

            }
        });
    }
}
