package com.wustor.usermodule;


import android.support.v4.app.Fragment;
import android.view.View;

import com.alibaba.android.arouter.facade.annotation.Route;
import com.wustor.basemodule.BaseFragment;


/**
 * A simple {@link Fragment} subclass.
 */
@Route(path = "/com/wustor/usermodule/MineFragment")
public class MineFragment extends BaseFragment {

    @Override
    protected int getLayoutId() {
        return R.layout.fragment_user;
    }

    @Override
    protected View initView(View parent) {
        return parent;
    }

}
