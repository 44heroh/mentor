package com.company.leetcode.problems.findPeakElement;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Solution {
    /**
     * 162. Find Peak Element https://leetcode.com/problems/find-peak-element/
     * @param nums
     * @return
     */
    public int findPeakElement(int[] nums) {
        if(nums.length == 0 || nums.length == 1)
            return 0;

        int start = 0, end = nums.length -1, mid = 0;
        while (start < end) {
            mid = start + (end - start) / 2;
            if(nums[mid] > nums[mid + 1]) {
                end = mid;
            } else {
                start = mid + 1;
            }
        }

        return start;
    }

    public int findPeakElement2(int[] nums) {
        if(nums.length == 0 || nums.length == 1)
            return 0;

        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            map.put(nums[i], i);
        }

        Arrays.sort(nums);

        return map.get(nums[nums.length - 1]);
    }

    public int findPeakElement1(int[] nums) {
        if(nums.length == 0 || nums.length == 1)
            return 0;

        int left = 0, right = nums.length -1;
        int mid = 0;
        while (left <= right) {
            mid = (int) ((right + left) / 2);
            if (mid == right && nums[mid] > nums[mid - 1]) {
                return mid;
            } else if(mid == left && nums[mid] > nums[mid + 1]) {
                return mid;
            } else if ((left > 0 && right <= nums.length - 1)) {
                if (nums[mid] > nums[mid + 1] && nums[mid] > nums[mid - 1]) return mid;
            } else if(nums[mid] != nums[mid + 1] && right <= nums.length -1) {
                left = mid + 1;
            } else if(left > 0 && nums[mid] != nums[mid - 1]) {
                right = mid - 1;
            }
        }

        return mid;
    }
}
