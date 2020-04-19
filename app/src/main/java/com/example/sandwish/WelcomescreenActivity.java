package com.example.sandwish;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.example.sandwish.databinding.ActivityWelcomescreenBinding;

public class WelcomescreenActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        final ActivityWelcomescreenBinding binding = DataBindingUtil.setContentView(this, R.layout.activity_welcomescreen);
        binding.skiptext.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(WelcomescreenActivity.this,SecondWelcomescreen.class);
                startActivity(intent);

            }
        });

    }
}
