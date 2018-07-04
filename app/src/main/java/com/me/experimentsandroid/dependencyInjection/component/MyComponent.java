package com.me.experimentsandroid.dependencyInjection.component;

import com.me.experimentsandroid.dependencyInjection.FragmentA;
import com.me.experimentsandroid.dependencyInjection.FragmentB;
import com.me.experimentsandroid.dependencyInjection.modules.DateModule;
import com.me.experimentsandroid.dependencyInjection.modules.StorageModule;

import javax.inject.Singleton;

import dagger.Component;


/**
 * Created by vivz on 11/09/15.
 */
@Singleton
@Component(modules = {StorageModule.class, DateModule.class})
public interface MyComponent {
    void inject(FragmentA fragmentA);
    void inject(FragmentB fragmentB);
}
