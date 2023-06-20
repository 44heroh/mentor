package com.company.main.tasks.largestContentfulPaint.recursion;

import org.junit.jupiter.api.Test;

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