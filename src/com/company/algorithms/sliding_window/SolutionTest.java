package com.company.algorithms.sliding_window;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    @Test
    void slidingWindowSum() {
        int[] nums = {2,1,5,0,4,6};

        Solution solution = new Solution();
        System.out.println(solution.slidingWindowSum(nums));
    }
}