package com.me.experimentsandroid.dependencyInjection.modules;


import com.me.experimentsandroid.dependencyInjection.Contracts.MyExample;
import com.me.experimentsandroid.dependencyInjection.MyExampleImpl;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;


@Module
public class DateModule {
    @Provides
    @Singleton
    static MyExample provideMyExample() {
        return new MyExampleImpl();
    }
}
