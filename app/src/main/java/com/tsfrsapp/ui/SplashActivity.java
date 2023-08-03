package com.tsfrsapp.ui;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.splashscreen.SplashScreen;
import androidx.core.splashscreen.SplashScreenViewProvider;

import android.content.Intent;
import android.os.Bundle;

import com.tsfrsapp.MainActivity;
import com.tsfrsapp.R;
import com.tsfrsapp.ui.login.LoginActivity;

public class SplashActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        SplashScreen splashScreen = SplashScreen.installSplashScreen(this);
        setContentView(R.layout.activity_splash);
        startActivity(new Intent(SplashActivity.this, LoginActivity.class));
        finish();
        /*splashScreen.setOnExitAnimationListener(splashScreenViewProvider ->
        {
            startActivity(new Intent(SplashActivity.this, LoginActivity.class));
        });*/
    }
}