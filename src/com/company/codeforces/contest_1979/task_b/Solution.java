package com.company.codeforces.contest_1979.task_b;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Solution {

    /**
     * https://codeforces.com/contest/1979/problem/B
     * @param args
     */
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int[] xy = getArrayIntFromString(reader.readLine(), null);
        int x = xy[0], y = xy[1];

//        System.out.println(findMaxLengthXor(x, y));
        System.out.println(solve(x, y));
    }

    private static int solve(int x, int y) {
        int ans = 0;

        while (((x ^ y) & 1) == 0) {
            ans++;
            x >>= 1;
            y >>= 1;
        }

        return 1 << ans;
    }

    private static int solve1(int x, int y) {
        int ans = 0;

        while (x > -1 && y > -1) {
            int xorAnd1 = (x ^ y) & 1;
            if (xorAnd1 != 0) break;
            ans++;
            x >>= 1;
            y >>= 1;
        }

        return 1 << ans;
    }


    private static long findMaxLengthXor(int x, int y) {
        int n = x >= y ? x - y : y - x;
        n = n < 20 ? n + 20 : n;
        int[] a = helper(x, n);
        int[] b = helper(y, n);
        long count = 0;

        System.out.println(Arrays.toString(a));
        System.out.println(Arrays.toString(b));

        count = longestCommonSequence(a, b);
        return count;
    }

    private static long longestCommonSequence(int[] a, int[] b) {
        int n = a.length, m = b.length;
        long[][] dp = new long[n + 1][m + 1];
        System.out.println(n + " " + m);

        for (int i = 1; i < n + 1; i++) {
            for (int j = 1; j < m + 1; j++) {
                dp[i][j] = Math.max(dp[i - 1][j], dp[i][j - 1]);
                if (a[i - 1] == b[j - 1]) {
                    dp[i][j] = Math.max(dp[i][j], dp[i - 1][j - 1] + 1);
                }
            }
        }

//        for (int i = 0; i < n; i++) {
//            System.out.println(Arrays.toString(dp[i]));
//        }

        return dp[n][m];
    }

    private static int[] helper(int val, int n) {
        int[] res = new int[n - 1];
        for (int i = 0; i < n - 1; i++) {
            res[i] = i ^ val;
        }

        return res;
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
