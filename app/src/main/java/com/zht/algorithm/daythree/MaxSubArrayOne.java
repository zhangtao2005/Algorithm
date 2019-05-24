package com.zht.algorithm.daythree;

/**
 * author  :zhangtao
 * date    :2019/5/24 15:29
 * desc    :
 */
public class MaxSubArrayOne {
    /***
     * Input: [-2,1,-3,4,-1,2,1,-5,4],
     * Output: 6
     * Explanation: [4,-1,2,1] has the largest sum = 6.
     */
    public static int maxSubArray(int[] nums) {
        if(nums == null || nums.length == 0){
            return Integer.MIN_VALUE;
        }
        int preMax = 0,max = Integer.MIN_VALUE;
        for (int num :nums) {
            preMax = Math.max(num,num+preMax);
            max = Math.max(max,preMax);
        }
        return max;
    }
}
