package com.company.leetcode.problems.decodeWays;

import java.util.*;

public class Solution {

    /**
     * 91. Decode Ways https://leetcode.com/problems/decode-ways/
     * @param s
     * @return
     */
    public int numDecodings (String s) {
        int[] dp = new int[s.length()];
        Arrays.fill(dp, -1);
        return count(0, s, dp);
    }

    private int count(int i, String s, int[] dp) {
        if (s.length() == i) return 1;
        if (s.charAt(i) == '0') return 0;
        if (dp[i] != -1) return dp[i];
        int ans = count(i + 1, s, dp);
        if(i < s.length() - 1 && (s.charAt(i) == '1' || (s.charAt(i) == '2' && s.charAt(i + 1) < '7'))) {
            ans += count(i + 2, s, dp);
        }

        return dp[i] = ans;
    }

















































    public int numDecodings1 (String s) {
        int n = s.length();
        int[] ans = new int[n + 1];
        ans[0]=1;
        ans[1]=s.charAt(0)-'0'==0?0:1;
        for (int i = 2; i <= n; i++) {
            int current = s.charAt(i - 1) - '0';
            int prev = s.charAt(i - 2) - '0';
            int twoDigitNo = 10 * prev + current;
            if(current > 0 && current <= 9) {
                ans[i] += ans[i - 1];
            }
            if (twoDigitNo >= 10 && twoDigitNo <= 26) {
                ans[i] += ans[i - 2];
            }
        }
        return ans[n];
    }
}
