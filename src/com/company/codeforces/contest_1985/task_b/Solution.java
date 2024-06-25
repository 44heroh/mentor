package com.company.codeforces.contest_1985.task_b;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Solution {

    /**
     * https://codeforces.com/contest/1985/problem/B
     * @param args
     */
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int t = Integer.parseInt(reader.readLine());
        List<Integer> ans = new ArrayList<>();

        for (int i = 0; i < t; i++) {
            int n = Integer.parseInt(reader.readLine());
            ans.add(n == 1 ? 1 : n == 3 ? 3 : 2);
        }

        System.out.println(ans);
    }
}
