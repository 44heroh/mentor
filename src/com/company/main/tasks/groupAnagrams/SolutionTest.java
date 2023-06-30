package com.company.main.tasks.groupAnagrams;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    @Test
    void groupAnagrams() {
        String[] strings = {"eat","tea","tan","ate","nat","bat"};
        Solution solution = new Solution();
        System.out.println(solution.groupAnagrams(strings));
    }
}