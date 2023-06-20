package com.company.main.tasks.maxProfit;

public class Solution {

    public int maxProfit1(int[] prices) {

        if(prices.length == 1 || prices.length == 0)
            return 0;

        int max = 0;
        int left = 0, right = 1;

       while (left < right) {
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
