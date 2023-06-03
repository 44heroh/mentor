package com.company.leetcode.problems.fractionToRecurringDecimal;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    @Test
    void fractionToDecimal() {
        int numerator = 1;
        int denominator = 2;
        Solution solution = new Solution();
        System.out.println(solution.fractionToDecimal(numerator, denominator));
    }

    @Test
    void fractionToDecimal2() {
        int numerator = 4;
        int denominator = 333;
        Solution solution = new Solution();
        System.out.println(solution.fractionToDecimal(numerator, denominator));
    }
}