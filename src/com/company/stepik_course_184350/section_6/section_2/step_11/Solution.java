package com.company.stepik_course_184350.section_6.section_2.step_11;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Solution {

    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(reader.readLine());
        int[] prices = getArrayIntFromString(reader.readLine(), null);

        System.out.println(maxProfit(prices, n));
    }

    private static int maxProfit1(int[] prices, int n) {
        int maxProfit = (int) -1e4;

        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                maxProfit = Math.max(maxProfit, prices[j] - prices[i]);
            }
        }

        return maxProfit;
    }

    private static int maxProfit(int[] prices, int n) {
        int maxProfit = 0;
        int l = 0, r = 1;

        while (l < r && r < n) {
            if (prices[l] < prices[r]) {
                int diff = prices[r] - prices[l];
                maxProfit = Math.max(maxProfit, diff);
            } else {
                l = r;
            }
            r++;
        }

        return maxProfit;
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
