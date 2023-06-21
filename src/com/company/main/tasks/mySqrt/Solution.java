package com.company.main.tasks.mySqrt;

public class Solution {

    /**
     * 69. Sqrt(x) https://leetcode.com/problems/sqrtx/
     * @param x
     * @return
     */
    public int mySqrt(int x) {
        if(x < 2) {
            return x;
        }

        int l = 2;
        int r = x / 2;
        while (l <= r) {
            int pivot = (l + r) / 2;
            int num = pivot * pivot;
            if (num > x) {
                r = pivot - 1;
            } else if (num < x) {
                l = pivot + 1;
            } else {
                return r;
            }
        }

        return r;
    }
}
