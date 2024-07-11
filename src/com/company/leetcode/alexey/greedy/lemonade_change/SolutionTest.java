package com.company.leetcode.alexey.greedy.lemonade_change;

import org.junit.jupiter.api.Test;

class SolutionTest {

    @Test
    void lemonadeChange1() {
        int[] bills = {5,5,5,10,20};

        Solution solution = new Solution();

        System.out.println(solution.lemonadeChange(bills));
    }

    @Test
    void lemonadeChange2() {
        int[] bills = {5,5,10,10,20};

        Solution solution = new Solution();

        System.out.println(solution.lemonadeChange(bills));
    }

    @Test
    void lemonadeChange3() {
        int[] bills = {2, 3, 4};

        Solution solution = new Solution();

        System.out.println(solution.lemonadeChange(bills));
    }
}