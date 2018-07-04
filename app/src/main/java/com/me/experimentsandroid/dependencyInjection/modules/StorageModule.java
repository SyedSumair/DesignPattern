package com.me.experimentsandroid.dependencyInjection.modules;

import android.content.SharedPreferences;
import android.preference.PreferenceManager;

import com.me.experimentsandroid.MyApplication;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;

/**
 * Created by vivz on 11/09/15.
 */
@Module
public class StorageModule {
    private final MyApplication application;
    public StorageModule(MyApplication application){
        this.application = application;
    }

    @Singleton
    @Provides
    SharedPreferences provideSharedPreferences(){
        return PreferenceManager.getDefaultSharedPreferences(application);
    }
}
