package com.me.experimentsandroid.designpatterns.servicelocator;

import android.util.Log;

import java.util.ArrayList;
import java.util.List;

public class Cache<T> {

    private List<Object> services;


    public Cache() {
        this.services = new ArrayList<Object>();
    }

    public Object getService(String serviceName) {
        for (Object service : services) {
            if(service.getClass().getSimpleName().equalsIgnoreCase(serviceName)){
                Log.d("testing", "Returning cached  " + serviceName + " object");
                return service;
            }
            else if (service.getClass().getSimpleName().equalsIgnoreCase(serviceName)) {
                Log.d("testing", "Returning cached  " + serviceName + " object");
                return service;
            }
        }
        return null;
    }

    public void addService(Object newService){
        boolean exists = false;

        for (Object service: services){
            if (service.getClass().getSimpleName().equalsIgnoreCase(newService.getClass().getSimpleName())){
                exists = true;
            }
        }


        if (!exists){
            services.add(newService);
        }
    }

}
