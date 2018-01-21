package com.wustor.routermodule;

import android.content.Context;
import android.content.Intent;
import android.support.v4.app.Fragment;

/**
 * author chmyy
 * created on 2018/1/21
 * email fat_chao@163.com.
 */

public class ReflectUtils {

    public static Fragment getFragment(String name) {
        Fragment fragment;
        try {
            Class fragmentClass = Class.forName(name);
            fragment = (Fragment) fragmentClass.newInstance();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
        return fragment;
    }


    public static Object getModuleCall(String name) {
        Object object;
        try {
            Class aClass = Class.forName(name);
            object = aClass.newInstance();

        } catch (Exception e) {
            throw new RuntimeException(e);
        }

        return object;
    }

    public static void startActivityWithName(Context context, String name) {
        try {
            Class clazz = Class.forName(name);
            startActivity(context, clazz);
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
    }


    public static void startActivity(Context context, Class clazz) {
        context.startActivity(getIntent(context, clazz));
    }

    public static Intent getIntent(Context context, Class clazz) {
        return new Intent(context, clazz);
    }


}
