package com.wustor.basemodule;

import android.content.Context;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.TextView;

public abstract class BaseActivity extends AppCompatActivity {
    protected Toolbar mToolbar;
    protected TextView mTitle;
    protected Context mContext;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        mContext = this;
        setContentView(getLayoutId());
        initToolbar();
        initView();
    }

    protected abstract int getLayoutId();

    protected abstract void initView();


    protected void initToolbar() {
        mToolbar = findViewById(R.id.toolbar);
        mTitle = findViewById(R.id.tv_title);
        if (mToolbar != null) {
            if (mToolbar.getVisibility() == View.GONE)
                mToolbar.setVisibility(View.VISIBLE);
            mToolbar.setNavigationIcon(R.mipmap.arrow_back);
            mToolbar.setNavigationOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    onLeftClick();
                }
            });
        }

    }

    //点击事件
    private void onLeftClick() {
        finish();

    }

    //设置标题
    protected void setTitle(String title) {
        mTitle.setText(title);
    }
}
