package com.company.codeforces.contest_1985.task_c;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.NoSuchElementException;

public class Solution {

    /**
     * https://codeforces.com/contest/1985/problem/C
     * @param args
     */
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(reader.readLine());
        int[] arr = getArrayIntFromString(reader.readLine(), null);

        System.out.println(solve(arr));
    }

    private static long solve(int[] arr) {
        int count = 0, n = arr.length;
        long sum = 0, max = 0;

        for (int i = 0; i < n; i++) {
            sum += arr[i];
            max = Math.max(max, arr[i]);
            if (sum - max == max) {
                count++;
            }
        }

        return count;
    }

    private static int solve1(int[] arr) {
        int count = 0, max = 0, n = arr.length, sum = 0;

        List<List<Integer>> lists = new ArrayList<>();
//        for (int i = 0; i < n; i++) {
//            lists.add(new ArrayList<>());
//        }

        List<Integer> tmpList = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            if (i > 0) {
                tmpList = lists.get(i - 1);
            }
            tmpList = new ArrayList<>(tmpList);
            tmpList.add(arr[i]);
            max = tmpList.stream().mapToInt(v -> v).max().getAsInt();
            sum = tmpList.stream().reduce(0, Integer::sum);
            if (sum - max == max) {
                count++;
            }
            lists.add(i, new ArrayList<>(tmpList));
        }

        System.out.println(lists);

        return count;
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
