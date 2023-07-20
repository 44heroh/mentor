package com.company.main.tasks.pascalTriangle;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    @Test
    void generate() {
        int numRows = 5;
        Solution solution = new Solution();
        System.out.println(solution.generate(numRows));
    }
}