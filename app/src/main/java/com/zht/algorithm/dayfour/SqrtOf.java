package com.zht.algorithm.dayfour;

/**
 * author  :zhangtao
 * date    :2019/5/27 15:54
 * desc    :
 */
public class SqrtOf {
    public static int mySqrtTwo(int x) {
        long start = 0,end = x;

        while (start+1 < end){
            long mid = (start + end) >> 1;
            if(mid * mid - x > 0){
                end = mid;
            }else if(mid * mid - x < 0){
                start = mid;
            }else{
                return (int)mid;
            }
        }
        if(end * end <= x){
            return (int) end;
        }else{
            return (int) start;
        }

    }

    public static int mySqrt(int x) {
        if(x < 1){
            return 0;
        }
        long retVal = 0;
        retVal = x/2;
        while (retVal*retVal - x > 0){
            retVal /= 2;
        }
        while (retVal*retVal - x < 0){
            retVal += 1;
        }
        if(retVal*retVal == x) {
            return (int)retVal;
        }else{
            return (int)retVal - 1;
        }
    }
}
