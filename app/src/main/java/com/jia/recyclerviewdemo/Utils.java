package com.jia.recyclerviewdemo;

import android.content.res.Resources;

public class Utils {


    public static int getWidthPixels() {
        return Resources.getSystem().getDisplayMetrics().widthPixels;
    }

    public static int getHeightPixels() {
        return Resources.getSystem().getDisplayMetrics().heightPixels;
    }

    public static int dp2px(float dpValue) {
        return (int) (0.5f + dpValue * Resources.getSystem().getDisplayMetrics().density);
    }
}
