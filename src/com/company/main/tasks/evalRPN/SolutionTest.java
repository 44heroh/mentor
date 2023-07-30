package com.company.main.tasks.evalRPN;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    @Test
    void evalRPN() {
        String[] tokens = {"2","1","+","3","*"};
        Solution solution = new Solution();
        System.out.println(solution.evalRPN(tokens));
    }
}