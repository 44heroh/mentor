package com.company.codeforces.contest_1979.task_a;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;

public class Solution {

    /**
     * https://codeforces.com/contest/1979/problem/A
     *
     * @param args
     */
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
//        int count = Integer.parseInt(reader.readLine());
        int[] nums = getArrayIntFromString(reader.readLine(), null);

        System.out.println(minFromSubArray(nums));
    }

    private static int minFromSubArray(int[] nums) {
        int n = nums.length;
        List<Integer> ans = new ArrayList<>();
        int max = 0;

        for (int i = 1; i < n; i++) {
            max = Math.max(nums[i - 1], nums[i]);
            ans.add(max);
        }

        int min = Collections.min(ans) - 1;
        return min;
    }

    private static int[] getArrayIntFromString(String s, String regex) throws Exception {
        if (s == null || s.equals("") || s.length() == 0) {
            throw new Exception("s is null");
        }

        if (regex == null || regex.equals("") || regex.length() == 0) {
            regex = " ";
        }

        return Arrays.stream(s.split(regex)).mapToInt(Integer::parseInt).toArray();
    }
}
