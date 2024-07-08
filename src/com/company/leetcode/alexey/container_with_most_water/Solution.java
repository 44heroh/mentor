package com.company.leetcode.alexey.container_with_most_water;

public class Solution {

    /**
     * 11. Container With Most Water
     *
     * You are given an integer array height of length n. There are n vertical lines drawn such that the two endpoints of the ith line are (i, 0) and (i, height[i]).
     *
     * Find two lines that together with the x-axis form a container, such that the container contains the most water.
     *
     * Return the maximum amount of water a container can store.
     *
     * Notice that you may not slant the container.
     *
     * Example 1:
     *
     * Input: height = [1,8,6,2,5,4,8,3,7]
     * Output: 49
     * Explanation: The above vertical lines are represented by array [1,8,6,2,5,4,8,3,7]. In this case, the max area of water (blue section) the container can contain is 49.
     *
     * Input: height = [1,1]
     * Output: 1
     * @param height
     * @return
     */
    public int maxArea1(int[] height) {
        int n = height.length, l = 0, r = n - 1, maxArea = 0, minHeight = 0;

        while (l < r) {
            int diff = r - l;
            minHeight = Math.min(height[r], height[l]);
            maxArea = Math.max(maxArea, minHeight * diff);

            if (height[r] > height[l]) {
                l++;
            } else {
                r--;
            }
        }

        return maxArea;
    }

    public int maxArea(int[] height) {
        int n = height.length, l = 0, r = n - 1, maxArea = 0, minHeight = 0;

        while (l < r) {
            int diff = r - l;
            minHeight = Math.min(height[r], height[l]);
            maxArea = Math.max(maxArea, minHeight * diff);

            while (l < r && height[l] <= minHeight) {
                l++;
            }

            while (l < r && height[r] <= minHeight) {
                r--;
            }
        }

        return maxArea;
    }
}
