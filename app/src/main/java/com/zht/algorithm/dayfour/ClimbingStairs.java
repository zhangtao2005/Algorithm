package com.zht.algorithm.dayfour;

/**
 * author  :zhangtao
 * date    :2019/5/27 16:40
 * desc    :
 */
public class ClimbingStairs {

    private static int[] mem;

    public static int climbStairs(int n) {
        if(n <= 2)
            return n;
        mem = new int[n];
        return dfs(n -1)+dfs(n-2);
    }

    private static int dfs(int n) {
        if(n <= 2)
            return n;
        if(mem[n] != 0){
            return mem[n];
        }
        mem[n-1] = dfs(n-1);
        mem[n-2] = dfs(n-2);
        return mem[n-1]+mem[n-2];
    }

    public static int climbStairsTwo(int n) {
        if(n <= 2)
            return n;
        int[] dp = new int[n+1];
        dp[0] = 1;
        dp[1] = 1;
        for (int i = 2; i < dp.length; i++) {
            dp[i] = dp[i-1]+dp[i-2];
        }
        return dp[n];
    }

}
