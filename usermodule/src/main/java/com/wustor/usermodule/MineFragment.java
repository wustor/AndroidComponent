package com.wustor.usermodule;


import android.support.v4.app.Fragment;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.wustor.basemodule.BaseFragment;
import com.wustor.routermodule.ReflectUtils;


/**
 * A simple {@link Fragment} subclass.
 */
public class MineFragment extends BaseFragment {
    private TextView tvModule;
    private Button btnButton;

    @Override
    protected int getLayoutId() {
        return R.layout.fragment_user;
    }

    @Override
    protected View initView(View parent) {
        tvModule = parent.findViewById(R.id.tv_module);
        btnButton = parent.findViewById(R.id.btn_jump);
        tvModule.setText("用户中心\nUserModule");
        btnButton.setText("跳转订单");
        btnButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ReflectUtils.startActivityWithName(mContext, "com.wustor.ordermodule.OrderActivity");
            }
        });
        return parent;
    }

}
