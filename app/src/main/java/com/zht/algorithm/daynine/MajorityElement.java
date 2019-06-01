package com.zht.algorithm.daynine;

import java.util.HashMap;

/**
 * author  :zhangtao
 * date    :2019/6/1 15:58
 * desc    :
 */
public class MajorityElement {
    public int majorityElement(int[] nums) {
        int i = 1,majority = nums[0],count = 1;
        while (i < nums.length){
            if(nums[i] == majority){
                count++;
            }else {
                count--;
                if(count == 0){
                    majority = nums[i];
                    count = 1;
                }
            }
            i++;
        }
        return majority;
    }

    public int majorityElementTwo(int[] nums) {
        if(nums.length == 1){
            return nums[0];
        }
        HashMap<Integer,Integer> container = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            if(container.containsKey(nums[i])){
                Integer times = container.get(nums[i]);
                container.put(nums[i],times+1);
                if(times + 1 > nums.length/2)
                    return nums[i];
            }else{
                container.put(nums[i],1);
            }
        }
        return -1;
    }
}
