package com.wustor.basemodule;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.text.TextUtils;

/**
 * author chmyy
 * created on 2018/1/21
 * email fat_chao@163.com.
 */

public class CommonUtils {
    public static boolean isAppDebug(Context context) {
        if (TextUtils.isEmpty(context.getPackageName()))
            return false;
        try {
            PackageManager pm = context.getPackageManager();
            ApplicationInfo ai = pm.getApplicationInfo(context.getPackageName(), 0);
            return ai != null && (ai.flags & ApplicationInfo.FLAG_DEBUGGABLE) != 0;
        } catch (PackageManager.NameNotFoundException e) {
            e.printStackTrace();
            return false;
        }
    }

}
