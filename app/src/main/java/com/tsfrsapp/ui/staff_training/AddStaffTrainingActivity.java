package com.tsfrsapp.ui.staff_training;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;

import android.os.Bundle;

import com.tsfrsapp.R;
import com.tsfrsapp.databinding.ActivityAddStaffTrainingBinding;

public class AddStaffTrainingActivity extends AppCompatActivity {
    private ActivityAddStaffTrainingBinding _binding;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        _binding = DataBindingUtil.setContentView(this,R.layout.activity_add_staff_training);
        _binding.header.ivBack.setOnClickListener(v->{
            finish();
        });
    }
}