package com.zht.algorithm.daytwelve;

/**
 * author  :zhangtao
 * date    :2019/6/6 18:08
 * desc    :
 */
public class LongestPalindromicSubstring {

    int start,maxLen;

    public String longestPalindrome(String s) {
        if (s == null || s.length() <= 1)
            return s;
        for (int i = 0; i < s.length();) {
            i = helper(s,i);
        }
        return s.substring(start,start + maxLen);
    }

    private int helper(String s, int i) {
        int begin = i - 1;
        int end = i;
        while (end + 1 < s.length() && s.charAt(end) == s.charAt(end+1)){
            end ++;
        }
        int newTail = end + 1;
        end++;
        while (begin >= 0 && end < s.length() && s.charAt(begin) == s.charAt(end)){
            begin --;
            end ++;
        }
        if (end - begin - 1 > maxLen){
            maxLen = end - begin - 1;
            start = begin + 1;
        }
        return newTail;
    }

    public String longestPalindromeTwo(String s) {
        if (s == null || s.length() <= 1)
            return s;
        for (int i = 0; i < s.length() - 1; i++) {
            findMaxLen(s,i,i);
            findMaxLen(s,i,i+1);
        }
        return s.substring(start,start+maxLen);
    }

    private void findMaxLen(String s, int i, int j) {
        while (i >= 0 && j < s.length() && s.charAt(i) == s.charAt(j)){
            i--;
            j++;
        }
        if (maxLen < j - i - 1){
            maxLen = j - i - 1;
            start = i + 1;
        }
    }
}
