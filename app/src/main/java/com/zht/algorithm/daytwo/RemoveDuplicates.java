package com.zht.algorithm.daytwo;

/**
 * author  :zhangtao
 * date    :2019/5/23 10:28
 * desc    :
 */
public class RemoveDuplicates {
    public static int removeDuplicates(int[] nums) {
        if(nums == null || nums.length == 0){
            return 0;
        }
        int index = 0;
        for (int i = 1; i < nums.length; i++) {
           if(nums[i] != nums[index]){
               nums[index + 1] = nums[i];
               index++;
           }
        }
        return index+1;
    }


}
