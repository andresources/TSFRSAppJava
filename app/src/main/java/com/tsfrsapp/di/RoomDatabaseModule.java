package com.tsfrsapp.di;

import android.content.Context;

import androidx.room.Room;

import com.tsfrsapp.data.remote.AppDatabase;
import com.tsfrsapp.data.remote.LocationDao;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;
import dagger.hilt.InstallIn;
import dagger.hilt.android.qualifiers.ApplicationContext;
import dagger.hilt.components.SingletonComponent;

@Module
@InstallIn(SingletonComponent.class)
public class RoomDatabaseModule {
    @Provides
    @Singleton
    public static AppDatabase provideAppDatabase(@ApplicationContext Context context) {
        return Room.databaseBuilder(
                context.getApplicationContext(),
                AppDatabase.class,
                "tsfrs.db").fallbackToDestructiveMigration().build();
    }

    @Provides
    @Singleton
    public static LocationDao provideLocationDao(AppDatabase appDB) {
        return appDB.locationDao();
    }

}
