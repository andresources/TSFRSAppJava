package com.tsfrsapp.di;

import com.tsfrsapp.data.repository.RoomDBRepo;
import com.tsfrsapp.data.repository.RoomDBRepoImpl;

import javax.inject.Singleton;

import dagger.Binds;
import dagger.Module;
import dagger.hilt.InstallIn;
import dagger.hilt.components.SingletonComponent;

@Module
@InstallIn(SingletonComponent.class)
public abstract class RoomDBRepoModule {
    @Binds
    @Singleton
    public abstract RoomDBRepo bindsMyInterface(RoomDBRepoImpl repo);
}
