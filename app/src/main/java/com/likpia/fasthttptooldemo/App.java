package com.likpia.fasthttptooldemo;

import android.app.Application;

import com.likpia.fasthttptool.CommonUtils;
import com.likpia.fasthttptool.http.MyRequestTool;


public class App extends Application {
    @Override
    public void onCreate() {
        super.onCreate();
        MyRequestTool.init(this);
        CommonUtils.enableNotification(this,android.R.drawable.sym_def_app_icon,android.R.drawable.sym_def_app_icon);
    }
}