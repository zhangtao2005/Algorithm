package com.zht.algorithm.daythirteen;

/**
 * author  :zhangtao
 * date    :2019/6/10 15:36
 * desc    :
 */
public class MostWater {
    public static int maxArea(int[] height) {
        int maxArea = 0 , lo = 0 , hi = height.length - 1 , high = 0;
        while (lo < hi){
            high = Math.min(height[lo],height[hi]);
            maxArea = Math.max(maxArea,high * (hi - lo));
            while (lo < hi && height[lo] <= high){
                lo ++;
            }
            while (lo < hi && height[hi] <= high){
                hi --;
            }
        }
        return maxArea;
    }

    public static int maxAreaTwo(int[] height) {
        int maxArea = 0;
        for (int i = 0; i < height.length - 1; i++) {
            for (int j = i + 1; j < height.length; j++) {
                maxArea = Math.max(maxArea,(j - i) * Math.min(height[i],height[j]));
            }
        }
        return maxArea;
    }
}
