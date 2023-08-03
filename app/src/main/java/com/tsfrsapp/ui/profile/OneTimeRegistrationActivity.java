package com.tsfrsapp.ui.profile;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;

import android.content.Intent;
import android.os.Bundle;

import com.tsfrsapp.R;
import com.tsfrsapp.databinding.ActivityOneTimeRegistrationBinding;
import com.tsfrsapp.ui.login.LoginActivity;

public class OneTimeRegistrationActivity extends AppCompatActivity {
    private ActivityOneTimeRegistrationBinding _binding;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        _binding = DataBindingUtil.setContentView(this,R.layout.activity_one_time_registration);
        _binding.btnEdit.setOnClickListener( v-> {
            startActivity(new Intent(OneTimeRegistrationActivity.this, OneTimeEditActivity.class));
        });
    }

    @Override
    public void onBackPressed() {
        super.onBackPressed();
        finish();
    }
}