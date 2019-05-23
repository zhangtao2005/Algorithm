package com.zht.algorithm.daytwo;

/**
 * author  :zhangtao
 * date    :2019/5/23 15:41
 * desc    :
 */
public class JumpGameTwo {
    public int jump(int[] nums) {
        if(nums == null || nums.length <= 1){
            return 0;
        }
        int count = 0,faster = 0,maxRange = 0;
        for (int i = 0; i < nums.length; i++) {
            maxRange = Math.max(maxRange,i+nums[i]);
            if(i == faster){
                count++;
                faster = maxRange;
            }
        }
        return count;
    }
}
