package com.company.leetcode.problems.intersectionOfTwoArraysIi;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    @Test
    void intersect() {
        int[] nums1 = {1,2,2,1};
        int[] nums2 = {2,2};
        Solution solution = new Solution();
        System.out.println(Arrays.toString(solution.intersect(nums1, nums2)));
    }

    @Test
    void intersect1() {
        int[] nums1 = {4,9,5};
        int[] nums2 = {9,4,9,8,4};
        Solution solution = new Solution();
        System.out.println(Arrays.toString(solution.intersect(nums1, nums2)));
    }

    @Test
    void intersect2() {
        int[] nums1 = {1, 2};
        int[] nums2 = {1, 1};
        Solution solution = new Solution();
        System.out.println(Arrays.toString(solution.intersect(nums1, nums2)));
    }
}