package com.company.leetcode.alexey.greedy.gas_station;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    @Test
    void canCompleteCircuit1() {
        int[] gas = {1,2,3,4,5};
        int[] cost = {3,4,5,1,2};

        Solution solution = new Solution();
        System.out.println(solution.canCompleteCircuit(gas, cost));
    }

    @Test
    void canCompleteCircuit2() {
        int[] gas = {2,3,4};
        int[] cost = {3,4,3};

        Solution solution = new Solution();
        System.out.println(solution.canCompleteCircuit(gas, cost));
    }
}