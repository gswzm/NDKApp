package com.wzm.ndkapp;

/**
 * Created by wangzm on 2017/11/9.
 */

public class NDKUtils {

    static {
        System.loadLibrary("hello");
    }
    public static native String sayHello();

    public static native double add(double a,double b);
}
