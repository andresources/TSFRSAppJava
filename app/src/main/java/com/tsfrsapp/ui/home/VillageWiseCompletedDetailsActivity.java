package com.tsfrsapp.ui.home;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;

import android.os.Bundle;

import com.tsfrsapp.R;
import com.tsfrsapp.databinding.ActivityVillageWiseCompletedDetailsBinding;
import com.tsfrsapp.ui.home.adapter.MandalWiseCompletedSchoolAdapter;
import com.tsfrsapp.ui.home.adapter.VillageWiseCompletedSchoolsAdapter;
import com.tsfrsapp.ui.model.MandalWiseCompletedSchoolModel;
import com.tsfrsapp.ui.model.VillageWiseCompletedSchoolModel;

import java.util.ArrayList;
import java.util.List;

public class VillageWiseCompletedDetailsActivity extends AppCompatActivity {
    private ActivityVillageWiseCompletedDetailsBinding _binding;
    List<VillageWiseCompletedSchoolModel> list = new ArrayList<>();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        _binding = DataBindingUtil.setContentView(this,R.layout.activity_village_wise_completed_details);
        dummyData();
        _binding.rv.setAdapter(new VillageWiseCompletedSchoolsAdapter(list,this));
        _binding.header.ivBack.setOnClickListener(v->{
            finish();
        });
    }
    private void dummyData(){
        list.clear();
        list.add(new VillageWiseCompletedSchoolModel(1,"ZPHS abdullapur school","1st to 5th",140));
        list.add(new VillageWiseCompletedSchoolModel(1,"Government High School","1st to 10th",49));
        list.add(new VillageWiseCompletedSchoolModel(0,"Government School","1st to 5th",35));
    }
}