package com.company.algorithms.fibonacci;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    @Test
    void fibonacci() {
        int n = 10;

        Solution solution = new Solution();
        System.out.println(solution.fibonacci(n));
    }
}