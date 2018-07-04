package com.me.experimentsandroid.designpatterns.servicelocator;

import android.util.Log;

public class InitialContext {
    public Object lookup(String jndiName) {


        if (jndiName.equalsIgnoreCase("ServiceOneImpl")) {
            Log.d("testing","Looking up and creating a new ServiceOneImpl object");
            return new ServiceOneImpl();
        } else if (jndiName.equalsIgnoreCase("ServiceTwoImpl")) {
            Log.d("testing","Looking up and creating a new ServiceTwoImpl object");
            return new ServiceTwoImpl();
        }
        else if (jndiName.equalsIgnoreCase("StringServiceImpl")) {
            Log.d("testing","Looking up and creating a new StringServiceImpl object");
            return new StringServiceImpl();
        }

        return null;
    }
}
