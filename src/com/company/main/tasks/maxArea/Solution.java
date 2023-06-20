package com.company.main.tasks.maxArea;

public class Solution {


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
