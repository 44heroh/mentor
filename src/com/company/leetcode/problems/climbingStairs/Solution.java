package com.company.leetcode.problems.climbingStairs;

import java.util.Arrays;

public class Solution {

    /**
     * 70. Climbing Stairs https://leetcode.com/problems/climbing-stairs/description/
     * @param n
     * @return
     */
    public int climbStairs(int n) {

        if(n == 1) return 1;
        if(n == 2) return 2;

        int[] dp = new int[n + 1];
        dp[0] = 1;
        dp[1] = 1;

        for(int i = 2; i <= n; i++) {
            dp[i] = dp[i - 2] + dp[i - 1];
        }

        return dp[n];
    }

    public int fib(int n) {
        if(n <= 1) {
            return 0;
        } else if(n == 2) {
            return 1;
        }

        return fib(n - 2) + fib(n - 1);
    }
}
