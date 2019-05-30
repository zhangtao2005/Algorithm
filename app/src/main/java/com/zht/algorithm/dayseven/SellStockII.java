package com.zht.algorithm.dayseven;

/**
 * author  :zhangtao
 * date    :2019/5/30 12:29
 * desc    :
 */
public class SellStockII {
    public static int maxProfitTwo(int[] prices) {
        if(prices == null || prices.length == 0)
            return 0;
        int curr = 0,profit = 0,peek = 1;
        while (curr < prices.length){
            while (peek < prices.length && prices[peek -1] < prices[peek]){
                peek++;
            }
            profit += prices[peek - 1] - prices[curr];
            curr = peek;
            peek = curr + 1;
        }
        return profit;
    }

    public static int maxProfit(int[] prices) {
        if(prices == null || prices.length == 0)
            return 0;
        int profit = 0;
        for(int i=1;i<prices.length;i++){
            if(prices[i] > prices[i-1]){
                profit += prices[i] - prices[i-1];
            }
        }
        return profit;
    }
}
