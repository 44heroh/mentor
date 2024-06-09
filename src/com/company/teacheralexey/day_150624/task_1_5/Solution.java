package com.company.teacheralexey.day_150624.task_1_5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Solution {


    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(reader.readLine());

        System.out.println(solve(n));
    }

    private static int solve(int n) {
        return n <= 6 ? 1 : (n - 6) / 4;
    }
}
