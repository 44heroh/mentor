package com.company.codeforces.contest_1979.task_c;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Solution {

    /**
     * https://codeforces.com/contest/1979/problem/C
     * @param args
     */
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        long[] a = getArrayIntFromString(reader.readLine(), null);
        System.out.println(solve(a));
    }

    private static List<Long> solve(long[] k) {
        int n = k.length;
        List<Long> ans = new ArrayList<>();

        long z = 1;
        for (int i = 0; i < n; i++) {
            z = leastCommonMultiple(z, k[i]);
        }

        long Sum = 0;
        for (int i = 0; i < n; i++) {
            Sum += z / k[i];
        }

        if (Sum < z) {
            for (int i = 0; i < n; i++) {
                ans.add(z / k[i]);
            }
        } else {
            ans.add((long) -1);
            return ans;
        }

        return ans;
    }

    private static long leastCommonMultiple(long a, long b) {
        return a * b / greatesCommonDivisor(a, b);
    }

    private static long greatesCommonDivisor(long a, long b) {
        while (b != 0) {
            long tmp = a % b;
            a = b;
            b = tmp;
        }

        return a;
    }


    private static long[] getArrayIntFromString(String s, String regex) throws Exception {
        if (s == null || s.equals("") || s.length() == 0) {
            throw new Exception("s is null");
        }

        if (regex == null || regex.equals("") || regex.length() == 0) {
            regex = " ";
        }

        return Arrays.stream(s.split(regex)).mapToLong(Long::parseLong).toArray();
    }
}
