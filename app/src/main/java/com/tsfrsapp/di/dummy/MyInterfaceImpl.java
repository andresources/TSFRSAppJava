package com.tsfrsapp.di.dummy;

import javax.inject.Inject;

public class MyInterfaceImpl implements MyInterface{
    @Inject
    public MyInterfaceImpl(){

    }

    @Override
    public String getName() {
        return "This is impl - 1";
    }
}
