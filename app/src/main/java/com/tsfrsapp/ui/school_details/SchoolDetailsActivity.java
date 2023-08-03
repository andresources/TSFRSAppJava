package com.tsfrsapp.ui.school_details;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;

import android.content.Intent;
import android.os.Bundle;

import com.tsfrsapp.R;
import com.tsfrsapp.databinding.ActivitySchoolDetailsBinding;
import com.tsfrsapp.ui.staff_training.AddStaffTrainingActivity;

public class SchoolDetailsActivity extends AppCompatActivity {
    private ActivitySchoolDetailsBinding _binding;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        _binding = DataBindingUtil.setContentView(this,R.layout.activity_school_details);
        _binding.rlTraingDetails.setOnClickListener(v->{
            startActivity(new Intent(SchoolDetailsActivity.this, AddStaffTrainingActivity.class));
        });
        _binding.header.ivBack.setOnClickListener(v->{
            finish();
        });
    }
}