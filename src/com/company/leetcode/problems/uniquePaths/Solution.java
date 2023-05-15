package com.company.leetcode.problems.uniquePaths;

import java.util.Arrays;

public class Solution {

    /**
     * 62. Unique Paths https://leetcode.com/problems/unique-paths/
     * @param m
     * @param n
     * @return
     */
    public int uniquePaths(int m, int n) {
        int[][] dp = new int[m][n];
        if(m == 1 || n == 1)
            return 1;

        for (int i = 0; i < dp[0].length; i++) {
            dp[0][i] = 1;
        }

        for (int i = 0; i < dp.length; i++) {
            dp[i][0] = 1;
        }

        helper(dp, 1, 1);

        for (int i = 0; i < dp.length; i++) {
            System.out.println(Arrays.toString(dp[i]));
        }

        return dp[m - 1][n - 1];
    }

    private void helper(int[][] dp, int i, int j){
        dp[i][j] = dp[i-1][j] + dp[i][j-1];
        if(j == dp[0].length - 1 &&  i == dp.length - 1)
            return;

        if(j == dp[0].length - 1){
            i++;
            j = 1;
        } else {
            j++;
        }

        helper(dp, i, j);
    }

    public int uniquePath1(int m, int n) {

        int[][] dp = new int[m][n];

        for (int i = 0; i < dp[0].length; i++) {
            dp[0][i] = 1;
        }

        for (int i = 0; i < dp.length; i++) {
            dp[i][0] = 1;
        }

        for (int i = 1; i < dp.length; i++) {
            for (int j = 1; j < dp[0].length; j++) {
                dp[i][j] = dp[i-1][j] + dp[i][j-1];
            }
        }

        for (int i = 0; i < dp.length; i++) {
            System.out.println(Arrays.toString(dp[i]));
        }

        return dp[m - 1][n - 1];
    }
}
