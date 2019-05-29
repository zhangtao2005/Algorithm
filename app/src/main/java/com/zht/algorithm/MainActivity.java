package com.zht.algorithm;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;

import com.zht.algorithm.daysix.PascalTriangleII;

import java.util.HashMap;
import java.util.List;

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

//        int[] num1 = new int[]{1,1,1,2,2,3,3,4};
//        printArr(num1, RemoveDuplicatesTwo.removeDuplicates(num1));
//        int[] num2 = new int[]{1,2,3,4};
//        printArr(num2,RemoveDuplicatesTwo.removeDuplicates(num2));
//        int[] num3 = new int[]{0,0,1,1,1,1,2,3,3};
//        printArr(num3,RemoveDuplicatesTwo.removeDuplicates(num3));
//        int[] num4 = new int[]{1,1,1};
//        printArr(num4,RemoveDuplicatesTwo.removeDuplicates(num4));

//        int[] num1 = new int[]{1,1,1,2,2,3,3,4};
//        printArr(num1, RemoveElement.removeElement(num1,1));
//        int[] num2 = new int[]{1,2,3,4};
//        printArr(num2,RemoveElement.removeElement(num2,2));
//        int[] num3 = new int[]{0,0,1,1,1,1,2,3,3};
//        printArr(num3,RemoveElement.removeElement(num3,1));
//        int[] num4 = new int[]{1,1,1};
//        printArr(num4,RemoveElement.removeElement(num4,1));

//        printSth(String.valueOf(StrStr.strStr("melody","y")));
//        printSth(String.valueOf(StrStr.strStr("hello","ll")));
//        printSth(String.valueOf(StrStr.strStr("hello","12")));
//        printSth(String.valueOf(StrStr.strStr("hello","")));
//        printSth(String.valueOf(StrStr.strStr("","")));
//        printSth(String.valueOf(StrStr.strStr("aaa","a")));
//        printSth(String.valueOf(StrStr.strStr("",null)));
//        printSth(String.valueOf(StrStr.strStr(null,null)));
//        printSth(String.valueOf(StrStr.strStr(null,"")));
//        printSth(String.valueOf(StrStr.strStrTwo("mississippi","issip")));
//        printSth(String.valueOf(StrStr.strStrTwo("mississippi","pi")));
//        printSth(String.valueOf(StrStr.strStrTwo("aaa","a")));

//        int[] nums = SingleNumThree.singleNumber(new int[]{1,2,1,3,2,5});
////        printArr(nums,nums.length);

//        printSth(CountAndSay.countAndSay(5));

//        printSth(String.valueOf(MaxSubArrayOne.maxSubArray(new int[]{-2,1,-3,4,-1,2,1,-5,4})));

//        printSth(String.valueOf(LengthOfLastWord.lengthOfLastWord("Hello World")));
//        printSth(String.valueOf(LengthOfLastWord.lengthOfLastWord("HelloWorld")));
//        printSth(String.valueOf(LengthOfLastWord.lengthOfLastWord("  HelloWorld   ")));
//        printSth(String.valueOf(LengthOfLastWord.lengthOfLastWord("  ww w ")));
//        int[] numArr = PlusOne.plusOne(new int[]{9});
//        printArr(numArr,numArr.length);
//        int[] numArrTwo = PlusOne.plusOne(new int[]{9,9});
//        printArr(numArrTwo,numArrTwo.length);
//        int[] numArrThree = PlusOne.plusOne(new int[]{1,2});
//        printArr(numArrThree,numArrThree.length);
//        int[] numArrFour = PlusOne.plusOne(new int[]{0});
//        printArr(numArrFour,numArrFour.length);

//        int[] numArrSeven = PlusOne.plusOne(new int[]{9,9,9,9,9,9,9,9,9,9});
//        printArr(numArrSeven,numArrSeven.length);
//
//        int[] numArrFive = PlusOne.plusOne(new int[]{9,8,7,6,5,4,3,2,1,0});
//        printArr(numArrFive,numArrFive.length);
//
//        int[] numArrSix = PlusOne.plusOne(new int[]{
//                7,2,8,5,0,9,1,2,9,5,3,6,6,7,3,2,8,4,3,7,9,5,7,7,4,7,4,9,4,7,0,1,1,1,7,4,0,0,6});
//        printArr(numArrSix,numArrSix.length);

//        printSth(AddBinary.addBinaryTwo("11","1"));
//        printSth(AddBinary.addBinaryTwo("1010","1011"));
//        printSth(""+ SqrtOf.mySqrtTwo(2147395599));

//        printSth(""+ ClimbingStairs.climbStairsTwo(44));
//        printSth(""+ ClimbingStairs.climbStairsTwo(45));

//        printList(PascalTriangle.generate(1));
//        printList(PascalTriangle.generate(2));
//        printList(PascalTriangle.generateTwo(5));

        printListOne(PascalTriangleII.getRow(3));
    }

    private void printListOne(List<Integer> data){
        StringBuilder builder = new StringBuilder();
        Log.i(TAG,"data size = "+data.size());
        for (int j = 0; j < data.size(); j++) {
            if (j == 0) {
                builder.append("[" + data.get(0) + ",");
            } else if (j == data.size() - 1) {
                builder.append(data.get(data.size() - 1) + "]");
            } else {
                builder.append(data.get(j) + ",");
            }
            if (data.size() == 1) {
                builder.deleteCharAt(builder.length() - 1);
                builder.append("],");
            }
        }
        printSth(builder.toString());
    }
    
    

    private void printList(List<List<Integer>> data){
        StringBuilder builderOut = new StringBuilder();
        builderOut.append("[");
        for (int i = 0; i < data.size(); i++) {
            List<Integer> line = data.get(i);
            StringBuilder builder = new StringBuilder();
            Log.i(TAG,"line size = "+line.size());
            for (int j = 0; j < line.size(); j++) {
                if(j == 0){
                    builder.append("["+line.get(0)+",");
                }else if(j == line.size() - 1){
                    builder.append(line.get(line.size() - 1)+"]");
                }else{
                    builder.append(line.get(j)+",");
                }
                if(line.size() == 1){
                    builder.deleteCharAt(builder.length()-1);
                    builder.append("],");
                }
            }
            if(i > 0 && i < data.size() - 1) {
                builderOut.append(builder.toString() + ",");
            }else{
                builderOut.append(builder.toString());
            }
        }
        builderOut.append("]");
        printSth(builderOut.toString());
    }

    private void printSth(String msg){
        Log.i(TAG,"msg = "+msg);
        Log.i(TAG,"------------line-------------");
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
