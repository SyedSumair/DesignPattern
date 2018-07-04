package com.me.experimentsandroid.designpatterns.servicelocator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

import com.me.experimentsandroid.R;
import com.me.experimentsandroid.designpatterns.servicelocator.contracts.Service;
import com.me.experimentsandroid.designpatterns.servicelocator.contracts.StringService;

public class ServiceLocatorActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_service_locator);

        Service service = (Service) ServiceLocator.getService(ServiceOneImpl.class.getSimpleName());
        StringService stringService= (StringService) ServiceLocator.getService(StringServiceImpl.class.getSimpleName());

        Service service2 = (Service) ServiceLocator.getService(ServiceOneImpl.class.getSimpleName());
        StringService stringService2 = (StringService) ServiceLocator.getService(StringServiceImpl.class.getSimpleName());

        Log.d("testing",stringService2.getLength("Sumair")+"");



    }
}
