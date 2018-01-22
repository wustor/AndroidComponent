package com.wustor.basemodule;

import java.util.concurrent.ConcurrentHashMap;

/**
 * author chmyy
 * created on 2018/1/22
 * email fat_chao@163.com.
 */

public class RouterFactory {

    private ConcurrentHashMap<String, Object> routerMap;

    public RouterFactory getRouterFactory() {
        return InnerFactory.factory;
    }

    public static class InnerFactory {
        static RouterFactory factory;

        static {
            factory = new RouterFactory();
        }

    }

    private RouterFactory() {
        routerMap = new ConcurrentHashMap<>();
    }


    //添加Fragment
    public static void addFrament(String className) {

    }

    //获取Fragment
    public static void getFragment(String className) {

    }

    //添加Callback
    public static void addCallback(String className) {

    }

    //获取Callback

    public static void getCallback(String className) {

    }
}
