package com.zht.algorithm.dayfour;

/**
 * author  :zhangtao
 * date    :2019/5/27 13:41
 * desc    :
 */
public class AddBinary {
    public static String addBinaryTwo(String a, String b) {
        int k = a.length()-1,m = b.length()-1;
        int sum,carry=0;
        StringBuilder builder = new StringBuilder();
        while (k >= 0 || m >= 0){
            sum = carry;
            if(k >= 0) sum += a.charAt(k--) - '0';
            if(m >= 0) sum += b.charAt(m--) - '0';
            builder.insert(0,sum%2);
            carry = sum/2;
        }
        if(carry != 0)
            builder.insert(0,carry);
        return builder.toString();
    }

    public static String addBinary(String a, String b) {
        char[] charArrA = new StringBuilder(a).reverse().toString().toCharArray();
        char[] charArrB = new StringBuilder(b).reverse().toString().toCharArray();
        StringBuilder sb = new StringBuilder();
        int charArrALength = charArrA.length;
        int charArrBLength = charArrB.length;
        int largerLength = Math.max(charArrALength,charArrBLength);
        int lessLength = Math.min(charArrALength,charArrBLength);
        int addVal = 0;
        for (int i = 0; i < largerLength; i++) {
            int temp = 0;
            if(i < largerLength && i < lessLength){
                temp = Character.getNumericValue(charArrA[i])+Character.getNumericValue(charArrB[i]);
            }else if(i < largerLength ){
                temp = Character.getNumericValue(charArrALength == largerLength ? charArrA[i]:charArrB[i]);
            }
            temp += addVal;
            switch (temp){
                case 3:
                    if(i == largerLength - 1) {
                        sb.insert(0,"11" );
                    }else{
                        sb.insert(0,"1");
                        addVal = 1;
                    }
                    break;
                case 2:
                    if(i == largerLength - 1) {
                        sb.insert(0,"10" );
                    }else{
                        sb.insert(0,"0");
                        addVal = 1;
                    }
                    break;
                case 1:
                    sb.insert(0,"1");
                    addVal = 0;
                    break;
                case 0:
                    sb.insert(0,"0");
                    addVal = 0;
                    break;
            }

        }
        return sb.toString();
    }
}
