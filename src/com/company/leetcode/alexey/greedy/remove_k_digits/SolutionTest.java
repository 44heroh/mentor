package com.company.leetcode.alexey.greedy.remove_k_digits;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    @Test
    void removeKdigits1() {
        String num = "1432219";
        int k = 3;
        this.run(num, k);
    }

    @Test
    void removeKdigits2() {
        String num = "10200";
        int k = 1;
        this.run(num, k);
    }

    @Test
    void removeKdigits3() {
        String num = "10";
        int k = 2;
        this.run(num, k);
    }

    @Test
    void removeKdigits19() {
        String num = "10001";
        int k = 4;
        this.run(num, k);
    }

    private void run(String num, int k) {
        Solution solution = new Solution();
        System.out.println(solution.removeKdigits(num, k));
    }
}