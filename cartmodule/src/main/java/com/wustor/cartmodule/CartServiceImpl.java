package com.wustor.cartmodule;

import android.content.Context;

import com.wustor.routermodule.AppService;
import com.wustor.routermodule.CartMoudleService;
import com.wustor.routermodule.Path;
import com.wustor.routermodule.ReflectUtils;

/**
 * author chmyy
 * created on 2018/1/21
 * email fat_chao@163.com.
 */

public class CartServiceImpl implements CartMoudleService {
    @Override
    public void initContext(Context context) {
        AppService appService = (AppService) ReflectUtils.getModuleCall(Path.APP_SERVICE);

    }
}
