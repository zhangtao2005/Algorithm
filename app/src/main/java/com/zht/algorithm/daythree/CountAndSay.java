package com.zht.algorithm.daythree;

/**
 * author  :zhangtao
 * date    :2019/5/24 14:54
 * desc    :
 */
public class CountAndSay {
    /**
     * 1.     1
     * 2.     11
     * 3.     21
     * 4.     1211
     * 5.     111221
     * */
    public static String countAndSay(int n) {
        if(n <= 1){
            return n+"";
        }
        String currStr = "1";
        for (int i = 2; i <= n; i++) {
            StringBuilder builder = new StringBuilder();
            int count = 1;
            char charAtNum = currStr.charAt(0);
            for (int j = 1; j < currStr.length(); j++) {
                if(currStr.charAt(j) == currStr.charAt(j-1)){
                    count++;
                }else{
                    builder.append(count+String.valueOf(charAtNum));
                    charAtNum = currStr.charAt(j);
                    count = 1;
                }
            }
            builder.append(count+String.valueOf(charAtNum));
            currStr = builder.toString();
        }
        return currStr;
    }
}
