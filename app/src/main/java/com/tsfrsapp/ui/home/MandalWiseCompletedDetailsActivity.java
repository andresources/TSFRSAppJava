package com.tsfrsapp.ui.home;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;

import android.os.Bundle;

import com.tsfrsapp.R;
import com.tsfrsapp.databinding.ActivityMandalWiseCompletedDetailsBinding;
import com.tsfrsapp.ui.home.adapter.DistrictWiseCompletedSchoolAdapter;
import com.tsfrsapp.ui.home.adapter.MandalWiseCompletedSchoolAdapter;
import com.tsfrsapp.ui.model.DistrictWiseCompletedSchoolModel;
import com.tsfrsapp.ui.model.MandalWiseCompletedSchoolModel;

import java.util.ArrayList;
import java.util.List;

public class MandalWiseCompletedDetailsActivity extends AppCompatActivity {
    List<MandalWiseCompletedSchoolModel> list = new ArrayList<>();
    private ActivityMandalWiseCompletedDetailsBinding _binding;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        _binding = DataBindingUtil.setContentView(this,R.layout.activity_mandal_wise_completed_details);
        dummyData();
        _binding.rv.setAdapter(new MandalWiseCompletedSchoolAdapter(list,this));
        _binding.header.ivBack.setOnClickListener(v->{
            finish();
        });
    }
    private void dummyData(){
        list.clear();
        list.add(new MandalWiseCompletedSchoolModel("abdullapur",35,140,60f));
        list.add(new MandalWiseCompletedSchoolModel("Anajapur",12,49,10f));
        list.add(new MandalWiseCompletedSchoolModel("Bacharam",25,35,0f));
    }
}