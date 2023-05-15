package com.company.leetcode.problems.mergeIntervals;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class Solution {

    /**
     * 56. Merge Intervals https://leetcode.com/problems/merge-intervals/
     * @param intervals
     * @return
     */
    public int[][] merge(int[][] intervals) {
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;

        for (int[] interval: intervals){
            min = Math.min(interval[0], min);
            max = Math.max(interval[1], max);
        }

        int[] range = new int[max - min + 1];
        for (int[] interval: intervals) {
            range[interval[0] - min] = Math.max(interval[1] - min, range[interval[0] - min]);
        }

        int start = 0, end = 0;
        LinkedList<int[]> result = new LinkedList<>();
        for (int i = 0; i < range.length; i++) {
            if (range[i] == 0)
                continue;

            if (i <= end){
                end = Math.max(range[i], end);
            } else {
                result.add(new int[]{start + min, end + min});
                start = i;
                end = range[i];
            }
        }
        result.add(new int[]{start + min, end + min});
        return result.toArray(new int[result.size()][]);
    }

    public int[][] merge1(int[][] intervals) {

        Arrays.sort(intervals, (a, b) ->
        {
            if (a[1] == b[1])
            {
                return a[0] - b[0];
            }

            return a[1] - b[1];
        });

        LinkedList<int[]> list = new LinkedList<>();
        for (int[] interval : intervals)
        {
            if (!list.isEmpty() && list.getLast()[1] >= interval[0])
            {
                while (!list.isEmpty() && list.getLast()[1] >= interval[0])
                {
                    interval[0] = Math.min(list.getLast()[0], interval[0]);
                    interval[1] = Math.max(list.getLast()[1], interval[1]);
                    list.removeLast();
                }
            }

            list.addLast(interval);
        }

        int pos = 0;
        int[][] answer = new int[list.size()][];
        for (int[] inteval : list)
        {
            answer[pos++] = inteval;
        }

        return answer;
    }

    public int[][] merge2(int[][] intervals) {

        if(intervals.length == 1)
            return intervals;

        List<List<Integer>> ans = new ArrayList<>();
        List<Integer> list = new ArrayList<>();
        for(int i = 1; i < intervals.length; i++) {
            if (intervals[i - 1][1] < intervals[i][0]) {
                if(list.size() == 0)
                    list.add(intervals[i - 1][0]);
                list.add(intervals[i - 1][1]);
                ans.add(list);
                list = new ArrayList<>();
                list.add(intervals[i][0]);
            } else if(intervals[i - 1][1] >= intervals[i][0]){
                list.add(intervals[i - 1][0]);
            }
        }

        list.add(intervals[intervals.length - 1][1]);
        ans.add(list);

        int[][] result = ans.stream()
                .map(l -> l.stream().mapToInt(Integer::intValue).toArray())
                .toArray(int[][]::new);

        return result;
    }
}
