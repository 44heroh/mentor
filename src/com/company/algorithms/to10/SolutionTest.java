package com.company.algorithms.to10;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    Solution solution = new Solution();

    @Test
    void to10_1() {
        String x = "111";
        int d = 2;
        this.run(x, d);
    }

    @Test
    void to10_2() {
        String x = "1111";
        int d = 2;
        this.run(x, d);
    }

    private void run(String x, int d) {
        System.out.println(solution.to10(x, d));
    }
}