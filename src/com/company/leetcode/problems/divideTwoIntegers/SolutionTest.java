package com.company.leetcode.problems.divideTwoIntegers;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    @Test
    void divide() {
        int dividend = 10;
        int divisor = 3;
        Solution solution = new Solution();
        System.out.println(solution.divide(dividend, divisor));
    }

    @Test
    void divide1() {
        int dividend = 7;
        int divisor = 3;
        Solution solution = new Solution();
        System.out.println(solution.divide(dividend, divisor));
    }

    @Test
    void divide2() {
        int dividend = -1;
        int divisor = 1;
        Solution solution = new Solution();
        System.out.println(solution.divide(dividend, divisor));
    }

    @Test
    void divide3() {
        int dividend = -Integer.MAX_VALUE;
        int divisor = 1;
        Solution solution = new Solution();
        System.out.println(solution.divide(dividend, divisor));
    }
}