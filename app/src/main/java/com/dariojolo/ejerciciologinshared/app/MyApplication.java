package com.dariojolo.ejerciciologinshared.app;

import android.app.Application;
import android.os.SystemClock;

/**
 * Created by Dario on 19/3/2017.
 */

public class MyApplication extends Application {
    @Override
    public void onCreate() {
        super.onCreate();
        SystemClock.sleep(3000);
    }
}
