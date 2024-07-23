package com.company.leetcode.alexey.greedy.increasing_triplet_subsequence;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    @Test
    void increasingTriplet1() {
        int[] nums = {1,2,3,4,5};

        Solution solution = new Solution();
        System.out.println(solution.increasingTriplet(nums));
    }

    @Test
    void increasingTriplet2() {
        int[] nums = {5,4,3,2,1};

        Solution solution = new Solution();
        System.out.println(solution.increasingTriplet(nums));
    }

    @Test
    void increasingTriplet3() {
        int[] nums = {2,1,5,0,4,6};

        Solution solution = new Solution();
        System.out.println(solution.increasingTriplet(nums));
    }

    @Test
    void increasingTriplet4() {
        int[] nums = {20,100,10,12,5,13};

        Solution solution = new Solution();
        System.out.println(solution.increasingTriplet(nums));
    }
}