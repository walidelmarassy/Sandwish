package com.example.sandwish;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.example.sandwish.databinding.ActivitySecondWelcomescreenBinding;
import com.example.sandwish.databinding.ActivityWelcomescreenBinding;

public class SecondWelcomescreen extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        final ActivitySecondWelcomescreenBinding binding = DataBindingUtil.setContentView(this, R.layout.activity_second_welcomescreen);
        binding.skiptext.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(SecondWelcomescreen.this,ThirdWelcomescreenActivity.class);
                startActivity(intent);

            }
        });

    }
}
