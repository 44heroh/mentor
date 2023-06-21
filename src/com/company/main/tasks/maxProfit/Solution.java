package com.company.main.tasks.maxProfit;

public class Solution {

    /**
     * 121. Best Time to Buy and Sell Stock https://leetcode.com/problems/best-time-to-buy-and-sell-stock/
     * @param prices
     * @return
     */
    public int maxProfit1(int[] prices) {

        if(prices.length == 1 || prices.length == 0)
            return 0;

        int max = 0;
        int left = 0, right = 1;

       while (left < right && right < prices.length) {
           if(prices[left] < prices[right]) {
               int diff = prices[right] - prices[left];
               max = Math.max(diff, max);
           } else {
               left = right;
           }

           right++;
       }

        return max;
    }

    /**
     * 121. Best Time to Buy and Sell Stock https://leetcode.com/problems/best-time-to-buy-and-sell-stock/
     * @param prices
     * @return
     */
    public int maxProfit(int[] prices) {
        int minPrice = Integer.MAX_VALUE;
        int maxProfit = 0;

        for (int i = 0; i < prices.length; i++) {
            if (prices[i] < minPrice) {
                minPrice = prices[i];
            } else if(prices[i] - minPrice > maxProfit) {
                maxProfit = prices[i] - minPrice;
            }
        }

        return maxProfit;
    }
}
