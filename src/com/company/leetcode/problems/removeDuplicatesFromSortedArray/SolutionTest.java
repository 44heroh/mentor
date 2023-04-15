package com.company.leetcode.problems.removeDuplicatesFromSortedArray;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.assertEquals;

class SolutionTest {

    @Test
    void removeDuplicates() {
        int[] nums = new int[]{0,0,1,1,1,2,2,3,3,4};
        Solution solution = new Solution();
        int[] result = solution.removeDuplicates(nums);
        System.out.println(Arrays.toString(result));
        assertEquals(5, result.length);
    }
}