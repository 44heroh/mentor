package com.company.main.tasks.findLength;

import java.util.*;

public class Solution {

    /**
     * 718. Maximum Length of Repeated Subarray https://leetcode.com/problems/maximum-length-of-repeated-subarray/
     * @param nums1
     * @param nums2
     * @return
     */
    public int findLength(int[] nums1, int[] nums2) {
        if(nums1.length < nums2.length)
            return findLength(nums2, nums1);

        int n = nums1.length, m = nums2.length;
        int[][] dp = new int[m + 1][n + 1];
        int maxLength = 0;
        Map<Integer, Integer> map = new HashMap<>();

        for (int i = 1; i <= m; i++) {
            for (int j = 1; j <= n; j++) {
                if(nums1[i - 1] == nums2[j - 1]) {
                    dp[i][j] = dp[i - 1][j - 1] + 1;
                    map.putIfAbsent(nums1[i - 1], j);
                    maxLength = Math.max(maxLength, dp[i][j]);
                }
            }
        }

        int[] ans = new int[map.size()];
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            ans[entry.getValue() - 1] = entry.getKey();
        }

        System.out.println(Arrays.toString(ans));

        return maxLength;
    }
}
