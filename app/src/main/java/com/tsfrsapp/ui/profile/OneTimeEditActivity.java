package com.tsfrsapp.ui.profile;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;
import android.os.Bundle;
import com.tsfrsapp.R;
import com.tsfrsapp.databinding.ActivityOneTimeEditBinding;

public class OneTimeEditActivity extends AppCompatActivity {
    private ActivityOneTimeEditBinding _binding;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        _binding = DataBindingUtil.setContentView(this,R.layout.activity_one_time_edit);
        _binding.ivBack.setOnClickListener(v->{
            finish();
        });
    }
}