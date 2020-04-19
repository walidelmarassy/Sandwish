package com.example.sandwish;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.example.sandwish.databinding.ActivityThirdWelcomescreenBinding;
import com.example.sandwish.ui.ui.login.LoginActivity;

public class ThirdWelcomescreenActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        final ActivityThirdWelcomescreenBinding binding = DataBindingUtil.setContentView(this, R.layout.activity_third_welcomescreen);
        binding.skiptext.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(ThirdWelcomescreenActivity.this, LoginActivity.class);
                startActivity(intent);

            }
        });
    }
}
