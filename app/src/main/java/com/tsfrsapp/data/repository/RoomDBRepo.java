package com.tsfrsapp.data.repository;

import com.tsfrsapp.data.dto.LocationsModel;
import com.tsfrsapp.data.remote.LocationEntity;

import java.util.List;

import io.reactivex.Completable;
import io.reactivex.Flowable;

public interface RoomDBRepo {
    Flowable<List<LocationsModel>> getAllLocations();

    Completable insertLocationDetails(LocationEntity location);

    void deleteAllLocations();
}
