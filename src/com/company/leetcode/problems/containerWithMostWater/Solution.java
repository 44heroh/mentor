package com.company.leetcode.problems.containerWithMostWater;

public class Solution {

    /**
     * 11. Container With Most Water https://leetcode.com/problems/container-with-most-water/
     * @param height
     * @return
     */
    public int maxArea(int[] height) {
        if(height.length < 2 && height.length > 10000)
            return 1;

        int area = 0;

        for(int i = 0; i < height.length; i++){
            for(int j = i + 1; j < height.length; j++){                if(height[i] >= 0 && height[i] <= 10000 && height[j] >= 0 && height[j] <= 10000){
                    area = Math.max(area, Math.min(height[i], height[j]) * (j - i));
                    System.out.println(i + " = " + height[i]);
                    System.out.println(j + " = " + height[j]);
                    System.out.println(area);
                    System.out.println(Math.min(height[i], height[j]) * (j - i));
                } else
                    return 1;
            }
        }

        return area;
    }
}
