package com.tsfrsapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;
import androidx.lifecycle.ViewModelProvider;

import android.os.Bundle;

import com.tsfrsapp.data.remote.LocationDao;
import com.tsfrsapp.databinding.ActivityMainBinding;

import javax.inject.Inject;

import dagger.hilt.android.AndroidEntryPoint;
import io.reactivex.disposables.CompositeDisposable;

@AndroidEntryPoint
public class DummyActivity extends AppCompatActivity {
    @Inject
    LocationDao student;
    private ActivityMainBinding _binding;
    private final CompositeDisposable mDisposable = new CompositeDisposable();
    private DummyViewModel profileViewModel;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        _binding = DataBindingUtil.setContentView(this,R.layout.activity_main);
        profileViewModel = new ViewModelProvider(this).get(DummyViewModel.class);
        mDisposable
                .add(
                    profileViewModel.insertDummyDataToRoomDB()
                    .subscribe(()-> {
                                _binding.tv.setText("Inserted");
                            },
                            throwable -> {
                                _binding.tv.setText("Error"+throwable.getMessage());
                            }
                        )//subscribe method end here
                );

        mDisposable
                .add(
                    profileViewModel.getAllLocations()
                    .subscribe(data-> {
                                _binding.tv.setText("Size : "+data.size());
                            },
                            throwable -> {
                                    _binding.tv.setText("Error"+throwable.getMessage());
                            }
                        )//subscribe method end here
                );
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        mDisposable.dispose();
    }
}