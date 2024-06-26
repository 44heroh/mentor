package com.company.codeforces.contest_1986.task_c;

import com.company.codeforces.contest_1985.task_f.Pair;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;

public class Solution {


    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int[] nm = getArrayIntFromString(reader.readLine(), null);
        int n = nm[0], m = nm[1];
        String s = reader.readLine();
        int[] ind = getArrayIntFromString(reader.readLine(), null);
        String c = reader.readLine();

        System.out.println(solve(n, m, s, ind, c));
    }

    private static String solve(int n, int m, String s, int[] ind, String c) {
        char[] _c = c.toCharArray();
        char[] _s = s.toCharArray();

        List<Pair> pairList = new ArrayList<>();
        int[] cnt = new int[m];

        for (int i = 0; i < m; i++) {
            pairList.add(new Pair(cnt[i]++, ind[i] - 1, _c[i]));
        }

        Arrays.sort(_c);
//        pairList.sort(Comparator.comparing(pair -> pair.index));
        StringBuilder sb = new StringBuilder(s);

        for (int i = m - 1; i >= 0; i--) {
            sb.setCharAt(pairList.get(i).index, _c[i]);
        }

        return new String(sb);
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

    static class Pair {
        int count;
        int index;
        char character;

        public Pair(int count, int index, char character) {
            this.count = count;
            this.index = index;
            this.character = character;
        }

        @Override
        public String toString() {
            return "Pair{" +
                    "count=" + count +
                    ", index=" + index +
                    ", character=" + character +
                    '}';
        }
    }
}
