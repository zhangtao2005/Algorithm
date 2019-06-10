package com.zht.algorithm.daythirteen;

import java.util.Arrays;

/**
 * author  :zhangtao
 * date    :2019/6/10 21:01
 * desc    :
 */
public class ThreeSumClosest {


    public static int threeSumClosest(int[] nums, int target) {
        Arrays.sort(nums);

        int closestVal = Integer.MAX_VALUE;
        int minGap = Integer.MAX_VALUE;
        for (int i = 0; i < nums.length; i++) {
            int j = i + 1;
            int k = nums.length - 1;
            while (j < k) {
                int sum = nums[i] + nums[j] + nums[k];
                if (sum - target == 0) {
                    return sum;
                }else if(sum - target > 0)  {
                    if (Math.abs(sum - target) < minGap) {
                        closestVal = sum;
                        minGap = Math.abs(sum - target);
                    }
                    k--;
                }else {
                    if (Math.abs(sum - target) < minGap) {
                        closestVal = sum;
                        minGap = Math.abs(sum - target);
                    }
                    j++;
                }
            }
        }
        return closestVal;
    }

    public int threeSumClosestTwo(int[] nums, int target) {
        if (nums == null || nums.length == 0) {
            return Integer.MAX_VALUE;
        }

        Arrays.sort(nums);
        int n = nums.length;
        int closest = Integer.MAX_VALUE / 2; // 除以二是为了防止越界

        for (int i = 0; i < n - 2; i++) {
            int remain = target - nums[i];
            int closestTwoSum = closestTwoSum(nums, i + 1, n - 1, remain);
            int closestThreeSum = nums[i] + closestTwoSum;

            if (closestThreeSum == target) {
                return target;
            }
            if (Math.abs(closestThreeSum - target) < Math.abs(closest - target)) {
                closest = closestThreeSum;
            }
        }
        return closest;
    }

    private int closestTwoSum(int[] nums, int start, int end, int remain) {
        int closestTwoSum = nums[start] + nums[end];

        while (start + 1 <= end) {
            int sum = nums[start] + nums[end];

            if (sum == remain) {
                return remain;
            } else if (sum > remain) {
                end--;
            } else {
                start++;
            }

            if (Math.abs(sum - remain) < Math.abs(closestTwoSum - remain)) {
                closestTwoSum = sum;
            }
        }
        return closestTwoSum;
    }
}
