package com.company.leetcode.problems.reverseString;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    @Test
    void reverseString() {
//        char[] s = {'h','e','l','l','o'};
        char[] s = {'H','a','f','n','a','h'};
        Solution solution = new Solution();
        solution.reverseString(s);
    }
}