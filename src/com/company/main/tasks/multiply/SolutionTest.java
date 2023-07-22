package com.company.main.tasks.multiply;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    @Test
    void multiply() {
        String num1 = "123", num2 = "456";
        Solution solution = new Solution();
        System.out.println(solution.multiply(num1, num2));
    }
}