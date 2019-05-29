package com.zht.algorithm.daysix;

import java.util.ArrayList;
import java.util.List;

/**
 * author  :zhangtao
 * date    :2019/5/29 17:13
 * desc    :
 */
public class PascalTriangle {
    public static List<List<Integer>> generate(int numRows) {
        List<List<Integer>> datas = new ArrayList<>();
        for (int i = 0; i < numRows; i++) {
            List<Integer> lineData = new ArrayList<>();
            if(i == 0){
                lineData.add(1);
            }else if(i > 0){
                lineData.add(1);
                for (int j  = 1; j <= i-1; j++) {
                    lineData.add(datas.get(i - 1).get(j - 1) + datas.get(i - 1).get(j));
                }
                lineData.add(1);
            }
            datas.add(lineData);
        }
        return datas;
    }

    public static List<List<Integer>> generateTwo(int numRows) {
        List<List<Integer>> datas = new ArrayList<>();
        for (int i = 1; i <= numRows; i++) {
            List<Integer> lineData = new ArrayList<>();
            for (int j  = 0; j < i ; j++) {
                lineData.add(j > 0 && j < i - 1
                        ? datas.get(datas.size() - 1).get(j - 1) + datas.get(datas.size() - 1).get(j )
                        : 1);
            }
            datas.add(lineData);
        }
        return datas;
    }
}
