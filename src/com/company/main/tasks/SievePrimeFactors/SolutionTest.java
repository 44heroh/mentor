package com.company.main.tasks.SievePrimeFactors;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    @Test
    void sievePrimeFactors() {
        int num = 50;
        Solution solution = new Solution();
        System.out.println(solution.SievePrimeFactors(num));
    }
}