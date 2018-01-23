package com.wustor.cartmodule;

import android.content.Context;

import com.wustor.basemodule.CommonUtils;
import com.wustor.routermodule.CartModuleService;

import java.math.MathContext;

/**
 * author chmyy
 * created on 2018/1/21
 * email fat_chao@163.com.
 */

public class CartServiceImpl implements CartModuleService {
    private Context context;

    @Override
    public void initContext(Context context) {
        this.context = context;
    }

    @Override
    public void getCartAmount() {
        CommonUtils.showToast(context,"我在购物车中被调用了");

    }
}
