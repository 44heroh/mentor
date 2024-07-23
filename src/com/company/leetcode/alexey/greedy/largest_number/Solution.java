package com.company.leetcode.alexey.greedy.largest_number;

import java.util.Arrays;

public class Solution {

    /**
     * https://leetcode.com/problems/largest-number/
     *
     * 179. Largest Number
     *
     * Given a list of non-negative integers nums, arrange them such that they form the largest number and return it.
     *
     * Since the result may be very large, so you need to return a string instead of an integer.
     *
     * Example 1:
     *
     * Input: nums = [10,2]
     * Output: "210"
     *
     * Example 2:
     *
     * Input: nums = [3,30,34,5,9]
     * Output: "9534330"
     *
     * @param nums
     * @return
     */
    public String largestNumber(int[] nums) {
        int n = nums.length;

        if (n == 0) return "";
        if (n == 1) return "" + nums[0];

        String[] s = new String[n];

        for (int i = 0; i < n; i++) {
            s[i] = "" + nums[i];
        }

        Arrays.sort(s, (a, b) -> {
            String s1 = a + b;
            String s2 = b + a;
            return s2.compareTo(s1);
        });

        if(s[0].equals("0"))
            return "0";

        StringBuilder sb = new StringBuilder();
        for (String str : s) {
            sb.append(str);
        }

        return sb.toString();
    }

    public String largestNumber1(int[] nums) {
        int n = nums.length;
        Integer[] numsArr = new Integer[n];
        for (int i = 0; i < n; i++) {
            numsArr[i] = nums[i];
        }

        Arrays.sort(numsArr, (x, y) -> {
            long sx = 10, sy = 10;
            while (sx <= x) {
                sx *= 10;
            }
            while (sy <= y) {
                sy *= 10;
            }
            return (int)(-sy * x - y + sx * y + x);
        });

        if (numsArr[0] == 0) {
            return "0";
        }

        StringBuilder ans = new StringBuilder();

        for (int num : numsArr) {
            ans.append(num);
        }

        return new String(ans);
    }
}
