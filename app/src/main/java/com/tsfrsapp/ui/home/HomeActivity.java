package com.tsfrsapp.ui.home;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.tsfrsapp.R;
import com.tsfrsapp.databinding.ActivityHomeBinding;
import com.tsfrsapp.ui.home.adapter.MandalWiseCompletedSchoolAdapter;
import com.tsfrsapp.ui.model.MandalWiseCompletedSchoolModel;

import java.util.ArrayList;
import java.util.List;

public class HomeActivity extends AppCompatActivity {
    List<MandalWiseCompletedSchoolModel> list = new ArrayList<>();
    private ActivityHomeBinding _binding;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        _binding = DataBindingUtil.setContentView(this,R.layout.activity_home);
        dummyData();
        _binding.rv.setAdapter(new MandalWiseCompletedSchoolAdapter(list,this));
    }
    private void dummyData(){
        list.clear();
        list.add(new MandalWiseCompletedSchoolModel("abdullapurmet",35,140,60f));
        list.add(new MandalWiseCompletedSchoolModel("amangal",12,49,0f));
    }
}