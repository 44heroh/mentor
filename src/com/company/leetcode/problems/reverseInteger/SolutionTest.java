package com.company.leetcode.problems.reverseInteger;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    @Test
    void reverse() {
        int x = 123;
        Solution solution = new Solution();
        System.out.println(solution.reverse(x));
    }

    @Test
    void reverse1() {
        int x = -123;
        Solution solution = new Solution();
        System.out.println(solution.reverse(x));
    }

    @Test
    void reverse2() {
        int x = 1534236469;
        Solution solution = new Solution();
        System.out.println(solution.reverse(x));
    }
}