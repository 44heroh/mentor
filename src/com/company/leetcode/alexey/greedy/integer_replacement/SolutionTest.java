package com.company.leetcode.alexey.greedy.integer_replacement;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    @Test
    void integerReplacement1() {
        int n = 8;
        this.start(n);
    }

    @Test
    void integerReplacement2() {
        int n = 7;
        this.start(n);
    }

    @Test
    void integerReplacement3() {
        int n = 4;
        this.start(n);
    }

    @Test
    void integerReplacement11() {
        int num = 4;
        System.out.println(num & 2);
        int num1 = 204804;
        System.out.println(num1 & 2);
        int n = 1234;
        this.start(n);
    }

    @Test
    void integerReplacement22() {
        int n = 3;
        this.start(n);
    }

    @Test
    void integerReplacement23() {
        int n = 11;
        this.start(n);
    }

    @Test
    void integerReplacement24_1() {
        int n = 65535;
        this.start(n);
    }

    @Test
    void integerReplacement24_2() {
        int n = 1000;
        this.start(n);
    }

    @Test
    void integerReplacement46() {
        int n = 2147483647;
        this.start(n);

        int num = 4;
        System.out.println(num & 2);
    }

    void start(int n) {
        Solution solution = new Solution();
        System.out.println(solution.integerReplacement(n));
    }
}