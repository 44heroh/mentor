package com.company.codeforces.contest_1985.task_a;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Solution {

    /**
     * https://codeforces.com/contest/1985/problem/A
     * @param args
     */
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(reader.readLine());

        while (n-- >= 0) {
            solve(reader);
        }
    }

    private static void solve(BufferedReader reader) throws Exception {
        String[] arr = (String[]) getArrayIntFromString(reader.readLine(), null);

        if (arr[0].equals(arr[1])) {
            System.out.println(arr[0] + " " + arr[1]);
            return;
        }

        char[] a = arr[0].toCharArray();
        char[] b = arr[1].toCharArray();

        char tmpA = a[0];
        a[0] = b[0];
        b[0] = tmpA;

        String aAns = new String(a);
        String bAns = new String(b);

        System.out.println(aAns + " " + bAns);
        return;
    }

    private static String[] getArrayIntFromString(String s, String regex) throws Exception {
        if (s == null || s.equals("") || s.length() == 0) {
            throw new Exception("s is null");
        }

        if (regex == null || regex.equals("") || regex.length() == 0) {
            regex = " ";
        }

        return s.split(regex);
    }
}
