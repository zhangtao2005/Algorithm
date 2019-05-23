package com.zht.algorithm.dayone;

/**
 * author  :zhangtao
 * date    :2019/5/22 10:56
 * desc    :
 */
public class ReverseInteger {
    class Solution {
        public int reverseThree(int x) {
            long reverse = 0;
            while (x != 0){
                reverse = reverse*10 + x%10;
                x = x/10;
                if(reverse > Integer.MAX_VALUE || reverse < Integer.MIN_VALUE)
                    return 0;
            }
            return (int)reverse;
        }

        public int reverseTwo(int x) {
            long num = x;
            int sign = num > 0 ? 1:-1;
            String reverseStr = new StringBuilder(Math.abs(num)+"").reverse().toString();
            long reverseLong = Long.parseLong(reverseStr)*sign;
            if(reverseLong > Integer.MAX_VALUE || reverseLong < Integer.MIN_VALUE)
                return 0;
            else
                return (int)reverseLong;
        }

        public int reverse(int x) {
            if(x == 0)
                return 0;
            String str = Integer.valueOf(x).toString();
            char [] charArr = str.toCharArray();
            char [] tCharArr = new char[charArr.length];
            if(x > 0 ) {
                for (int i = 0; i < charArr.length; i++) {
                    tCharArr[charArr.length - 1 - i] = charArr[i];
                }
            }else{
                tCharArr[0] = charArr[0];
                for (int i = 1; i < charArr.length; i++) {
                    tCharArr[charArr.length - i] = charArr[i];
                }
            }
            String reverseStr = new String(tCharArr);
            int reverseValue = 0;
            try {
                reverseValue = Integer.parseInt(reverseStr);
            } catch (NumberFormatException e) {
                return 0;
            }
            return reverseValue;
        }
    }
}
