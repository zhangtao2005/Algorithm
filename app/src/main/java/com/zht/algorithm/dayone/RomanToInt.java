package com.zht.algorithm.dayone;

/**
 * author  :zhangtao
 * date    :2019/5/22 12:21
 * desc    :
 */
public class RomanToInt {
    public static int romanToInt(String s) {
        if(s == null || s.equals("")){
            return 0;
        }
        char[] chArr = s.toCharArray();
        int sum = 0;
        for (int i = 0 , n = chArr.length; i <n; i++) {
            if (chArr[i] == 'C'){
                if(i+1 < n) {
                    if (chArr[i + 1] == 'M') {
                        sum += 900;
                        i += 1;
                    } else if (chArr[i + 1] == 'D') {
                        sum += 400;
                        i += 1;
                    }else{
                        sum+=100;
                    }
                }else{
                    sum+=100;
                }
            }else if (chArr[i] == 'X'){
                if(i+1 < n) {
                    if(chArr[i+1] == 'C'){
                        sum+=90;
                        i+=1;
                    }else if(chArr[i+1] == 'L'){
                        sum+=40;
                        i+=1;
                    }else{
                        sum+=10;
                    }
                }else{
                    sum+=10;
                }
            }else if (chArr[i] == 'I' ){
                if(i+1 < n) {
                    if (chArr[i + 1] == 'X') {
                        sum += 9;
                        i += 1;
                    } else if (chArr[i + 1] == 'V') {
                        sum += 4;
                        i += 1;
                    }else {
                        sum+=1;
                    }
                }else{
                    sum+=1;
                }
            }else if(chArr[i] == 'V'){
                sum+=5;
            }else if(chArr[i] == 'L'){
                sum+=50;
            }else if(chArr[i] == 'D'){
                sum+=500;
            }else if(chArr[i] == 'M'){
                sum+=1000;
            }
        }
        return sum;
    }
}
