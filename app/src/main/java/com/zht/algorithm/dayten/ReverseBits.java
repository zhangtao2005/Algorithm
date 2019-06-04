package com.zht.algorithm.dayten;

import android.util.Log;

import static com.zht.algorithm.MainActivity.TAG;

/**
 * author  :zhangtao
 * date    :2019/6/4 15:55
 * desc    :
 */
public class ReverseBits {

    public static int reverseBits(int n) {
        int res = 0;
        for (int i = 0; i < 32; i++) {
            res = ( res << 1 ) | ( n & 1);
            n = n >> 1;
        }
        return res;
    }

    public static int reverseBitsTwo(int n) {
       String str =  Integer.toBinaryString(n);
        char[] chArr = str.toCharArray();
        char[] nChArr = null ;
        if (chArr.length < 32){
            nChArr = new char[32];
            int margin = 32 - chArr.length;
            while (margin >= 0){
                nChArr[margin -- ] = '0';
            }
            margin = 32 - chArr.length;
            for (int i = 0; i < chArr.length; i++) {
                nChArr[margin + i] = chArr[i];
            }
        }
        chArr = nChArr == null ? chArr : nChArr;
        int start = 0,end = chArr.length - 1;
        while (start < end){
            switchArr(chArr,start++,end--);
        }
        int sum = 0;
        for (int i = 0; i < chArr.length; i++) {
            sum = sum * 2 + (chArr[i] - '0');
        }
        return sum;
    }

    private static void printArr(int[] arr,int length){
        for (int i = 0; i < length; i++) {
            Log.i(TAG,"arr["+i+"]= "+arr[i]);
        }
        Log.i(TAG,"------------line-------------");
    }

    private static void switchArr(char[] chArr, int start, int end) {
        char temp = chArr[start];
        chArr[start] = chArr[end];
        chArr[end] = temp;
    }
}
