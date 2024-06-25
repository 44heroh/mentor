package com.company.codeforces.contes_1986.task_a;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Solution {

    /**
     * https://codeforces.com/contest/1986/problem/A
     * @param args
     * @throws Exception
     */
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int[] a = getArrayIntFromString(reader.readLine(), null);
        int x1 = a[0], x2 = a[1], x3 = a[2];
        System.out.println(solve(a));
    }

    private static int solve(int[] arr) {
        int max = Arrays.stream(arr).max().getAsInt(), min = Arrays.stream(arr).min().getAsInt();

        return Math.abs(max - min);
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
