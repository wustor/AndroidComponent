package com.wustor.basemodule;

import android.app.Application;
import android.content.Context;
import android.support.multidex.MultiDex;

import com.alibaba.android.arouter.launcher.ARouter;

public class ModuleApplication extends Application {

    private static ModuleApplication instance;

    @Override
    public void onCreate() {
        super.onCreate();
        if (CommonUtils.isAppDebug(getApplicationContext())) {
            ARouter.openDebug();
            ARouter.openLog();
        }
        ARouter.init(this);

    }




    public static ModuleApplication getInstance() {
        return instance;
    }

    @Override
    protected void attachBaseContext(Context base) {
        super.attachBaseContext(base);
        // 65535
        MultiDex.install(this);
    }
}
