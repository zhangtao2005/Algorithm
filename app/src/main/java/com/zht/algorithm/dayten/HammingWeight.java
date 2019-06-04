package com.zht.algorithm.dayten;

/**
 * author  :zhangtao
 * date    :2019/6/4 19:04
 * desc    :
 */
public class HammingWeight {
    public static int hammingWeight(int n) {
        int sum = 0;
        for (int i = 0; i < 32; i++) {
            sum += n & 1;
            n = n >> 1;
        }
        return sum;
    }
}
