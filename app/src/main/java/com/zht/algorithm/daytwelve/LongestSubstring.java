package com.zht.algorithm.daytwelve;

import java.util.HashMap;

/**
 * author  :zhangtao
 * date    :2019/6/6 16:10
 * desc    :
 */
public class LongestSubstring {
    public static int lengthOfLongestSubstring(String s) {
        if (s == null || s.length() == 0)
            return 0;
        int rst = 0,i = 0,j = 0,n = s.length();
        int[] index = new int[128];

        for (; j < n; j++) {
            i = Math.max(index[s.charAt(j)],i);
            rst = Math.max(rst , j - i + 1);
            index[s.charAt(j)] = j + 1;
        }
        return rst;
    }

    public static int lengthOfLongestSubstringOne(String s) {
        if (s == null || s.length() == 0)
            return 0;
        int rst = 0;
        int start = 0;
        int end = 0;
        boolean[] chars = new boolean[256];

        while (start < s.length()){
            while (end < s.length() && !chars[s.charAt(end)]){
                chars[s.charAt(end)] = true;
                rst = Math.max(rst,end - start + 1);
                end ++;
            }
            chars[s.charAt(start)] = false;
            start++;
        }
        return rst;
    }

    public static int lengthOfLongestSubstringTwo(String s) {
        if (s == null || s.length() == 0)
            return 0;
        HashMap<Character,Integer> container = new HashMap<>();
        int maxLength = 0;
        int tempMaxLength = 0;

        for (int i = 0,n = s.length(); i < n; i++) {
            char temp = s.charAt(i);
            if (!container.containsKey(temp)){
                container.put(temp,i);
                tempMaxLength ++;
            }else{
                i = container.get(temp);
                container = new HashMap<>();
                tempMaxLength = 0;
            }
            maxLength = Math.max(maxLength,tempMaxLength);
        }
        return maxLength;
    }
}
