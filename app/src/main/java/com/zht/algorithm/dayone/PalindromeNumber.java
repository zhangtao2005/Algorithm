package com.zht.algorithm.dayone;

/**
 * author  :zhangtao
 * date    :2019/5/22 12:03
 * desc    :
 */
public class PalindromeNumber {
    public static boolean isPalindrome(int x) {
        if(x < 0)
            return false;
        if(x == 0)
            return true;
        long reverseNum = 0;
        long oldX = x;
         while (x != 0){
             reverseNum = reverseNum*10 + x%10;
             x /= 10;
         }
        return reverseNum == oldX;
    }
}
