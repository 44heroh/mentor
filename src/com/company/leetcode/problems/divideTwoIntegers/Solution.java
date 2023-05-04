package com.company.leetcode.problems.divideTwoIntegers;

import java.util.ArrayList;
import java.util.List;

public class Solution {
    /**
     * 29. Divide Two Integers https://leetcode.com/problems/divide-two-integers/
     * @param dividend
     * @param divisor
     * @return
     */
    public int divide(int dividend, int divisor) {

        // Special case: overflow.
        if (dividend == Integer.MIN_VALUE && divisor == -1) {
            return Integer.MAX_VALUE;
        }

        boolean sign = true;
        if ((dividend < 0 && divisor < 0) ||  (dividend > 0 && divisor > 0)) {
            sign = true;
        } else if (dividend < 0 || divisor < 0){
            sign = false;
        }
        long a = Math.abs(dividend);
        long b = Math.abs(divisor);
        a = Math.abs(a);
        b = Math.abs(b);

        long temp = b;
        List<Long> list = new ArrayList<>();
        while (temp <= a) {
            list.add(temp);
            temp = temp + temp;
        }
        long ans = 0;
        for (int index = list.size() - 1; index >= 0; index--) {
            if (list.get(index) <= a) {
                a = a - list.get(index);
                ans += list.get(index) / b;
            }
        }

        return (int) (sign ? ans : -ans);
    }

    public int divide3(int dividend, int divisor) {
        if (dividend == Integer.MIN_VALUE && divisor == -1)
            return Integer.MAX_VALUE;

        boolean sign = true;
        if ((dividend < 0 && divisor < 0) || (dividend > 0 && divisor > 0)){
            sign = true;
        } else if(dividend < 0 || divisor < 0) {
            sign = false;
        }

        long a = Math.abs(dividend);
        long b = Math.abs(divisor);
        a = Math.abs(a);
        b = Math.abs(b);

        long temp = b;
        List<Long> list = new ArrayList<>();
        while (temp <= a) {
            list.add(temp);
            temp = temp + temp;
        }

        long ans = 0;
        for (int i = list.size() - 1; i >= 0; i--){
            if (list.get(i) <= dividend) {
                a = a - list.get(i);
                ans += list.get(i) / b;
            }
        }

        return (int)(sign ? ans : -ans);
    }

    public int divide2(int dividend, int divisor) {
        if(dividend == Integer.MIN_VALUE && divisor == -1)
            return Integer.MAX_VALUE;
        else
            return (int)(dividend / divisor);
    }

    public int divide1(int dividend, int divisor) {
        int result = 0;

        double remainderDivision = 1.0;
        int count = 0;
        while(remainderDivision > 0 && dividend >= 0){
            remainderDivision = dividend % divisor;
            dividend -= divisor;
            count++;
            if(dividend - divisor < 0)
                break;
        }
        return count;
    }
}
