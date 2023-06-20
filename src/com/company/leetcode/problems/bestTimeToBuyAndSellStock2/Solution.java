package com.company.leetcode.problems.bestTimeToBuyAndSellStock2;

public class Solution {

    /**
     * 122. Best Time to Buy and Sell Stock II https://leetcode.com/problems/best-time-to-buy-and-sell-stock-ii/
     * @param prices
     * @return
     */
    public int maxProfit(int[] prices) {
        if(prices.length == 0 || prices.length == 1)
            return 0;

        int profit = 0;
        int minPrice = Integer.MAX_VALUE;

        for (int i = 0; i < prices.length; i++) {
            minPrice = Math.min(minPrice, prices[i]);
            if(prices[i] - minPrice > 0) {
                profit += prices[i] - minPrice;
                minPrice = prices[i];
            }
        }

        return profit;
    }

    public int maxProfit2(int[] prices) {
        if(prices.length == 0 || prices.length == 1)
            return 0;

        int left = 0;
        int right = 1;
        int proceeds = 0;

        while (right < prices.length) {
            if (prices[left] < prices[right]) {
               proceeds += prices[right] - prices[left];
               left = right;
               right++;
            } else {
                left++;
                right++;
            }
        }

        return proceeds;
    }

























    public int maxProfit1(int[] prices) {
        if (prices.length == 1 || prices.length == 0)
            return 0;

        int totalProfit = 0;
        int left = 0;
        int right = 1;

        while (right < prices.length) {
            if (prices[left] < prices[right]) {
                totalProfit += prices[right] - prices[left];
                left = right;
                right++;
            } else {
                left++;
                right++;
            }
        }

        return totalProfit;
    }
}

