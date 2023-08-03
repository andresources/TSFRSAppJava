package com.tsfrsapp.di.dummy;

import javax.inject.Singleton;

import dagger.Binds;
import dagger.Module;
import dagger.hilt.InstallIn;
import dagger.hilt.components.SingletonComponent;

@Module
@InstallIn(SingletonComponent.class)
public abstract class DatabaseRepoModule {
    @Binds
    @Singleton
    public abstract MyInterface bindsMyInterface(MyInterfaceImpl myInterface);
}
