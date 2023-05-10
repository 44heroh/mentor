package com.company.leetcode.problems.findFirstAndLastPositionOfElementInSortedArray;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    @Test
    void searchRange() {
        int[] nums = {5,7,7,8,8,10};
        int target = 8;
        Solution solution = new Solution();
        System.out.println(Arrays.toString(solution.searchRange(nums, target)));
    }

    @Test
    void searchRange1() {
        int[] nums = {1};
        int target = 1;
        Solution solution = new Solution();
        System.out.println(Arrays.toString(solution.searchRange(nums, target)));
    }

    @Test
    void searchRange2() {
        int[] nums = {5,7,7,8,8,10};
        int target = 6;
        Solution solution = new Solution();
        System.out.println(Arrays.toString(solution.searchRange(nums, target)));
    }

    @Test
    void searchRange3() {
        int[] nums = {1, 2, 3};
        int target = 1;
        Solution solution = new Solution();
        System.out.println(Arrays.toString(solution.searchRange(nums, target)));
    }
}