package com.company.teacheralexey.day_150624.task_4_6;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Solution {

    /**
     *
     * @param args
     * @throws Exception
     */
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int[] nm = getArrayIntFromString(reader.readLine(), null);
        int n = nm[0], m = nm[1];

        System.out.println(solve(n, m));
    }

    private static int solve(int countClientPerDay, int countDeliveryPerDay) {
        int balance = 0, countDay = 1;

        while (balance > -1) {
            balance = (countDeliveryPerDay + balance) - countClientPerDay;
            countClientPerDay++;
            countDay++;
        }

        return countDay - 1;
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
