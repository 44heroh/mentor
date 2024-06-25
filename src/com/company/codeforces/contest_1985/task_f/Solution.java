package com.company.codeforces.contest_1985.task_f;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.PriorityQueue;

public class Solution {

    /**
     * https://codeforces.com/contest/1985/problem/F
     * @param args
     */
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int[] hn = getArrayIntFromString(reader.readLine(), null);
        int h = hn[0], n = hn[1];
        int[] a = getArrayIntFromString(reader.readLine(), null);
        int[] c = getArrayIntFromString(reader.readLine(), null);

        System.out.println(solve(h, n, a, c));
    }

    private static long solve(int h, int n, int[] a, int[] c) {
        long lastTurn = 1;
        PriorityQueue<Pair> pq = new PriorityQueue<>();
        for (int i = 0; i < n; i++) {
            pq.add(new Pair(1, c[i], i));
        }

        while (h > 0) {
            Pair current = pq.poll();
            lastTurn = current.turn;
            h -= a[current.index];
            pq.offer(new Pair(current.turn + current.refresh, current.refresh, current.index));
        }

        return lastTurn;
    }

    private static long solveArr(int h, int n, int[] a, int[] c) {
        long lastTurn = 1;

        long[] arr = new long[n];
        Arrays.fill(arr, 1);

        int i = 0;
        while (h > 0) {
            long current = arr[i];
            lastTurn = current;
            h -= a[i];
            arr[i] = current + c[i];
            if (i == n - 1) {
                i = 0;
            } else {
                i++;
            }
        }

        return lastTurn;
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