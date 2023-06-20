package com.company.main.tasks.maxSumSubarray;

import org.junit.jupiter.api.Test;

class SolutionTest {

    @Test
    void maxSumK() {
        int[] num = {16, 12, 9, 19, 11, 8};
        Solution solution = new Solution();
        System.out.println(solution.maxSumSubarray(num, 3));
    }
}