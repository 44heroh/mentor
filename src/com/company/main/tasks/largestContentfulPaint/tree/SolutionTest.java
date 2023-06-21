package com.company.main.tasks.largestContentfulPaint.tree;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    @Test
    void findLCP() {
        String[] strings = {
                "techie delight",
                "tech",
                "techie",
                "technology",
                "technical"
        };
        Solution solution = new Solution();
        System.out.println(solution.findLCP(strings));
    }
}