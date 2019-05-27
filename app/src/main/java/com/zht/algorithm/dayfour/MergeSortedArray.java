package com.zht.algorithm.dayfour;

/**
 * author  :zhangtao
 * date    :2019/5/27 18:19
 * desc    :
 */
public class MergeSortedArray {
    public static void merge(int[] nums1, int m, int[] nums2, int n) {
       if(nums1 == null || nums1.length==0||nums2 == null || nums2.length == 0){
           return;
       }
       m--;n--;
       while (m>=0 || n>=0){
           if(m>=0 && n>=0){
               nums1[m+n+1]=nums1[m] > nums2[n] ? nums1[m--]:nums2[n--];
           }else if(m < 0){
               nums1[n] = nums2[n--];
           }else if(n < 0){
               //此时m >= 0，则元素已在正确位置，直接break
               break;
           }
       }

    }
}
