package com.company.main.tasks.findLength;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    @Test
    void findLength() {
        int[] nums1 = {1,2,3,2,1};
        int[] nums2 = {3,2,1,4,7};

        Solution solution = new Solution();
        System.out.println(solution.findLength(nums1, nums2));
    }
}