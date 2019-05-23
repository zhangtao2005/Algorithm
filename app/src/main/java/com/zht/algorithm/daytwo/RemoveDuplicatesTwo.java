package com.zht.algorithm.daytwo;

/**
 * author  :zhangtao
 * date    :2019/5/23 14:50
 * desc    :
 */
public class RemoveDuplicatesTwo {
    public static int removeDuplicates(int[] nums) {
        if(nums == null || nums.length == 0){
            return 0;
        }
        int index = 0;
        int numCount = 1;
        for (int i = 1; i < nums.length; i++) {
            if(nums[i] != nums[index] ){
                nums[index + 1] = nums[i];
                index++;
                numCount = 1;
            }else if(nums[i] == nums[index]){
                numCount++;
                if(numCount == 2){
                    nums[index + 1] = nums[i];
                    index++;
                }
            }
        }
        return index+1;
    }


}
