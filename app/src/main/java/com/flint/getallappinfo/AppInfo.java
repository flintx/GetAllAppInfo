package com.flint.getallappinfo;

import android.graphics.drawable.Drawable;
import android.util.Log;

/**
 * Created by Administrator on 2016/3/19.
 */
public class AppInfo {
    public String appName = "";
    public String packageName = "";
    public String versionName = "";
    public int versionCode = 0;
    public Drawable appIcon = null;

    public void print() {
        Log.v("appInfo", "Name:" + appName + " Package:" + packageName);
        Log.v("appInfo", "Name:" + appName + " versionName:" + versionName);
        Log.v("appInfo", "Name:" + appName + " versionCode:" + versionCode);
    }

}