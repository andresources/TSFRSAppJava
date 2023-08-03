package com.tsfrsapp;

import android.app.Application;

import androidx.annotation.NonNull;
import androidx.lifecycle.AndroidViewModel;

import com.tsfrsapp.data.dto.LocationsModel;
import com.tsfrsapp.data.remote.LocationDao;
import com.tsfrsapp.data.remote.LocationEntity;
import com.tsfrsapp.data.repository.RoomDBRepo;

import java.util.List;

import javax.inject.Inject;

import dagger.hilt.android.lifecycle.HiltViewModel;
import io.reactivex.Completable;
import io.reactivex.Flowable;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.schedulers.Schedulers;

@HiltViewModel
public class ProfileViewModel extends AndroidViewModel{
    private RoomDBRepo repo;
    @Inject
    public ProfileViewModel(@NonNull Application application, RoomDBRepo _repo) {
        super(application);
        repo = _repo;
    }

     Completable insertDummyDataToRoomDB(){
        LocationEntity obj = new LocationEntity(1,"1",2,"d",3,"2");
        return repo
                .insertLocationDetails(obj);
    }

    Flowable<List<LocationsModel>> getAllLocations(){
        return repo
                .getAllLocations()
                .subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread());
    }
}
