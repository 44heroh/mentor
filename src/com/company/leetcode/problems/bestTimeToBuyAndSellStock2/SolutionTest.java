package com.company.leetcode.problems.bestTimeToBuyAndSellStock2;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    @Test
    void maxProfit() {
        int[] prices = {7,1,5,3,6,4};
        Solution solution = new Solution();
        System.out.println(solution.maxProfit(prices));
    }

    @Test
    void maxProfit1() {
        int[] prices = {1,2,3,4,5};
        Solution solution = new Solution();
        System.out.println(solution.maxProfit(prices));
    }

    @Test
    void maxProfit2() {
        int[] prices = {7,6,4,3,1};
        Solution solution = new Solution();
        System.out.println(solution.maxProfit(prices));
    }
}