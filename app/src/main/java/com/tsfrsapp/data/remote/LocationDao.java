package com.tsfrsapp.data.remote;

import androidx.room.Dao;
import androidx.room.Insert;
import androidx.room.OnConflictStrategy;
import androidx.room.Query;

import java.util.List;

import io.reactivex.Completable;
import io.reactivex.Flowable;

@Dao
public interface LocationDao {
    @Query("select * from tb_location")
    Flowable<List<LocationEntity>> getAllLocations();

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    Completable insertLocationDetails(LocationEntity location);

    @Query("DELETE FROM tb_location")
    void deleteAllLocations();
}
