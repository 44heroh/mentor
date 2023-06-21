package com.company.main.tasks.maxArea;

public class Solution {

    /**
     * 11. Container With Most Water https://leetcode.com/problems/container-with-most-water/
     * @param heights
     * @return
     */
    public int maxArea(int[] heights) {
        int i = 0, j = heights.length - 1;
        int area = 0;
        while (i < j) {
            area = Math.max(area, (j - i) * Math.min(heights[j], heights[i]));
            if(heights[j] > heights[i]) {
                i++;
            } else {
                j--;
            }
        }

        return area;
    }
}
