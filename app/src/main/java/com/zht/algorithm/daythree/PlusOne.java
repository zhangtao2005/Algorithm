package com.zht.algorithm.daythree;

/**
 * author  :zhangtao
 * date    :2019/5/24 17:40
 * desc    :
 */
public class PlusOne {
    public static int[] plusOne(int[] digits) {
        if(digits == null || digits.length == 0){
            return digits;
        }
        digits[digits.length-1] += 1;
        for (int i = digits.length - 1; i > 0; i--) {
            if(digits[i] == 10){
                digits[i] = 0;
                digits[i-1] += 1;
            }else {
                return digits;
            }
        }
        if(digits[0] == 10) {
            int[] outputs = new int[digits.length + 1];
            outputs[0] = 1;
            return outputs;
        }else{
            return digits;
        }
    }

    /**
     * 错误答案，long型也存不下，怎么办
     * */

//    public static int[] plusOne(int[] digits) {
//        if(digits == null || digits.length == 0){
//            return null;
//        }
//        long value = 0;
//        for (int i = digits.length - 1; i >= 0; i--) {
//           value += getTenNTimes(digits[i],digits.length - 1 - i);
//        }
//        value += 1;
//        ArrayList<Integer> targetList = new ArrayList<>();
//        while (value/10 != 0 || value%10 != 0){
//            targetList.add((int)(value % 10));
//            value /= 10;
//        }
//        int[] targetArr = new int[targetList.size()];
//        for (int i = 0, n = targetArr.length; i < n; i++) {
//            targetArr[i] = targetList.get(n-1-i);
//        }
//        return targetArr;
//    }
//
//    public static long getTenNTimes(int num,int times){
//        long sum = num;
//        for (int i = 0; i < times; i++) {
//            sum = 10*sum;
//        }
//        return sum;
//    }
}
