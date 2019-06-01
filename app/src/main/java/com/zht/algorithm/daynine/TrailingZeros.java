package com.zht.algorithm.daynine;

/**
 * author  :zhangtao
 * date    :2019/6/1 17:32
 * desc    :
 */
public class TrailingZeros {
    public static int trailingZeroes(long n) {
        if (n < 5)
            return 0;
        long count = 0;
        for (long i = 5; n/i != 0; i*=5) {
            count += n/i;
        }
        return (int)count;
    }
}
