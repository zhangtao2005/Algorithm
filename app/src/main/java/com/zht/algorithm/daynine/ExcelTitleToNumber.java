package com.zht.algorithm.daynine;

/**
 * author  :zhangtao
 * date    :2019/6/1 16:40
 * desc    :
 */
public class ExcelTitleToNumber {
    public static char[] charMap = new char[256];
    static {
        for (int i = 0; i < 26; i++) {
            charMap['A'+i] = (char)(i+1);
        }
    }
    public static int titleToNumber(String s) {
        if(s == null || s.length() == 0)
            return 0;
        char[] chArr = s.toCharArray();
        int ret = 0;
        for (char c : chArr) {
            ret = 26*ret + c - 'A' + 1;
        }
        return ret;
    }

    public static int titleToNumberTwo(String s) {
        char[] chArr = s.toCharArray();
        int sum = 0;
        int multi = 1;
        for (int i = chArr.length - 1; i >= 0; i--) {
            if(i != chArr.length - 1)
                multi *= 26;
            sum += multi*charMap[chArr[i]];
        }
        return sum;
    }
}
