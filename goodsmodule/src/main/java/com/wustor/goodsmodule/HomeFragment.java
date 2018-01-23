package com.wustor.goodsmodule;


import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.wustor.basemodule.BaseFragment;
import com.wustor.routermodule.ReflectUtils;

public class HomeFragment extends BaseFragment {

    private TextView tvModule;
    private Button btnButton;

    @Override
    protected int getLayoutId() {
        return R.layout.fragment_home;
    }

    @Override
    protected View initView(View parent) {
        tvModule = parent.findViewById(R.id.tv_module);
        btnButton = parent.findViewById(R.id.btn_jump);
        tvModule.setText("首页\nGoodsModule");
        btnButton.setText("跳转到商品详情");
        btnButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ReflectUtils.startActivityWithName(mContext, "com.wustor.goodsmodule.GoodsDetailActivity");
            }
        });
        return parent;
    }

}
