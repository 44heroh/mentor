package com.company.main.tasks.generateParenthesis;

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