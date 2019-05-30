package com.zht.algorithm.dayseven;

/**
 * author  :zhangtao
 * date    :2019/5/30 11:07
 * desc    :
 */
public class SellStockI {
    public static int maxProfit(int[] prices) {
        if(prices == null || prices.length == 0)
            return 0;
        int minPrice = prices[0],maxProfit = 0;
        for (int i = 1; i < prices.length; i++) {
            if(prices[i] < minPrice){
                minPrice = prices[i];
            }else{
                maxProfit = Math.max(maxProfit,prices[i] - minPrice);
            }
        }
        return maxProfit;
    }
}
