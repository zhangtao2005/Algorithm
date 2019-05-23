package com.zht.algorithm.dayone;

import java.util.Arrays;

/**
 * author  :zhangtao
 * date    :2019/5/22 14:48
 * desc    :
 */
public class LongestCommonPrefix {

    public static String longestCommonPrefixTwo(String[] strs) {
        if(strs == null || strs.length == 0){
            return "";
        }
        StringBuilder longestPrefix = new StringBuilder();
        Arrays.sort(strs);
        String head = strs[0];
        String tail = strs[strs.length - 1];
        int length = head.length() > tail.length() ? tail.length():head.length();
        for (int i = 0; i <length; i++) {
            if(head.charAt(i) != tail.charAt(i)){
                break;
            }
            longestPrefix.append(head.charAt(i));
        }
        return longestPrefix.toString();
    }

    public static String longestCommonPrefix(String[] strs) {
        if(strs == null || strs.length == 0){
            return "";
        }
        if(strs.length == 1){
            return strs[0];
        }
        char[] firstCharArr = strs[0].toCharArray();
        int k = firstCharArr.length;
        StringBuilder longestPrefix;
        if(k > 0) {
            longestPrefix = new StringBuilder(String.valueOf(firstCharArr[0]));
        }else{
            return "";
        }
        for (int j = 0; j < k ; j++) {
            for (int i = 1,n = strs.length; i < n; i++) {
                if(strs[i].startsWith(longestPrefix.toString())){
                    if(i == n - 1 && j + 1 < k){
                        longestPrefix.append(firstCharArr[j + 1]);
                    }
                    continue;
                }else {
                    longestPrefix.deleteCharAt(j);
                    return longestPrefix.toString();
                }
            }
        }
        return longestPrefix.toString();
    }
}
