package com.zht.algorithm.dayeight;

import java.util.HashMap;

/**
 * author  :zhangtao
 * date    :2019/5/31 15:34
 * desc    :已排序数组
 */
public class TwoSum {
    public static int[] twoSum(int[] numbers, int target) {
        int left = 0,right = numbers.length - 1;
        while (numbers[left] + numbers[right] != target){
            if(numbers[left] + numbers[right] > target){
                right --;
            }else {
                left++;
            }
        }
        return new int[]{left + 1,right + 1};
    }

    public static int[] twoSumTwo(int[] numbers, int target) {
        HashMap<Integer,Integer> map = new HashMap<>();
        int[] twoNums = new int[2];
        if(numbers == null)
            return twoNums;
        for (int i = 0; i < numbers.length; i++) {
            if(map.containsKey(numbers[i])){
                twoNums[0] = map.get(numbers[i])+1;
                twoNums[1] = i+1;
                break;
            }else{
                map.put(target - numbers[i],i);
            }
        }
        return twoNums;
    }
}
