package com.company.leetcode.problems.longestCommonPrefix;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    @Test
    void longestCommonPrefix() {
        String[] strings = {"flower","flow","flight"};
//        String[] strings = {"dog","racecar","car"};
//        String[] strings = {""};
//        String[] strings = {"a"};
//        String[] strings = {"ab", "a"};
        Solution solution = new Solution();
        System.out.println(solution.longestCommonPrefix(strings));
    }
}