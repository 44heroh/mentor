package com.company.leetcode.problems.powXn;

import java.util.HashMap;
import java.util.Map;

public class Solution {

    /**
     * 50. Pow(x, n) https://leetcode.com/problems/powx-n/
     * @param x
     * @param n
     * @return
     */
    public double myPow(double x, int n) {
        // n = 0 -> 1
        // n <0  -> 1 / result
        // 对于 奇数n 可以分解成 x(n/2) * x(n/2) * x

        double p = 1.0;
        long nn = n; // fucking Integer.MIN_VALUE;
        if (n<0) {
            nn = nn * -1;
        }

        p = pow(new HashMap<Long, Double>(), x, nn);

        if (n<0) {
            return (double)1.0 / p;
        }
        else {
            return p;
        }
    }

    private double pow(Map<Long, Double> results, double x, long n) {
        if (results.containsKey(n)) {
            return results.get(n);
        }
        else {
            double r;
            double tmp;
            if (n == 1) {
                r = x;
            }
            else if (n == 0) {
                r = 1;
            }
            else {
                // n >= 2
                tmp = pow(results, x, n / 2);
                r = tmp * tmp;
                if ( n % 2 == 1) {
                    r = r * x;
                }
            }

            results.put(n, r);
            return r;
        }
    }

    public double myPow1(double x, int n) {
        return Math.pow(x, n);
    }
}
