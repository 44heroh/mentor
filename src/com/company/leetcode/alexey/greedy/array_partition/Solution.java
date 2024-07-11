package com.company.leetcode.alexey.greedy.array_partition;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Solution {

    /**
     * https://leetcode.com/problems/array-partition/
     *
     * 561. Array Partition
     *
     * Given an integer array nums of 2n integers, group these integers into n pairs (a1, b1), (a2, b2), ..., (an, bn) such that the sum of min(ai, bi) for all i is maximized.
     * Return the maximized sum.
     *
     * Input 1: nums = [1,4,3,2]
     * Output 1: 4
     *
     * Input 2: nums = [6,2,6,5,1,2]
     * Output 2: 9
     *
     * @param nums
     * @return
     */
    public int arrayPairSum(int[] nums) {
        int n = nums.length;
        Arrays.sort(nums);
        int sum = 0;

        for (int i = 0; i < n; i += 2) {
            sum += Math.min(nums[i], nums[i + 1]);
        }

        return sum;
    }

    public int arrayPairSum1(int[] nums) {
        int n = nums.length, k = 2, index = 0;
        Arrays.sort(nums);
        List<List<Integer>> list = new ArrayList<>();
        List<Integer> sub = new ArrayList<>();

        generating(nums, index, k, list, sub);

        System.out.println(list.size());
        System.out.println(list);

        int l = 0, r = list.size() - 1;
        int maxSum = Integer.MIN_VALUE;

        while (l < r) {
            maxSum = Math.max(maxSum, Math.min(list.get(l).get(0), list.get(l).get(1)) + Math.min(list.get(r).get(0), list.get(r).get(1)));
            l++;
            r--;
        }

        return maxSum;
    }

    private void generating(int[] nums, int start, int k, List<List<Integer>> list, List<Integer> sub) {
        if (sub.size() == k /*&& !list.contains(sub)*/) {
            list.add(new ArrayList<>(sub));
            return;
        }

        for (int i = start; i < nums.length; i++) {
            sub.add(nums[i]);
            generating(nums, i + 1, k, list, sub);
            sub.remove(sub.size() - 1);
        }
    }
}
