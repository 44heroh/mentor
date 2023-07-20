package com.company.main.tasks.combinations;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    @Test
    void combine() {
        int k = 2;
        int n = 4;
        Solution solution = new Solution();
        System.out.println(solution.combine(n, k));
    }
}