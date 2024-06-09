package com.company.teacheralexey.day_150624.task_2_7;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Solution {


    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        long n = Integer.parseInt(reader.readLine());

        System.out.println(solve(n));
    }

    private static long solve(long n) {
        long res = 0;

        for (int i = 2; i < 10; i++) {
            while (n % i == 0) {
                res *= 10;
                res += i;
                n /= i;
            }
        }

        if (n != 1) return -1;

        return res;
    }

}
