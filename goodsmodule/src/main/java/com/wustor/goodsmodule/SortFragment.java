package com.wustor.goodsmodule;


import android.support.v4.app.Fragment;
import android.view.View;

import com.alibaba.android.arouter.facade.annotation.Route;
import com.wustor.basemodule.BaseFragment;


/**
 * A simple {@link Fragment} subclass.
 */

@Route(path = "/com/wustor/goodsmodule/SortFragment")
public class SortFragment extends BaseFragment {

    @Override
    protected int getLayoutId() {
        return R.layout.fragment_sort;
    }

    @Override
    protected View initView(View parent) {
        return parent;
    }

}
