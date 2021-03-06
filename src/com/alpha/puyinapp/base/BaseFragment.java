package com.alpha.puyinapp.base;

import android.annotation.SuppressLint;
import android.annotation.TargetApi;
import android.app.Activity;
import android.os.Build;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/**
 * @author SongJian
 * @created 2016/3/9.
 * @e-mail 1129574214@qq.com
 * 
 * 
 */

@TargetApi(Build.VERSION_CODES.HONEYCOMB)
@SuppressLint("NewApi")
public abstract class BaseFragment extends Fragment {
    protected Activity mActivity;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater,
            @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        mActivity = getActivity();
        return initView(inflater, container, savedInstanceState);
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        initData();
    }

    protected void initData() {

    }

    @Override
    public void onDestroy() {
        super.onDestroy();
        mActivity = null;
    }

    protected abstract View initView(LayoutInflater inflater,
            ViewGroup container, Bundle savedInstanceState);
}
