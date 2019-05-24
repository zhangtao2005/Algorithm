package com.zht.algorithm.daythree;

import java.util.HashSet;
import java.util.Iterator;

/**
 * author  :zhangtao
 * date    :2019/5/24 13:50
 * desc    :
 */
public class SingleNumThree {
    public static int[] singleNumber(int[] nums) {
        if(nums == null || nums.length < 2){
            return null;
        }
        HashSet<Integer> mSet = new HashSet<>();
        for (int i = 0; i < nums.length; i++) {
            if(!mSet.contains(nums[i])){
                mSet.add(nums[i]);
            }else{
                mSet.remove(nums[i]);
            }
        }
        int[] twoNums = new int[2];
        Iterator mIter = mSet.iterator();
        int i = 0;
        while (mIter.hasNext()){
            if(i < 2) {
                twoNums[i++] = (Integer) mIter.next();
            }
        }
        return twoNums;
    } 
    
    public static int[] singleNumberTwo(int[] nums) {
        if (nums == null || nums.length == 0) {
            return null;
        }
        int[] rst = new int[2];
        int xor = 0;
        for (int i = 0; i < nums.length; i++) {
            xor ^= nums[i];
        }
        int bitOnePos = 0;
        for (int i = 0; i < 32; i++) {
            if ((xor >> i & 1) == 1) {
                bitOnePos = i;
                break;
            }
        }
        int rstA = 0;
        int rstB = 0;
        for (int i = 0; i < nums.length; i++) {
            if ((nums[i] >> bitOnePos & 1) == 1) {
                rstA ^= nums[i];
            } else {
                rstB ^= nums[i];
            }
        }
        rst[0] = rstA;
        rst[1] = rstB;

        return rst;
    }
}
