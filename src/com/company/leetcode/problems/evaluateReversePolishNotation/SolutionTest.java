package com.company.leetcode.problems.evaluateReversePolishNotation;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    @Test
    void evalRPN() {
        String[] tokens = {"2","1","+","3","*"};
        Solution solution = new Solution();
        System.out.println(solution.evalRPN(tokens));
    }

    @Test
    void evalRPN1() {
        String[] tokens = {"4","13","5","/","+"};
        Solution solution = new Solution();
        System.out.println(solution.evalRPN(tokens));
    }
}