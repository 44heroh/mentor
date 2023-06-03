package com.company.leetcode.problems.findPeakElement;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    @Test
    void findPeakElement() {
        int[] nums = {1,2,3,1};
        Solution solution = new Solution();
        System.out.println(solution.findPeakElement(nums));
    }

    @Test
    void findPeakElement1() {
        int[] nums = {1,2,1,3,5,6,4};
        Solution solution = new Solution();
        System.out.println(solution.findPeakElement(nums));
    }

    @Test
    void findPeakElement2() {
        int[] nums = {2, 1};
        Solution solution = new Solution();
        System.out.println(solution.findPeakElement(nums));
    }

    @Test
    void findPeakElement3() {
        int[] nums = {1, 2};
        Solution solution = new Solution();
        System.out.println(solution.findPeakElement(nums));
    }

    @Test
    void findPeakElement4() {
        int[] nums = {1, 2, 1};
        Solution solution = new Solution();
        System.out.println(solution.findPeakElement(nums));
    }
}