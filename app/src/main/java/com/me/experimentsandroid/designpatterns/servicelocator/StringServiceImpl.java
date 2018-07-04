package com.me.experimentsandroid.designpatterns.servicelocator;

import com.me.experimentsandroid.designpatterns.servicelocator.contracts.StringService;

public class StringServiceImpl implements StringService{


    @Override
    public int getLength(String s) {
        return s.length();
    }

}
