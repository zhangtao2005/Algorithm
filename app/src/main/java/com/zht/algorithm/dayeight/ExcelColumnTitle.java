package com.zht.algorithm.dayeight;

/**
 * author  :zhangtao
 * date    :2019/5/31 16:19
 * desc    :
 */
public class ExcelColumnTitle {
    public static char[] charMap = new char[27];
    static {
        for (int i = 0; i < 26; i++) {
            charMap[i+1] = (char)('A'+i);
        }
    }
    public static String convertToTitle(int n) {
        StringBuilder builder = new StringBuilder();
        int left = n % 26;
        if(left != 0) {
            builder.insert(0, charMap[left]);
        }else{
            builder.insert(0,'Z');
            n -- ;
        }
        int multi = n / 26;
        while (multi > 26) {
            left = multi % 26;
            if(left != 0)
                builder.insert(0, charMap[left]);
            else {
                builder.insert(0,'Z');
                multi -- ;
            }
            multi = multi / 26;
        }
        if (multi > 0) {
            builder.insert(0, charMap[multi]);
        }

        return builder.toString();
    }
}
