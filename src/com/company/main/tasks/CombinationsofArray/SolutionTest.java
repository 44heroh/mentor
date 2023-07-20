package com.company.main.tasks.CombinationsofArray;

import org.junit.jupiter.api.Test;

class SolutionTest {

    @Test
    void generateCombinations() {
        int[] nums = {1, 2, 3, 4};
        Solution solution = new Solution();
        System.out.println(solution.generateCombinations(nums, 3));
    }
}