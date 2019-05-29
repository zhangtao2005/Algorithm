package com.zht.algorithm.daysix;

import java.util.ArrayList;
import java.util.List;

/**
 * author  :zhangtao
 * date    :2019/5/29 18:33
 * desc    :
 */
public class PascalTriangleII {
    public static List<Integer> getRow(int rowIndex) {
        List<Integer> rst = new ArrayList<>();
        if (rowIndex < 0)
            return rst;
        if(rowIndex == 0) {
            rst.add(1);
            return rst;
        }
        rst.add(1);
        ArrayList<Integer> data = new ArrayList<>();
        while (rowIndex > 0 ){
            data.add(1);
            for (int i = 0; i < rst.size() - 1; i++) {
                data.add(rst.get(i)+rst.get(i+1));
            }
            data.add(1);
            rst = (List<Integer>) data.clone();
            data.clear();
            rowIndex --;
        }
        return rst;
    }
}
