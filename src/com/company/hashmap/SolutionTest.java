package com.company.hashmap;

import com.company.hashmap.Solution;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    @Test
    void add() {
        Object[] actual = Solution.add();
        Object[] expected = {217, 218, 219, 220, 221, null, null, null, null, null};
        assertArrayEquals(actual, expected);
    }
}