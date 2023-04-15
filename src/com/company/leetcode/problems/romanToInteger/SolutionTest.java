package com.company.leetcode.problems.romanToInteger;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    @Test
    void romanToInt() {
        String s = "III";
        Solution solution = new Solution();
        System.out.println(solution.romanToInt(s));
    }

    @Test
    void romanToInt1() {
        String s = "LVIII";
        Solution solution = new Solution();
        System.out.println(solution.romanToInt(s));
    }

    @Test
    void romanToInt2() {
        String s = "MCMXCIV";
        Solution solution = new Solution();
        System.out.println(solution.romanToInt(s));
    }

    @Test
    void romanToInt3() {
        String s = "XIV";
        Solution solution = new Solution();
        System.out.println(solution.romanToInt(s));
    }

    @Test
    void romanToInt4() {
        String s = "MCDLXXVI";
        Solution solution = new Solution();
        System.out.println(solution.romanToInt(s));
    }

    @Test
    void romanToInt5() {
        String s = "MCDLXXIV";
        Solution solution = new Solution();
        System.out.println(solution.romanToInt(s));
    }
}