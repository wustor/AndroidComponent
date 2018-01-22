package com.wustor.ordermodule;

import com.wustor.basemodule.BaseActivity;

public class OrderActivity extends BaseActivity {


    @Override
    protected int getLayoutId() {
        return R.layout.activity_order;
    }

    @Override
    protected void initView() {
        setTitle("订单");

    }
}
