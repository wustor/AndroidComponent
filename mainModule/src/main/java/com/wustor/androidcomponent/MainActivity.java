package com.wustor.androidcomponent;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentTransaction;
import android.widget.RadioButton;
import android.widget.RadioGroup;

import com.wustor.basemodule.BaseActivity;
import com.wustor.basemodule.CommonUtils;
import com.wustor.routermodule.ReflectUtils;

public class MainActivity extends BaseActivity {
    RadioButton bottomHome;
    RadioGroup radioGroup;
    private Fragment[] list;


    @Override
    protected int getLayoutId() {
        return R.layout.activity_main;
    }

    @Override
    protected void initView() {
        bottomHome = findViewById(R.id.bottom_home);
        radioGroup = findViewById(R.id.radioGroup);
        radioGroup.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                switch (checkedId) {
                    case R.id.bottom_home:
                        changeFragment(1);
                        break;
                    case R.id.bottom_sort:
                        changeFragment(2);
                        break;
                    case R.id.bottom_cart:
                        changeFragment(3);
                        break;
                    case R.id.bottom_user:
                        changeFragment(4);
                        break;
                }
            }
        });
        Fragment fragmentHome = ReflectUtils.getFragment("com.wustor.goodsmodule.HomeFragment");
        Fragment fragmentSort = ReflectUtils.getFragment("com.wustor.goodsmodule.SortFragment");
        Fragment fragmentCart = ReflectUtils.getFragment("com.wustor.cartmodule.CartFragment");
        Fragment fragmentMine = ReflectUtils.getFragment("com.wustor.usermodule.MineFragment");
        if (fragmentHome == null || fragmentSort == null || fragmentCart == null || fragmentMine == null) {
            CommonUtils.showToast(mContext, "业务组件单独调试不应该跟其他业务Module产生交互，如果你依然想要在运行期依赖其它组件，那么请参考MainModule");

        } else {
            list = new Fragment[]{fragmentHome, fragmentSort, fragmentCart, fragmentMine};
            FragmentTransaction beginTransaction = getSupportFragmentManager().beginTransaction();
            beginTransaction.setTransition(FragmentTransaction.TRANSIT_FRAGMENT_OPEN);
            beginTransaction.add(R.id.main, fragmentHome);
            beginTransaction.add(R.id.main, fragmentSort);
            beginTransaction.add(R.id.main, fragmentCart);
            beginTransaction.add(R.id.main, fragmentMine);
            beginTransaction.commit();
            showHome();
        }


    }


    public void showHome() {
        bottomHome.setChecked(true);
        changeFragment(1);
    }

    public void changeFragment(int index) {
        FragmentTransaction fragmentTransaction = getSupportFragmentManager().beginTransaction();
        for (int i = 0; i < list.length; i++) {
            if (i + 1 != index) {
                // 隐藏选项卡
                fragmentTransaction.hide(list[i]);
            } else {
                // 显示选项卡
                fragmentTransaction.show(list[i]);

            }
        }
        fragmentTransaction.commitAllowingStateLoss();
    }
}
