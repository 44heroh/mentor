package com.company.leetcode.problems.palindromePartitioning;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    @Test
    void partition() {
        String s = "aab";
        Solution solution = new Solution();
        System.out.println(solution.partition(s));
    }

    @Test
    void partition1() {
        String s = "a";
        Solution solution = new Solution();
        System.out.println(solution.partition(s));
    }

    @Test
    void partition2() {
        String s = "bb";
        Solution solution = new Solution();
        System.out.println(solution.partition(s));
    }

    @Test
    void partition3() {
        String s = "cdd";
        Solution solution = new Solution();
        System.out.println(solution.partition(s));
    }

    @Test
    void partition4() {
        String s = "efe";
        Solution solution = new Solution();
        System.out.println(solution.partition(s));
    }
}