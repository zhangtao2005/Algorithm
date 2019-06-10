package com.zht.algorithm.daythirteen;

/**
 * author  :zhangtao
 * date    :2019/6/9 18:52
 * desc    :
 */
public class MyAtoi {
    public static int myAtoi(String str) {
        String trimStr = str.trim();
        if (trimStr.length() == 0){
            return 0;
        }
        char[] chArr = trimStr.toCharArray();
        int n = chArr.length;
        long retval = 0;
        boolean isMinus = false;
        for (int i = 0; i < n; i++) {
            char c = chArr[i];
            if (c == '+' && i == 0){
                isMinus = false;
            }else if (c == '-'  && i == 0){
                isMinus = true;
            }else if (c >= '0' && c <= '9'){
                if (isMinus){
                    retval = retval * 10 - (c - '0');
                }else{
                    retval = retval * 10 + (c - '0');
                }
                if (retval >= Integer.MAX_VALUE || retval <= Integer.MIN_VALUE)
                    break;
            }else{
                break;
            }
        }

        if (retval >= Integer.MAX_VALUE)
            return Integer.MAX_VALUE;
        if (retval <= Integer.MIN_VALUE)
            return Integer.MIN_VALUE;

        return (int) retval;
    }

}
