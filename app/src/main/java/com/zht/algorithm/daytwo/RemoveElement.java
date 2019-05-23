package com.zht.algorithm.daytwo;

/**
 * author  :zhangtao
 * date    :2019/5/23 17:18
 * desc    :
 */
public class RemoveElement {
    public static int removeElement(int[] nums, int val) {
        if(nums == null || nums.length == 0)
            return 0;
        int index = 0;
        for (int i = 0; i < nums.length; i++) {
            if(nums[i] != val){
                nums[index++] = nums[i];
            }
        }
        return index;
    }
}
