package com.company.leetcode.problems.generateParentheses;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    @Test
    void generateParenthesis() {
        int n = 3;
        Solution solution = new Solution();
        System.out.println(solution.generateParenthesis(n));
    }
}