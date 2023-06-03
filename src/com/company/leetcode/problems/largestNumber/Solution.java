package com.company.leetcode.problems.largestNumber;

import java.util.Arrays;
import java.util.Comparator;

public class Solution {

    /**
     * 179. Largest Number https://leetcode.com/problems/largest-number/description/
     * @param nums
     * @return
     */
    public String largestNumber(int[] nums) {
        String[] strs = new String[nums.length];
        for (int i = 0 ; i < nums.length; i++) {
            strs[i] = String.valueOf(nums[i]);
        }
        Arrays.sort(strs, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                String left = o1 + o2;
                String right = o2 + o1;
                return -left.compareTo(right);
            }
        });

        StringBuilder sb = new StringBuilder();
        for (String s : strs) {
            sb.append(s);
        }
        while(sb.charAt(0)=='0' && sb.length()>1)
        {
            sb.deleteCharAt(0);
        }
        return sb.toString();
    }
}
