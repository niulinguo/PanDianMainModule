package com.niles.pandianmainmodule;

import android.app.Application;

import com.niles.appbase.AppManager;

/**
 * Created by Niles
 * Date 2018/10/15 14:25
 * Email niulinguo@163.com
 */
public class MyApp extends Application {

    @Override
    public void onCreate() {
        super.onCreate();
        AppManager.init(this, BuildConfig.DEBUG);
    }
}
