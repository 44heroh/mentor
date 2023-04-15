package com.company.leetcode.problems.bestTimeToBuyAndSellStock;

import java.util.Arrays;

public class Solution {

    public int maxProfit(int[] prices) {
        if(prices.length == 1 || prices.length == 0)
            return 0;

        int max = 0;
        int left = 0;
        int right = 1;

       while(right < prices.length){
           if(prices[left] < prices[right]) {
               int diff = prices[right] - prices[left];
               if(diff > max)
                   max = diff;
           } else {
               left = right;
           }

           right++;
       }

        return max;
    }

}
