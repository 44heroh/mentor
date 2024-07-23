package com.company.leetcode.alexey.greedy.non_overlapping_intervals;

import java.util.Arrays;
import java.util.Comparator;

public class Solution {

    /**
     * 435. Non-overlapping Intervals
     *
     * Given an array of intervals intervals where intervals[i] = [starti, endi], return the minimum number of intervals you need to remove to make the rest of the intervals non-overlapping.
     *
     * Example 1:
     *
     * Input: intervals = [[1,2],[2,3],[3,4],[1,3]]
     * Output: 1
     * Explanation: [1,3] can be removed and the rest of the intervals are non-overlapping.
     *
     * Example 2:
     *
     * Input: intervals = [[1,2],[1,2],[1,2]]
     * Output: 2
     * Explanation: You need to remove two [1,2] to make the rest of the intervals non-overlapping.
     *
     * Example 3:
     *
     * Input: intervals = [[1,2],[2,3]]
     * Output: 0
     * Explanation: You don't need to remove any of the intervals since they're already non-overlapping.
     *
     * @param intervals
     * @return
     */
    public int eraseOverlapIntervals(int[][] intervals) {
        int n = intervals.length;
        Arrays.sort(intervals, new Comparator<int[]>() {
            @Override
            public int compare(int[] o1, int[] o2) {
                if (o1[0] == o2[0]) return o1[1] - o2[1];
                return o1[0] - o2[0];
            }
        });

        int[] dp = new int[n];
        dp[0] = 0;
        int ans = 0;

        for (int i = 1; i < n; i++) {
            if (intervals[i][0] <= intervals[dp[i - 1]][0] && intervals[i][1] >= intervals[dp[i - 1]][1]
            || intervals[dp[i - 1]][0] <= intervals[i][0] && intervals[dp[i - 1]][1] >= intervals[i][1]) {
                dp[i] = dp[i - 1];
                ans++;
            } else if (intervals[i][0] < intervals[dp[i - 1]][0] && intervals[i][1] > intervals[dp[i - 1]][0]
            || intervals[dp[i - 1]][0] < intervals[i][0] && intervals[dp[i - 1]][1] > intervals[i][0]) {
                dp[i] = dp[i - 1];
                ans++;
            } else {
                dp[i] = i;
                continue;
            }
        }

        return ans;
    }
}
