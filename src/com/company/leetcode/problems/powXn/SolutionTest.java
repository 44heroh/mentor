package com.company.leetcode.problems.powXn;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    @Test
    void myPow() {
        double x = 2.00000;
        int n = 10;
        Solution solution = new Solution();
        System.out.println(solution.myPow(x, n));
    }

    @Test
    void myPow1() {
        double x = 2.10000;
        int n = 2;
        Solution solution = new Solution();
        System.out.println(solution.myPow(x, n));
    }
}