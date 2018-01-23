package com.wustor.routermodule;

import android.content.Context;
import android.content.Intent;
import android.support.v4.app.Fragment;
import android.util.Log;

import com.wustor.basemodule.CommonUtils;

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
            Log.d("error--->", e.toString());
            return null;
        }
        return fragment;
    }


    public static Object getModuleCall(String name) {
        Object object;
        try {
            Class aClass = Class.forName(name);
            object = aClass.newInstance();
        } catch (Exception e) {
            Log.d("error--->", e.toString());
            return null;
        }

        return object;
    }

    public static void startActivityWithName(Context context, String name) {
        try {
            Class clazz = Class.forName(name);
            startActivity(context, clazz);
        } catch (ClassNotFoundException e) {
            CommonUtils.showToast(context, "业务组件单独调试不应该跟其他业务Module产生交互，如果你依然想要在运行期依赖其它组件，那么请参考MainModul");
            Log.d("error--->", e.toString());
        }
    }


    public static void startActivity(Context context, Class clazz) {
        context.startActivity(getIntent(context, clazz));
    }

    public static Intent getIntent(Context context, Class clazz) {
        return new Intent(context, clazz);
    }


}
