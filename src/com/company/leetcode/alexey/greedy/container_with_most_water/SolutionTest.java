package com.company.leetcode.alexey.greedy.container_with_most_water;

import org.junit.jupiter.api.Test;

class SolutionTest {

    @Test
    void maxArea1() {
        int[] height = {1,8,6,2,5,4,8,3,7};

        Solution solution = new Solution();
        System.out.println(solution.maxArea(height));
    }

    @Test
    void maxArea2() {
        int[] height = {1,1};

        Solution solution = new Solution();
        System.out.println(solution.maxArea(height));
    }
}