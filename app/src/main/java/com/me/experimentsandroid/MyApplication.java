package com.me.experimentsandroid;

import android.app.Application;

import com.me.experimentsandroid.dependencyInjection.component.DaggerMyComponent;
import com.me.experimentsandroid.dependencyInjection.component.MyComponent;
import com.me.experimentsandroid.dependencyInjection.modules.DateModule;
import com.me.experimentsandroid.dependencyInjection.modules.StorageModule;

/**
 * Created by vivz on 11/09/15.
 */
public class MyApplication extends Application{
    MyComponent component;

    @Override
    public void onCreate() {
        super.onCreate();
        component = DaggerMyComponent
                .builder()
                .storageModule(new StorageModule(this))
                .dateModule(new DateModule())
                .build();
    }

    public MyComponent getComponent() {
        return component;
    }
}
