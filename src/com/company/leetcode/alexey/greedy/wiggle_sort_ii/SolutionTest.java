package com.company.leetcode.alexey.greedy.wiggle_sort_ii;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    @Test
    void wiggleSort1() {
        int[] nums = {1,5,1,1,6,4};
        Solution solution = new Solution();
        solution.wiggleSort(nums);
        System.out.println(Arrays.toString(nums));
    }

    @Test
    void wiggleSort2() {
        int[] nums = {1,3,2,2,3,1};
        Solution solution = new Solution();
        solution.wiggleSort(nums);
        System.out.println(Arrays.toString(nums));
    }

    @Test
    void wiggleSort3() {
        int[] nums = {1,28,1,1,24,18};
        Solution solution = new Solution();
        solution.wiggleSort(nums);
        System.out.println(Arrays.toString(nums));
    }
}