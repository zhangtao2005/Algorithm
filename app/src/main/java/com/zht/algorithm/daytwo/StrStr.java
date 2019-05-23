package com.zht.algorithm.daytwo;

/**
 * author  :zhangtao
 * date    :2019/5/23 17:41
 * desc    :
 */
public class StrStr {
    public static int strStr(String haystack, String needle) {
        if(needle == null || haystack == null){
            return -1;
        }
        if(needle.equals("")){
            return 0;
        }
        if (haystack.equals("")){
            return -1;
        }
        char[] chHayStack = haystack.toCharArray();
        char[] chNeedle = needle.toCharArray();
        int firstIndex = -1;
        int needleLen = chNeedle.length;
        int stackLen = chHayStack.length;
        int iEnterLoopValue = -1;

        for (int i = 0; i < stackLen; i++) {
            if(chHayStack[i] == chNeedle[0]){
                if(stackLen - i < needleLen){
                    return -1;
                }
                firstIndex = i;
                iEnterLoopValue = i;
                for (int j = 1; j < needleLen; j++) {
                    if(chHayStack[++i] == chNeedle[j]){
                        continue;
                    }else{
                        firstIndex = -1;
                    }
                }
            }
            if(iEnterLoopValue != -1) {
                i = iEnterLoopValue;
                iEnterLoopValue = -1;
            }
            if(firstIndex != -1)
                break;
        }
        return firstIndex;
    }

    public static int strStrTwo(String haystack, String needle) {
        if(needle == null || needle.length() == 0){
            return 0;
        }

        int needleLen = needle.length();
        int stackLen = haystack.length();
        if(needleLen > stackLen){
            return -1;
        }

        for (int i = 0; i < stackLen; i++) {
           if(stackLen - i < needleLen){
               return -1;
           }
           if(haystack.charAt(i) != needle.charAt(0))
               continue;
           if(haystack.substring(i,i+needleLen).equals(needle)) {
               return i;
           }
        }
        return -1;
    }
}
