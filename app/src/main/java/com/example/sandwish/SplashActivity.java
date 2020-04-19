package com.example.sandwish;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;

import com.example.sandwish.data.request.ForgetPasswordBody;

public class SplashActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);
        splashlauncher splashlauncher=new splashlauncher();
        splashlauncher.start();

    }
    private class splashlauncher extends Thread{
        @Override
        public void run() {
            try {
                sleep(1000);

            }
            catch (InterruptedException e){
                e.printStackTrace();

            }
            Boolean isFirstRun = getSharedPreferences("PREFERENCE", MODE_PRIVATE)
                    .getBoolean("isFirstRun", true);
            if (isFirstRun) {
                startActivity(new Intent(SplashActivity.this, WelcomescreenActivity.class));

            }
            else {

                startActivity(new Intent(SplashActivity.this, ForgetpasswordActivity.class));




            }
            getSharedPreferences("PREFERENCE", MODE_PRIVATE).edit()
                    .putBoolean("isFirstRun", false).commit();

        }

    }


}
