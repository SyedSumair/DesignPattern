package com.me.experimentsandroid.designpatterns.servicelocator;

import com.me.experimentsandroid.designpatterns.servicelocator.contracts.Service;

public class ServiceOneImpl  implements Service {
    public void execute(){
        System.out.println("Executing Service1");
    }

    @Override
    public String getName() {
        return "ServiceOneImpl";
    }
}
