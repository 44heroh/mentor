package com.company.leetcode.problems.plusOne;

import java.util.ArrayList;

public class Solution {

    public int[] plusOne1(int[] digits) {
        ArrayList<Integer> list = new ArrayList<>();
        for (int i : digits) {
            list.add(i);
        }
        System.out.println(list.size());

        int tmp = 1;
        for(int i = list.size() - 1; i >= 0; i--) {
            list.set(i, list.get(i) + tmp);
            if(list.get(i) == 10) {
                list.set(i, 0);
            } else {
                tmp = 0;
            }
        }

        if(tmp == 1) {
            list.add(0, tmp);
        }

        int[] result = new int[list.size()];
        for(int j = 0; j < list.size(); j++) {
            result[j] = list.get(j);
        }

        return result;
    }

    public int[] plusOne(int[] digits) {

        int balance = 1;
        int i = digits.length - 1;

        while(balance != 0 && i > -1) {
            int total = digits[i] + balance;
            balance = total / 10;
            digits[i] = total % 10;
            i--;
        }

        if(balance == 1) {
            digits = new int[digits.length + 1];
            digits[0] = 1;
        }

        return digits;
    }
}
