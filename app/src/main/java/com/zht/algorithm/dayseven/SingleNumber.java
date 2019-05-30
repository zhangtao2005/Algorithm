package com.zht.algorithm.dayseven;

import java.util.HashSet;

/**
 * author  :zhangtao
 * date    :2019/5/30 16:28
 * desc    :
 */
public class SingleNumber {
    public static int singleNumber(int[] nums) {
        HashSet<Integer> num = new HashSet<>();
        for (int i = 0; i < nums.length; i++) {
            if(!num.contains(nums[i])){
                num.add(nums[i]);
            }else{
                num.remove(nums[i]);
            }
        }
        return num.iterator().next().intValue();
    }

    public static int singleNumberTwo(int[] nums) {
        if(nums == null || nums.length == 0)
            return 0;
        for (int i = 1; i < nums.length; i++) {
            nums[0] = nums[0] ^ nums[i];
        }
        return nums[0];
    }
}
