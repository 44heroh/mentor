package com.company.codeforces.contest_1985.task_e;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Solution {

    /**
     * https://codeforces.com/contest/1985/problem/E
     * @param args
     */
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

//        int[] a = getArrayLongFromString(reader.readLine(), null);
//        int x = a[0], y = a[1], z = a[2], k = a[3];
//        System.out.println(solve2(x, y, z, k));

        long[] a = getArrayLongFromString(reader.readLine(), null);
        long x = a[0], y = a[1], z = a[2], k = a[3];

        System.out.println(solve(x, y, z, k));
    }

    private static int solve1(int x, int y, int z, int k) {
        int ways = 0, ans = 0;

        for (int a = 1; a <= x; a++) {
            for (int b = 1; b <= y; b++) {
                int multAB = a * b;
                if (k % multAB != 0) continue;
                int c = k / multAB;
                if (c > z) continue;
                ways = (x - a + 1) * (y - b + 1) * (z - c + 1);
                ans = Math.max(ans, ways);
            }
        }

        return ans;
    }

    private static int solve2(int x, int y, int z, int k) {
        int ways = 0, ans = 0, b = 0, c = 0;

        for (int a = 1; a <= x; a++) {
            b = leftBinarySearch(a, y, k);

            int multAB = (a * b);

            try {
                if (k % multAB != 0) continue;
            } catch (Exception e) {
                continue;
            }

            c = k / multAB;
            if (c > z) continue;

            ways = (x - a + 1) * (y - b + 1) * (z - c + 1);
            ans = Math.max(ans, ways);
        }

        return ans;
    }

    private static long solve(long x, long y, long z, long k) {
        long ways = 0, ans = 0, b = 0, c = 0;

        for (int a = 1; a <= x; a++) {
            b = leftBinarySearchLong(a, y, k);

            long multAB = (a * b);

            try {
                if (k % multAB != 0) continue;
            } catch (Exception e) {
                continue;
            }

            c = k / multAB;
            if (c > z) continue;

            ways = (x - a + 1) * (y - b + 1) * (z - c + 1);
            ans = Math.max(ans, ways);
        }

        return ans;
    }

    /**
     *
     * @param a
     * @param y
     * @param k
     * @return
     */
    private static int leftBinarySearch(int a, int y, int k) {
        int l = 1, r = y, b = 1;
        while (l + 1 < r) {
            b = (int)Math.ceil(((double)l + (double) r) / 2);
//            b = (l + r) / 2;
            int multAB = (a * b);
            if (k % multAB == 0) {
                l = b;
            } else {
                r = b;
            }
        }

        return l;
    }

    private static long leftBinarySearchLong(long a, long y, long k) {
        long l = 1, r = y, b = 1;
        while (l + 1 < r) {
            b = (int)Math.ceil(((double)l + (double) r) / 2);
//            b = (l + r) / 2;
            long multAB = (a * b);
            if (k % multAB == 0) {
                l = b;
            } else {
                r = b;
            }
        }

        return l;
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

    private static long[] getArrayLongFromString(String s, String regex) throws Exception {
        if (s == null || s.equals("") || s.length() == 0) {
            throw new Exception("s is null");
        }

        if (regex == null || regex.equals("") || regex.length() == 0) {
            regex = " ";
        }

        return Arrays.stream(s.split(regex)).mapToLong(Long::parseLong).toArray();
    }
}
