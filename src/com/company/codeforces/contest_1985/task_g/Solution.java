package com.company.codeforces.contest_1985.task_g;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Solution {

    public static final int MOD = (int)1e9+7;
    /**
     * https://codeforces.com/contest/1985/problem/G
     * @param args
     */
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int[] lrk = getArrayIntFromString(reader.readLine(), null);
        int l = lrk[0], r = lrk[1], k = lrk[2];

        System.out.println(solve(l, r, k));
    }

    private static int solve1(int l, int r, int k) {
        int count = 0;
        long base = 9 / k + 1;
        long powLeft = (long) Math.pow(base, l) % MOD;
        long powRight = (long) Math.pow(base, r) % MOD;

        for (long i = powLeft; i < powRight; i++) {
            if ((i + MOD) % MOD > 0) {
                count++;
            }
        }

        return count;
    }

    /**
     *
     * @param l
     * @param r
     * @param k
     * @return
     */
    private static long solve(int l, int r, int k) {
        long base = 9 / k + 1;
        long powLeft = (long) Math.pow(base, l) % MOD;
        long powRight = (long) Math.pow(base, r) % MOD;
        long ans = ((powRight - powLeft) + MOD) % MOD;

        return (long) Math.pow(base, r) - (long) Math.pow(base, l);
    }

    /**
     * Сумма чисел от 1 до N
     * @param n
     * @return
     */
    private static long sumAllNumsFrom1ToN(long n) {
        return (n * (n + 1)) / 2;
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
