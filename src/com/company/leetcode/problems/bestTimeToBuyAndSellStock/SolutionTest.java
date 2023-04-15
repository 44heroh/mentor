package com.company.leetcode.problems.bestTimeToBuyAndSellStock;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    @Test
    void maxProfit() {
//        int[] prices = {7,1,5,3,6,4};
//        int[] prices = {7,6,4,3,1};
//        int[] prices = {1,2};
//        int[] prices = {2,4,1};
        int[] prices = {1,2,4,2,5,7,2,4,9,0,9};
        Solution solution = new Solution();
        int result = solution.maxProfit(prices);
        System.out.println(result);
    }
}