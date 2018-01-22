package com.wustor.goodsmodule;

import com.wustor.basemodule.BaseActivity;

public class GoodsDetailActivity extends BaseActivity {


    @Override
    protected int getLayoutId() {
        return R.layout.activity_goods_detail;
    }

    @Override
    protected void initView() {
        setTitle("商品详情");

    }
}
