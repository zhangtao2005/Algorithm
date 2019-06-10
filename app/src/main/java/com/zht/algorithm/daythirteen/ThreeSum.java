package com.zht.algorithm.daythirteen;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * author  :zhangtao
 * date    :2019/6/10 18:22
 * desc    :
 */
public class ThreeSum {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> lists = new ArrayList<>();
        Arrays.sort(nums);

        for (int i = 0; i < nums.length ; i++) {
            if (nums[i] > 0)
                break;
            if (i > 0 && nums[i] == nums[i - 1])
                continue;
            int j = i + 1;
            int k = nums.length - 1;
            while (j < k) {
                if (nums[j] + nums[k] + nums[i] == 0) {
                    lists.add(Arrays.asList(nums[j], nums[k], nums[i]));
                    j++;
                    k--;
                    while (j < k && nums[j - 1] == nums[j]) {
                        j++;
                    }
                    while (j < k && nums[k + 1] == nums[k]) {
                        k--;
                    }
                } else if (nums[j] + nums[k] + nums[i] < 0) {
                    j++;
                } else {
                    k--;
                }
            }
        }
        return lists;
    }

    public List<List<Integer>> threeSumTwo(int[] nums) {
        List<List<Integer>> containerList = new ArrayList<>();
        if (nums == null || nums.length == 0){
            return containerList;
        }

        Arrays.sort(nums);

        for (int i = 2; i < nums.length; i++) {
            while (i + 1 < nums.length && nums[i] == nums[i + 1]){
                continue;
            }
            int start = 0;
            int end = i - 1;
            while (start < end) {
                if (nums[start] + nums[end] + nums[i] == 0) {
                    containerList.add(Arrays.asList(nums[start], nums[end], nums[i]));
                    start++;
                    while (start < end && nums[start - 1] == nums[start]) {
                        start++;
                    }
                } else if (nums[start] + nums[end] + nums[i] < 0) {
                    start++;
                } else {
                    end--;
                }
            }
        }
        return containerList;
    }
}
