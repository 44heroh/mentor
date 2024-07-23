package com.company.leetcode.alexey.greedy.wiggle_subsequence;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Solution {

    /**
     * https://leetcode.com/problems/wiggle-subsequence/
     *
     * 376. Wiggle Subsequence
     *
     * A wiggle sequence is a sequence where the differences between successive numbers strictly alternate between positive and negative. The first difference (if one exists) may be either positive or negative. A sequence with one element and a sequence with two non-equal elements are trivially wiggle sequences.
     *
     * For example, [1, 7, 4, 9, 2, 5] is a wiggle sequence because the differences (6, -3, 5, -7, 3) alternate between positive and negative.
     * In contrast, [1, 4, 7, 2, 5] and [1, 7, 4, 5, 5] are not wiggle sequences. The first is not because its first two differences are positive, and the second is not because its last difference is zero.
     * A subsequence is obtained by deleting some elements (possibly zero) from the original sequence, leaving the remaining elements in their original order.
     *
     * Given an integer array nums, return the length of the longest wiggle subsequence of nums.
     *
     * @param nums
     * @return
     */
    public int wiggleMaxLength(int[] nums) {
        int n = nums.length;
        if (n == 1) return 1;
        int a = 0, b = 0, diff = 0, prevDiff = 0;
        List<Integer> ans = new ArrayList<>();

        for (int i = 1; i < n; i++) {
            diff = nums[i] - nums[i - 1];
            if (diff > 0) {
                a = b + 1;
            } else if (diff < 0) {
                b = a + 1;
            } else {
                continue;
            }

            if (prevDiff >= 0 && diff < 0) {
                ans.add(nums[i]);
                prevDiff = diff;
            } else if (prevDiff <= 0 && diff > 0) {
                ans.add(nums[i]);
                prevDiff = diff;
            } else {
                continue;
            }
        }

        ans.add(0, nums[0]);
        System.out.println(ans);

        return 1 + Math.max(a, b);
    }

    public int wiggleMaxLength2(int[] nums) {
        int n = nums.length;
        if (n == 1) return 1;
        int k = 1, lastIndex = 0;

        List<Integer> ans = new ArrayList<>();
        int prevDiff = nums[k] - nums[lastIndex];
        if (prevDiff == 0) {
            while (k < n && nums[k] - nums[k - 1] == 0) {
                k++;
            }
            prevDiff = nums[k] - nums[k - 1];
        }
        int length = prevDiff != 0 ? 2 : 1;
        int diff = 0;
        ans.add(nums[k - 1]);
        ans.add(nums[k]);
        if (k == 1) {
            k++;
        }
        lastIndex = k - 1;

        for (int i = k; i < n; i++) {
            diff = nums[i] - nums[lastIndex];

            if ((prevDiff <= 0 && diff > 0) || (prevDiff >= 0 && diff < 0)) {
                ans.add(nums[i]);
                length++;
                prevDiff = diff;
                lastIndex = i;
            } else {
                continue;
            }
        }

        System.out.println(ans);

        return length;
    }
    public int wiggleMaxLength1(int[] nums) {
        int n = nums.length, count = 0, lastIndex = 0;
        if (n == 0) return 0;
        if (n == 1) return 1;

        List<Integer> ans = new ArrayList<>();
        List<Integer> diffs = new ArrayList<>();
        int i = 1;

        if (nums[1] > nums[0]) {
            ans.add(nums[0]);
        } else if (nums[1] == nums[0]){
            while (i < n && nums[i] == nums[i - 1]) {
                i++;
            }
            lastIndex = i - 1;
            if (i == n) {
                return 1;
            } else {
                ans.add(nums[lastIndex]);
                count = 1;
            }
        }

        for (; i < n; i++) {
            int diff = nums[i] - nums[lastIndex];
            if ((count % 2 != 0 && diff >= 0) || (count % 2 == 0 && diff < 0)) {
                continue;
            } else {
                ans.add(nums[i]);
                lastIndex = i;
                count++;
            }
        }

        return ans.size();
    }
}
