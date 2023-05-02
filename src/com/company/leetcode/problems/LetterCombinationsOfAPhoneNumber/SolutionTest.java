package com.company.leetcode.problems.LetterCombinationsOfAPhoneNumber;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    @Test
    void letterCombinations() {
        String digits = "23473";
        Solution solution = new Solution();
        System.out.println(solution.letterCombinations(digits));
    }
}