package com.company.leetcode.problems.countAndSay;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    @Test
    void countAndSay() {
        int n = 1;
        Solution solution = new Solution();
        System.out.println(solution.countAndSay(n));
    }

    @Test
    void countAndSay1() {
        int n = 4;
        Solution solution = new Solution();
        System.out.println(solution.countAndSay(n));
    }

    @Test
    void countAndSay2() {
        int n = 5;
        Solution solution = new Solution();
        System.out.println(solution.countAndSay(n));
    }
}