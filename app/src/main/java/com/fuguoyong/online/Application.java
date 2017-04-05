package com.fuguoyong.online;

import cn.jpush.android.api.JPushInterface;

/**
 * Created by Administrator on 2017/3/30.
 */

public class Application extends android.app.Application {
    @Override
    public void onCreate() {
        super.onCreate();
        JPushInterface.setDebugMode(true);
        JPushInterface.init(this);
    }
}
