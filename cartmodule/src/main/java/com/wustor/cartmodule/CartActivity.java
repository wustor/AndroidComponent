package com.wustor.cartmodule;

import com.wustor.basemodule.BaseActivity;

public class CartActivity extends BaseActivity {


    @Override
    protected int getLayoutId() {
        return R.layout.activity_cart;
    }

    @Override
    protected void initView() {
        setTitle("购物车");
    }

}
