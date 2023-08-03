package com.tsfrsapp.data.repository;

import com.tsfrsapp.data.DataMappers;
import com.tsfrsapp.data.dto.LocationsModel;
import com.tsfrsapp.data.remote.LocationDao;
import com.tsfrsapp.data.remote.LocationEntity;

import java.util.List;

import javax.inject.Inject;

import io.reactivex.Completable;
import io.reactivex.Flowable;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.schedulers.Schedulers;

public class RoomDBRepoImpl implements RoomDBRepo{
    LocationDao locationDao;
    @Inject
    public RoomDBRepoImpl(LocationDao _locationDao){
        locationDao = _locationDao;
    }
    @Override
    public Flowable<List<LocationsModel>> getAllLocations() {
        return locationDao
                .getAllLocations().map(srcObj -> DataMappers.toExternalLocation(srcObj))
                .subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread());
    }

    @Override
    public Completable insertLocationDetails(LocationEntity location) {
        return locationDao
                .insertLocationDetails(location)
                .subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread());
    }

    @Override
    public void deleteAllLocations() {
        locationDao.deleteAllLocations();
    }
}
