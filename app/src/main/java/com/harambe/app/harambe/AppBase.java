package com.harambe.app.harambe;

import android.app.Application;


/**
 * Created by deep on 8/24/16.
 * the application singleton class
 */
public class AppBase extends Application {

    //TODO change to false when in production
    public static final boolean DEBUG = true;

    public static AppBase instance;

    public static boolean isDebug() {
        return DEBUG;
    }

    @Override
    public void onCreate() {
        super.onCreate();
        AppBase.instance = this;

    }


}
