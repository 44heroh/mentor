package com.company.main.tasks.mySqrt;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    @Test
    void mySqrt() {
        int x = 4;
        Solution solution = new Solution();
        System.out.println(solution.mySqrt(x));
    }

    @Test
    void mySqrt1() {
        int x = 8;
        Solution solution = new Solution();
        System.out.println(solution.mySqrt(x));
    }
}