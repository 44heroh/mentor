package com.company.leetcode.problems.searchInRotatedSortedArray;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    @Test
    void search() {
        int[] nums = {4,5,6,7,0,1,2};
        int target = 0;
        Solution solution = new Solution();
        System.out.println(solution.search(nums, target));
    }
}