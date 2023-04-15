package com.company.leetcode.problems.plusOne;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    @Test
    void plusOne() {
        int[] result;
        int[] arr = {4, 3, 9, 9};
        Solution solution= new Solution();
        result = solution.plusOne(arr);
        System.out.println(Arrays.toString(result));
        arr = new int[]{9};
        result = solution.plusOne(arr);
        System.out.println(Arrays.toString(result));
        arr = new int[]{4,3,2,1};
        result = solution.plusOne(arr);
        System.out.println(Arrays.toString(result));
        arr = new int[]{9, 9};
        result = solution.plusOne(arr);
        System.out.println(Arrays.toString(result));
    }
}