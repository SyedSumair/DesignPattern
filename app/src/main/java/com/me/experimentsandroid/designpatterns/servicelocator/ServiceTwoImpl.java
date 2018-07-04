package com.me.experimentsandroid.designpatterns.servicelocator;

import com.me.experimentsandroid.designpatterns.servicelocator.contracts.Service;

public class ServiceTwoImpl implements Service {
    public void execute(){
        System.out.println("Executing Service2");
    }

    @Override
    public String getName() {
        return "ServiceTwoImpl";
    }
}
