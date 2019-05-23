package com.zht.algorithm.utils;

import android.util.Log;

import java.util.Arrays;

/**
 * author  :zhangtao
 * date    :2019/5/23 10:54
 * desc    :
 */
public class PrintArrayUtils {

    public static final String TAG = "PrintArrayUtils";

    public  static void printIntArr(String tag,int[] arr){
        String mtag = tag == null ? TAG:tag;
        Log.i(mtag,"array is "+Arrays.toString(arr));
    }

}
