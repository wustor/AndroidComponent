package com.wustor.basemodule;

import android.content.Context;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/**
 * author chmyy
 * created on 2018/1/22
 * email fat_chao@163.com.
 */

public abstract class BaseFragment extends Fragment {
    protected Context mContext;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        mContext = getActivity();
        ViewGroup view = (ViewGroup) inflater.inflate(getLayoutId(), container, false);
        return initView(view);
    }

    protected abstract int getLayoutId();

    protected abstract View initView(View parent);



}
