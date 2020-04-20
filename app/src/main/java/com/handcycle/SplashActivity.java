package com.handcycle;

import android.content.Intent;
import android.os.Handler;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

public class SplashActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        Log.d("SplashActivity", "Splash Screen Start");

        new Handler().postDelayed(new Runnable() {

            @Override
            public void run() {
                Log.d("SplashActivity", "Splash Screen End");

                // Jump to Login Page After 3 Seconds
                Intent i = new Intent(SplashActivity.this, LoginActivity.class);
                startActivity(i);
                finish();
            }
        }, 3000);
    }
}