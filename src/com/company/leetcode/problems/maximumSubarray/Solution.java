package com.company.leetcode.problems.maximumSubarray;

import java.util.PriorityQueue;

public class Solution {
    /**
     * 53. Maximum Subarray https://leetcode.com/problems/maximum-subarray/
     * @param nums
     * @return
     */
    public int maxSubArray(int[] nums) {
        if(nums.length == 1)
            return nums[0];

        int currentSum = -1000000;
        int maxSum = -1000000;
        for (int i = 0; i < nums.length; i++){
            currentSum = Math.max(currentSum + nums[i], nums[i]);
            maxSum = Math.max(maxSum, currentSum);
        }

        return maxSum;
    }

    public int maxSubArray1(int[] nums) {
        return maxSubArraySum(nums, 0, nums.length - 1);
    }


    // Find the maximum possible sum in arr[]
    // such that arr[m] is part of it
    static int maxCrossingSum(int arr[], int l, int m,
                              int h)
    {
        // Include elements on left of mid.
        int sum = 0;
        int left_sum = Integer.MIN_VALUE;
        for (int i = m; i >= l; i--) {
            sum = sum + arr[i];
            if (sum > left_sum)
                left_sum = sum;
        }

        // Include elements on right of mid
        sum = 0;
        int right_sum = Integer.MIN_VALUE;
        for (int i = m; i <= h; i++) {
            sum = sum + arr[i];
            if (sum > right_sum)
                right_sum = sum;
        }

        // Return sum of elements on left
        // and right of mid
        // returning only left_sum + right_sum will fail for
        // [-2, 1]
        return Math.max(left_sum + right_sum - arr[m],
                Math.max(left_sum, right_sum));
    }

    // Returns sum of maximum sum subarray
    // in aa[l..h]
    static int maxSubArraySum(int arr[], int l, int h)
    {
        //Invalid Range: low is greater than high
        if (l > h)
            return Integer.MIN_VALUE;
        // Base Case: Only one element
        if (l == h)
            return arr[l];

        // Find middle point
        int m = (l + h) / 2;

        /* Return maximum of following three
        possible cases:
        a) Maximum subarray sum in left half
        b) Maximum subarray sum in right half
        c) Maximum subarray sum such that the
        subarray crosses the midpoint */
        return Math.max(
                Math.max(maxSubArraySum(arr, l, m-1),
                        maxSubArraySum(arr, m + 1, h)),
                maxCrossingSum(arr, l, m, h));
    }
}
