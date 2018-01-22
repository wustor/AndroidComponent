package com.wustor.cartmodule;


import android.view.View;
import android.widget.TextView;

import com.alibaba.android.arouter.facade.annotation.Route;
import com.wustor.basemodule.BaseFragment;

@Route(path = "/com/wustor/cartmodule/CartFragment")
public class CartFragment extends BaseFragment {
    TextView tvTitle;

    @Override
    protected int getLayoutId() {
        return R.layout.fragment_cart;
    }

    @Override
    protected View initView(View parent) {
        tvTitle = parent.findViewById(R.id.tv_title);
        tvTitle.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {


            }
        });
        return parent;
    }

}
