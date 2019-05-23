package com.zht.algorithm;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;

import com.zht.algorithm.daytwo.RemoveDuplicatesTwo;

import java.util.HashMap;

public class MainActivity extends AppCompatActivity {

    public static final String TAG = "MainActivity";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
//        ReverseInteger.Solution solution = new ReverseInteger().new Solution();
//
//        Log.i(TAG,"int max = "+Integer.MAX_VALUE+",int min = "+Integer.MIN_VALUE);
//
//        Log.i(TAG,"solution.reverseThree(-21) = "+solution.reverseThree(-21));
//        Log.i(TAG,"solution.reverseThree(21) = "+solution.reverseThree(21));
//        Log.i(TAG,"solution.reverseThree(max) = "+solution.reverseThree(Integer.MAX_VALUE));
//        Log.i(TAG,"solution.reverseThree(min) = "+solution.reverseThree(Integer.MIN_VALUE));

//        Log.i(TAG,"isPalindrome(212) = "+ PalindromeNumber.isPalindrome(212));
//        Log.i(TAG,"isPalindrome(max) = "+ PalindromeNumber.isPalindrome(Integer.MAX_VALUE));
//        Log.i(TAG,"isPalindrome(min) = "+ PalindromeNumber.isPalindrome(Integer.MIN_VALUE));
//        Log.i(TAG,"isPalindrome(-21) = "+ PalindromeNumber.isPalindrome(-21));
//        Log.i(TAG,"isPalindrome(12321) = "+ PalindromeNumber.isPalindrome(12321));
//        Log.i(TAG,"isPalindrome(12345) = "+ PalindromeNumber.isPalindrome(12345));

//        Log.i(TAG,"romanToInt(III) = "+ RomanToInt.romanToInt("III"));
//        Log.i(TAG,"romanToInt(IV) = "+ RomanToInt.romanToInt("IV"));
//        Log.i(TAG,"romanToInt(IX) = "+ RomanToInt.romanToInt("IX"));
//        Log.i(TAG,"romanToInt(LVIII) = "+ RomanToInt.romanToInt("LVIII"));
//        Log.i(TAG,"romanToInt(MCMXCIV) = "+ RomanToInt.romanToInt("MCMXCIV"));

//        Log.i(TAG,"longestCommonPrefixTwo {\"flex\",\"flip\",\"flaw\"} = "+ LongestCommonPrefix.longestCommonPrefixTwo(new String[]{"flex","flip","flaw"}));
//        Log.i(TAG,"longestCommonPrefixTwo {\"flex\",\"flex\",\"flex\"} = "+ LongestCommonPrefix.longestCommonPrefixTwo(new String[]{"flex","flex","flex"}));
//        Log.i(TAG,"longestCommonPrefixTwo {\"flexa\",\"flex\",\"flex\"} = "+ LongestCommonPrefix.longestCommonPrefixTwo(new String[]{"flexa","flex","flex"}));
//        Log.i(TAG,"longestCommonPrefixTwo {\"a\",\"b\",\"c\"} = "+ LongestCommonPrefix.longestCommonPrefixTwo(new String[]{"a","b","c"}));
//        Log.i(TAG,"longestCommonPrefixTwo {\"\",\"b\"} = "+ LongestCommonPrefix.longestCommonPrefixTwo(new String[]{"","b"}));
//        Log.i(TAG,"longestCommonPrefixTwo {\"abc\"} = "+ LongestCommonPrefix.longestCommonPrefixTwo(new String[]{"abc"}));
//        Log.i(TAG,"longestCommonPrefixTwo {} = "+ LongestCommonPrefix.longestCommonPrefixTwo(new String[]{}));

//        Log.i(TAG,"ValidParentheses.isValidTwo(\"\") = "+ ValidParentheses.isValidTwo(""));
//        Log.i(TAG,"ValidParentheses.isValidTwo(\"()\") = "+ ValidParentheses.isValidTwo("()"));
//        Log.i(TAG,"ValidParentheses.isValidTwo(\"()[]{}\") = "+ ValidParentheses.isValidTwo("()[]{}"));
//        Log.i(TAG,"ValidParentheses.isValidTwo(\"(]\") = "+ ValidParentheses.isValidTwo("(]"));
//        Log.i(TAG,"ValidParentheses.isValidTwo(\"([)]\") = "+ ValidParentheses.isValidTwo("([)]"));
//        Log.i(TAG,"ValidParentheses.isValidTwo(\"{[]}\") = "+ ValidParentheses.isValidTwo("{[]}"));
//        Log.i(TAG,"ValidParentheses.isValidTwo(\"(([]){})\") = "+ ValidParentheses.isValidTwo("(([]){})"));

        int[] num1 = new int[]{1,1,1,2,2,3,3,4};
        printArr(num1, RemoveDuplicatesTwo.removeDuplicates(num1));
        int[] num2 = new int[]{1,2,3,4};
        printArr(num2,RemoveDuplicatesTwo.removeDuplicates(num2));
        int[] num3 = new int[]{0,0,1,1,1,1,2,3,3};
        printArr(num3,RemoveDuplicatesTwo.removeDuplicates(num3));
        int[] num4 = new int[]{1,1,1};
        printArr(num4,RemoveDuplicatesTwo.removeDuplicates(num4));
    }

    private void printArr(int[] arr,int length){
        for (int i = 0; i < length; i++) {
            Log.i(TAG,"arr["+i+"]= "+arr[i]);
        }
        Log.i(TAG,"------------line-------------");
    }

    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer,Integer> map = new HashMap();
        for(int i=0,n=nums.length ; i < n ; i++){
            if(map.containsKey(nums[i])){
                return new int[]{map.get(nums[i]),i};
            }
            map.put(target-nums[i],i);
        }
        return null;
    }
}
