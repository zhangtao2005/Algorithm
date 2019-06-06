package com.zht.algorithm.daytwelve;

/**
 * author  :zhangtao
 * date    :2019/6/6 22:35
 * desc    :
 */
public class ZigzagConversion {
    public String convert(String s, int numRows) {
        char[] chars = s.toCharArray();
        int len = chars.length;
        StringBuilder[] builders = new StringBuilder[numRows];
        for (int i = 0; i < builders.length; i++) {
            builders[i] = new StringBuilder();
        }
        int i = 0;
        while (i < len){
            for (int j = 0; j < numRows && i < len; j++) {
                builders[j].append(chars[i++]);
            }
            for (int j = numRows - 2; j >= 1 && i < len ; j--) {
                builders[j].append(chars[i++]);
            }
        }
        for (int j = 1; j < numRows; j++) {
            builders[0].append(builders[j]);
        }
        return builders[0].toString();
    }
}
