package com.me.experimentsandroid.designpatterns.servicelocator;

public class ServiceLocator {
    private static Cache cache;

    static {
        cache = new Cache();
    }


    public static Object getService(String jndiName){
        Object service = cache.getService(jndiName);

        if (service!= null){
            return  service;
        }

        InitialContext initialContext = new InitialContext();
        service = initialContext.lookup(jndiName);
        cache.addService(service);
        return service;
    }
}
