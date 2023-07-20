package com.company.main.tasks.productExceptSelf;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    @Test
    void productExceptSelf() {
        int[] nums = {1,2,3,4};
        Solution solution = new Solution();
        System.out.println(Arrays.toString(solution.productExceptSelf(nums)));
    }
}