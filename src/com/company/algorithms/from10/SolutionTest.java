package com.company.algorithms.from10;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    @Test
    void from10_1() {
        int x = 27;
        int s = 2;
        this.run(x, s);
    }

    @Test
    void from10_2() {
        int x = 619;
        int s = 2;
        this.run(x, s);
    }

    void run(int x, int s) {
        Solution solution = new Solution();
        System.out.println(solution.from10(x, s));
    }
}