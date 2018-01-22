package com.wustor.usermodule;


import android.support.v4.app.Fragment;
import android.view.View;

import com.wustor.basemodule.BaseFragment;


/**
 * A simple {@link Fragment} subclass.
 */
public class MineFragment extends BaseFragment {
    public MineFragment() {
    }

    @Override
    protected int getLayoutId() {
        return R.layout.fragment_user;
    }

    @Override
    protected View initView(View parent) {
        return parent;
    }

}
