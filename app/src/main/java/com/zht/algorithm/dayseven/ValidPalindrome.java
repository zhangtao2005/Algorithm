package com.zht.algorithm.dayseven;

import java.util.ArrayList;

/**
 * author  :zhangtao
 * date    :2019/5/30 15:06
 * desc    :检查是否回文串，字母和数字
 */
public class ValidPalindrome {
    public static boolean isPalindrome(String s) {
        if(s == null || s.length() <= 1){
            return true;
        }
        s = s.replaceAll("[^a-zA-Z0-9]","").toLowerCase();
        int start = 0,end = s.length()-1;
        while (start < end){
            if(s.charAt(start) != s.charAt(end)){
                return false;
            }
            start++;
            end--;
        }
        return true;
    }

    public static boolean isPalindromeThree(String s) {
        if(s.equals("")){
            return true;
        }
        StringBuilder sb = new StringBuilder();
        char temp;
        s = s.toLowerCase();
        for (int i=0 ;i< s.length();i++){
            temp = s.charAt(i);
            if((temp <= 'z' && temp >= 'a') || '0' <= temp && temp<= '9'){
                sb.append(temp);
            }
        }
        String last = sb.toString();
        String reverse = sb.reverse().toString();
        return last.equals(reverse);
    }

    public static boolean isPalindromeTwo(String s) {
        if(s.equals("")){
            return true;
        }
        boolean isPalindrome = true;
        ArrayList<Character> list = new ArrayList<>();
        char temp;
        s = s.toLowerCase();
        for (int i=0 ;i< s.length();i++){
            temp = s.charAt(i);
            if((temp <= 'z' && temp >= 'a') || '0' <= temp && temp<= '9'){
                list.add(temp);
            }
        }
        for (int i = 0,n = list.size(); i < n; i++) {
            if(list.get(i).equals(list.get(n - 1 -i))){
                continue;
            }else{
                isPalindrome = false;
                break;
            }
        }
        return isPalindrome;
    }

    private static final char[]charMap = new char[256];
    static{
        for(int i=0;i<10;i++){
            charMap[i+'0'] = (char)(1+i);  // numeric
        }
        for(int i=0;i<26;i++){
            charMap[i+'a'] = charMap[i+'A'] = (char)(11+i);  //alphabetic, ignore cases
        }
    }

    public static boolean isPalindromeFour(String s) {
        char[]pChars = s.toCharArray();
        int start = 0,end=pChars.length-1;
        char cS,cE;
        while(start<end){
            cS = charMap[pChars[start]];
            cE = charMap[pChars[end]];
            if(cS!=0 && cE!=0){
                if(cS!=cE)return false;
                start++;
                end--;
            }else{
                if(cS==0)start++;
                if(cE==0)end--;
            }
        }
        return true;
    }
}
