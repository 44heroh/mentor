package com.company.main.tasks.isOneEditDistance;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    @Test
    void isOneEditDistance() {
        String s = "ab", t = "acb";
        Solution solution = new Solution();
        System.out.println(solution.isOneEditDistance(s, t));
    }
}