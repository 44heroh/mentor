package com.company.teacheralexey.day_150624.task_3_5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Solution {

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int change = Integer.parseInt(reader.readLine());
        int countOneRubles = Integer.parseInt(reader.readLine());
        int countTwoRubles = Integer.parseInt(reader.readLine());

        System.out.println(solve(change, countOneRubles, countTwoRubles));
    }

    private static int solve(int total, int countOneRubles, int countTwoRubles) {
        int[][] dp = new int[countOneRubles + 1][countTwoRubles + 1];
        int countOne = 1;
        int countTwo = 1;
        int countRes = 0;
        boolean isBreak = false;
        int cur = 0;

        for (int i = 1; i < countOneRubles + 1; i++) {
            isBreak = false;
            int countTwoTmp = 1;

            cur += countOne;
            for (int j = countTwo; j < countTwoRubles + 1; j++) {
                int tmp = cur + (countTwoTmp * 2);
                if (tmp == total) {
                    countTwo = j;
                    cur = tmp;
                    break;
                }
                countTwoTmp++;
            }
            if (cur == total) {
                countOne = 1;
                countRes++;
                dp[i][countTwo] = countRes;
                countTwo += 1;
                cur = 0;
            }
        }

        for (int i = 1; i < countOneRubles + 1; i++) {
            System.out.println(Arrays.toString(dp[i]));
        }

        return countRes;
    }

    private static int solve1(int target, int countOneRubles, int countTwoRubles) {
        int count = 0;
        int countTwo = 1;
        int countOne = 1;
        for (int i = 1; i <= countOneRubles; i++) {
            int cur = 0;
            cur += countOne;
            int countTwoTmp = 1;
            countOne++;
            for (int j = countTwo; j <= countTwoRubles; j++) {
                cur = Math.max(cur, countOne + (countTwoTmp * 2));
                countTwoTmp++;
                if (target == cur) {
                    count++;
                    countTwo = j + 1;
                    countOne = 1;
                    break;
                }
            }
        }

        return count;
    }
}
