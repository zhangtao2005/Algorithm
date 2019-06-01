package com.zht.algorithm.daynine;

/**
 * author  :zhangtao
 * date    :2019/6/1 20:32
 * desc    :使用空间复杂度为 O(1) 的原地算法
 */
public class RotateArray {
    public static void rotate(int[] nums, int k) {
        k = k % nums.length;
        int count = 0;
        for (int start = 0; count < nums.length; start++) {
            int current = start;
            int prev = nums[start];
            do {
                int next = (current + k) % nums.length;
                int temp = nums[next];
                nums[next] = prev;
                prev = temp;
                current = next;
                count++;
            } while (start != current);
        }
    }

    public static void rotateTwo(int[] nums, int k) {
        if(nums == null || nums.length <= 1)
            return;

        int n = nums.length;
        k = k % n;
        int temp ;
        for (int i = 0; i < k; i++) {
            temp = nums[n - 1];
            System.arraycopy(nums, 0, nums, 1, n - 1);
            nums[0] = temp;
        }
    }

}
