package com.zht.algorithm.daythree;

/**
 * author  :zhangtao
 * date    :2019/5/24 17:08
 * desc    :
 */
public class LengthOfLastWord {
    public static int lengthOfLastWord(String s) {
        if(s == null || s.length()==0){
            return 0;
        }
        String nStr = s.trim();
        for (int i = nStr.length() -1; i > 0; i--) {
            if(nStr.charAt(i) == ' '){
                return nStr.length() - 1 - i;
            }
        }
        return nStr.length();
    }
}
