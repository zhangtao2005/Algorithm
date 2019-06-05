package com.zht.algorithm.dayeleven;

import java.util.HashSet;

/**
 * author  :zhangtao
 * date    :2019/6/5 16:35
 * desc    :
 */
public class HappyNumber {
    public static boolean isHappy(int n) {
        int left = 0;
        int sum = 0;
        while(sum != 1 ) {
            while (n != 0) {
                left = n % 10;
                sum += left * left;
                n = n / 10;
            }
            if(sum > 1 && sum != 4){
                n = sum;
                sum = 0;
            }else {
                break;
            }
        }
        return sum == 1 ? true : false;
    }

    public static boolean isHappyTwo(int n) {
        HashSet<Integer> sums = new HashSet<>();
        int left = 0;
        int sum = 0;
        while(!sums.contains(n) ) {
            sums.add(n);
            while (n != 0) {
                left = n % 10;
                sum += left * left;
                n = n / 10;
            }
            if(sum == 1)
                return true;
            n = sum;
            sum = 0;
        }
        return false;
    }
}
