package com.zht.algorithm.dayone;

import java.util.Stack;

/**
 * author  :zhangtao
 * date    :2019/5/22 16:09
 * desc    :
 */
public class ValidParentheses {
    public static boolean isValidTwo(String s) {
        if (s == null)
            return false;
        if (s.equals(""))
            return true;
        if(s.length()%2 != 0){
            return false;
        }
        Stack<Character> stack = new Stack<Character>();
        char[] chArr = s.toCharArray();
        for (char tChar:chArr) {
            if(tChar == '(' || tChar == '[' || tChar == '{'){
                stack.push(tChar);
            }else if (tChar == ')' || tChar == '}' || tChar == ']') {
                if(stack.isEmpty())
                    return false;
                if(tChar == ')' && stack.peek() == '('){
                    stack.pop();
                }else if(tChar == ']' && stack.peek() == '['){
                    stack.pop();
                }else if(tChar == '}' && stack.peek() == '{'){
                    stack.pop();
                }else{
                    return false;
                }
            }
        }

        return stack.isEmpty();
    }

    public static boolean isValid(String s) {
        if (s == null)
            return false;
        if (s.equals(""))
            return true;
        if(s.length()%2 != 0){
            return false;
        }
        StringBuilder sb = new StringBuilder(s);

        int indexOfSmall = -1 ;
        int indexOfMiddle = -1;
        int indexOfLarge = -1;
        while((indexOfSmall = sb.indexOf("()")) != -1 || (indexOfMiddle = sb.indexOf("[]")) != -1 || (indexOfLarge = sb.indexOf("{}")) != -1 ){
            if(indexOfSmall != -1)
                sb = sb.replace(indexOfSmall,indexOfSmall+2,"");
            else if(indexOfMiddle != -1)
                sb = sb.replace(indexOfMiddle,indexOfMiddle+2,"");
            else if(indexOfLarge != -1)
                sb = sb.replace(indexOfLarge,indexOfLarge+2,"");
        }

        return sb.toString().trim().length() == 0;
    }
}
