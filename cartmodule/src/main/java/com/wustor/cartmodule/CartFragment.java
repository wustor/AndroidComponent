package com.wustor.cartmodule;


import android.view.View;
import android.widget.TextView;

import com.wustor.basemodule.BaseFragment;


public class CartFragment extends BaseFragment {

    public CartFragment() {
    }

    @Override
    protected int getLayoutId() {
        return R.layout.fragment_cart;
    }

    @Override
    protected View initView(View parent) {
        TextView tvTitle = parent.findViewById(R.id.tv_title);
        return parent;
    }

}
