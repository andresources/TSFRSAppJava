package com.tsfrsapp.data.remote;

import androidx.room.Database;
import androidx.room.RoomDatabase;

@Database(entities = {LocationEntity.class}, version = 2)
public abstract class AppDatabase extends RoomDatabase {

    public abstract LocationDao locationDao();

}
