package com.wustor.goodsmodule;


import android.view.View;

import com.alibaba.android.arouter.facade.annotation.Route;
import com.wustor.basemodule.BaseFragment;

@Route(path = "/com/wustor/goodsmodule/HomeFragment")
public class HomeFragment extends BaseFragment {

    @Override
    protected int getLayoutId() {
        return R.layout.fragment_home;
    }

    @Override
    protected View initView(View parent) {
        return parent;
    }

}
