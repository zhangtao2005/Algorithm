package com.zht.algorithm.dayeleven;

/**
 * author  :zhangtao
 * date    :2019/6/5 19:26
 * desc    :
 */
public class CountPrimes {
    public static int countPrimes(int n) {
        if (n <= 1)
            return 0;
        int sum = 0;
        boolean[] primes = new boolean[n];
        for (int i = 0; i < primes.length; i++) {
            primes[i] = true;
        }
        for (int i = 2; i < n; i++) {
            if(!primes[i])
                continue;
            for (int j = i*i; j < n ; j += i) {
                primes[j] = false;
            }
        }
        for (int i = 2; i < primes.length; i++) {
            sum += primes[i] ? 1:0;
        }
        return sum;
    }
}
