package com.company.main.tasks.letterCombinations;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    @Test
    void letterCombinations() {
        int number = 235;
        Solution solution = new Solution();
        System.out.println(solution.letterCombinations(number));
    }
}