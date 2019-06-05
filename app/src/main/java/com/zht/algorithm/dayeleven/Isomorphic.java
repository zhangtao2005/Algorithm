package com.zht.algorithm.dayeleven;

import java.util.HashMap;

/**
 * author  :zhangtao
 * date    :2019/6/5 21:21
 * desc    :
 */
public class Isomorphic {
    public boolean isIsomorphic(String s, String t) {

        char[] chss = s.toCharArray();
        char[] chtt = t.toCharArray();

        char[] chs = new char[256];
        char[] cht = new char[256];

        for (int i = 0; i < chss.length; i++) {
            char ss = chss[i],tt = chtt[i];
            if (chs[ss] == 0 && cht[tt] == 0){
                chs[ss] = tt;
                cht[tt] = ss;
            }else{
                if(chs[ss] != tt || cht[tt] != ss){
                    return false;
                }
            }
        }
        return true;
    }

    public boolean isIsomorphicTwo(String s, String t) {
        if (s == null || t == null)
            return false;
        HashMap<Character, Character> map = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            char sChar = s.charAt(i),tChar = t.charAt(i);
            if (!map.containsKey(sChar)){
                if (map.containsValue(tChar))
                    return false;
                map.put(sChar,tChar);
            }else{
                if(map.get(sChar) != tChar)
                    return false;
            }
        }
        return true;
    }


}
