package com.wustor.androidcomponent.debug;

import com.wustor.androidcomponent.R;
import com.wustor.basemodule.BaseActivity;

public class MainDebugActivity extends BaseActivity {


    @Override
    protected int getLayoutId() {
        return R.layout.activity_main_debug;
    }

    @Override
    protected void initView() {
        setTitle("主页面");
    }
}
