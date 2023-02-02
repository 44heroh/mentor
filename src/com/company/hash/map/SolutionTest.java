package com.company.hash.map;

import com.company.hash.map.Solution;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    @Test
    void addToLinkedList() {
        Object[] actual = Solution.addToLinkedList();
        Object[] expected = {217, 218, 219, 220, 221, null, null, null, null, null};
        assertArrayEquals(actual, expected);
    }

    @Test
    void addToHashMap() {
        Object[] actual = Solution.addToHashMap();
        Object[] expected = {217, 218, 219, 220, 221, null, null, null, null, null};
        assertArrayEquals(actual, expected);
    }
}