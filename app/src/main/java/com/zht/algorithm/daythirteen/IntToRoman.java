package com.zht.algorithm.daythirteen;

/**
 * author  :zhangtao
 * date    :2019/6/10 16:12
 * desc    :
 */
public class IntToRoman {

    public static String intToRoman(int num) {
        StringBuilder builder = new StringBuilder();
        int[] a = {1000,900,500,400,100,90,50,40,10,9,5,4,1};
        String[] r = { "M", "CM" , "D" , "CD" , "C" , "XC" , "L" , "XL" , "X" , "IX", "V" , "IV" , "I"};

        for (int i = 0; i < a.length; i++) {
            while (num - a[i] >= 0){
                builder.append(r[i]);
                num -= a[i];
            }
        }
        return builder.toString();
    }

    public static String intToRomanTwo(int num) {
        if (num < 1 || num > 3999)
            return null;
        StringBuilder romanBuilder = new StringBuilder();
        int left;
        int[] numInt = new int[4];
        int i = 0;
        while (num != 0){
            left = num % 10;
            num /= 10;
            if (i <= 3) {
                numInt[i++] = left;
            } else {
                break;
            }
        }
        if (numInt[3] != 0){
            appendThousand(romanBuilder , numInt[3]);
        }
        if (numInt[2] != 0){
            appendHundred(romanBuilder , numInt[2]);
        }
        if (numInt[1] != 0){
            appendTen(romanBuilder , numInt[1]);
        }
        if (numInt[0] != 0){
            appendSingle(romanBuilder , numInt[0]);
        }
        return romanBuilder.toString();
    }

    private static void appendSingle(StringBuilder romanBuilder , int num) {
        if (num == 9){
            romanBuilder.append("IX");
        }else if (num == 4){
            romanBuilder.append("IV");
        }else if (num >= 5){
            romanBuilder.append("V");
            for (int i = 0; i < num - 5; i++) {
                romanBuilder.append("I");
            }
        }else{
            for (int i = 0; i < num ; i++) {
                romanBuilder.append("I");
            }
        }
    }

    private static void appendTen(StringBuilder romanBuilder , int num) {
        if (num == 9){
            romanBuilder.append("XC");
        }else if (num == 4){
            romanBuilder.append("XL");
        }else if (num >= 5){
            romanBuilder.append("L");
            for (int i = 0; i < num - 5; i++) {
                romanBuilder.append("X");
            }
        }else{
            for (int i = 0; i < num ; i++) {
                romanBuilder.append("X");
            }
        }
    }

    private static void appendHundred(StringBuilder romanBuilder , int num) {
        if (num == 9){
            romanBuilder.append("CM");
        }else if (num == 4){
            romanBuilder.append("CD");
        }else if (num >= 5){
            romanBuilder.append("D");
            for (int i = 0; i < num - 5; i++) {
                romanBuilder.append("C");
            }
        }else{
            for (int i = 0; i < num ; i++) {
                romanBuilder.append("C");
            }
        }
    }

    private static void appendThousand(StringBuilder romanBuilder , int num) {
        for (int i = 0; i < num ; i++) {
            romanBuilder.append("M");
        }
    }
}
