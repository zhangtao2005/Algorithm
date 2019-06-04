package com.zht.algorithm.dayten;

/**
 * author  :zhangtao
 * date    :2019/6/4 20:21
 * desc    :
 */
public class HouseRobber {
    public static int rob(int[] nums) {
        if (nums == null || nums.length == 0)
            return 0;
        int n = nums.length;
        long[] dp = new long[n + 1];
        dp[0] = 0;
        dp[1] = nums[0];
        for (int i = 2; i <= n; i++) {
            dp[i] = Math.max(dp[i - 1],dp[i - 2] + nums[i - 1]);
        }
        return (int)dp[n];
    }

    public int robTwo(int[] A) {
        if (A == null || A.length == 0) {
            return 0;
        } else if (A.length == 1) {
            return A[0];
        }
        int n = A.length;
        int[] dp = new int[2];
        dp[0] = A[0];
        dp[1] = Math.max(A[0], A[1]);

        for (int i = 2; i < n; i++) {
            dp[i%2] = Math.max(dp[(i-1)%2], dp[(i-2)%2] + A[i]);
        }

        return dp[(n - 1)%2];
    }
}
