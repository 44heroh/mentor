package com.company.main.tasks.reorganizeString;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    @Test
    void reorganizeString() {
        String s = "aab";
        Solution solution = new Solution();
        System.out.println(solution.reorganizeString(s));
    }
}