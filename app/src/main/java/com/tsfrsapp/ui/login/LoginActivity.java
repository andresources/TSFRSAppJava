package com.tsfrsapp.ui.login;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;

import android.content.Intent;
import android.os.Bundle;
import android.widget.EditText;

import com.tsfrsapp.R;
import com.tsfrsapp.databinding.ActivityLoginBinding;
import com.tsfrsapp.ui.profile.OneTimeRegistrationActivity;

public class LoginActivity extends AppCompatActivity {
    private ActivityLoginBinding _binding;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        _binding = DataBindingUtil.setContentView(this,R.layout.activity_login);
        _binding.btnLogin.setOnClickListener( view ->{
            startActivity(new Intent(LoginActivity.this, OneTimeRegistrationActivity.class));
            finish();
        });
    }
}