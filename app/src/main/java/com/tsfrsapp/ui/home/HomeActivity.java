package com.tsfrsapp.ui.home;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;

import android.os.Bundle;
import android.view.View;

import com.tsfrsapp.R;
import com.tsfrsapp.databinding.ActivityHomeBinding;
import com.tsfrsapp.ui.home.adapter.DistrictWiseCompletedSchoolAdapter;
import com.tsfrsapp.ui.model.DistrictWiseCompletedSchoolModel;

import java.util.ArrayList;
import java.util.List;

public class HomeActivity extends AppCompatActivity {
    List<DistrictWiseCompletedSchoolModel> list = new ArrayList<>();
    private ActivityHomeBinding _binding;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        _binding = DataBindingUtil.setContentView(this,R.layout.activity_home);
        dummyData();
        _binding.rv.setAdapter(new DistrictWiseCompletedSchoolAdapter(list,this));
        _binding.header.ivBack.setVisibility(View.GONE);
    }
    private void dummyData(){
        list.clear();
        list.add(new DistrictWiseCompletedSchoolModel("abdullapurmet",35,140,60f));
        list.add(new DistrictWiseCompletedSchoolModel("amangal",12,49,0f));
    }
}