package com.company.main.tasks.trappingRainWater;

public class Solution {

    /**
     * 42. Trapping Rain Water https://leetcode.com/problems/trapping-rain-water/
     * @param arr
     * @return
     */
    public int trap(int[] arr) {
        int left = 0, right = arr.length - 1;
        int maxLeft = 0, maxRight = 0;
        int ans = 0;

        while (left <= right) {
            if(arr[left] <= arr[right]) {
                if(arr[left] >= maxLeft)
                    maxLeft = arr[left];
                else
                    ans += maxLeft - arr[left];
                left++;
            } else {
                if(arr[right] >= maxRight)
                    maxRight = arr[right];
                else
                    ans += maxRight - arr[right];
                right--;
            }
        }

        return ans;
    }
}
