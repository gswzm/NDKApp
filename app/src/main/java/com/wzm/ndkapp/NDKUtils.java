package com.wzm.ndkapp;


import java.lang.reflect.Array;

/**
 * 类名： NDKUtils
 * 时间：2017/11/13 9:02
 * 描述：
 * 修改人：
 * 修改时间：
 * 修改备注：
 *
 * @author wangzm
*/
public class NDKUtils {

    static {
        System.loadLibrary("hello");
    }
    public static native String sayHello();

    public static native double add(double a,double b);

    public static native int[] getIntArray(int[] ints);


}
