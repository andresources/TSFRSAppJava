package com.tsfrsapp.ui.profile;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;

import android.content.Intent;
import android.content.IntentFilter;
import android.os.Bundle;
import com.tsfrsapp.R;
import com.tsfrsapp.databinding.ActivityOneTimeConfirmBinding;
import com.tsfrsapp.ui.home.HomeActivity;

public class OneTimeConfirmActivity extends AppCompatActivity {
    private ActivityOneTimeConfirmBinding _binding;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        _binding = DataBindingUtil.setContentView(this,R.layout.activity_one_time_confirm);
        _binding.ivBack.setOnClickListener(v->{
            finish();
        });
        _binding.btnSubmit.setOnClickListener(v->{
            Intent intent = new Intent(OneTimeConfirmActivity.this, HomeActivity.class);
            intent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK|Intent.FLAG_ACTIVITY_CLEAR_TASK );
            startActivity(intent);
            finish();
        });
    }
}