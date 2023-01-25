package com.company.heap.max;

import org.junit.jupiter.api.Test;
import org.openjdk.jmh.annotations.*;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    @org.junit.jupiter.api.Test
    void addArrayToMaxHeap() {
        Object[] actual = Solution.addArrayToMaxHeap();
        Object[] expected = {20, 16, 11, 10, 9};
        assertArrayEquals(actual, expected);
    }

    @Test
    void addArrayRandomToMaxHeap() {
        Object[] actual = Solution.addArrayRandomToMaxHeap();
        Object[] expected = {20, 16, 8, 9, 11, 2, 6, 1, 5, 4, 10, null, null, null, null, null, null, null, null, null};
        assertArrayEquals(actual, expected);
    }

    @Test
    void addArrayOrderedToMaxHeap() {
        Object[] actual = Solution.addArrayOrderedToMaxHeap();
        Object[] expected = {10, 9, 8, 7, 6};
        assertArrayEquals(actual, expected);
    }

    @Test
    void addArrayRandomWithMinusToMaxHeap() {
        Object[] actual = Solution.addArrayRandomWithMinusToMaxHeap();
        Object[] expected = {20, 16, 8, 9, 11, 2, 6, 1, 5, 4, 10, null, null, null, null, null, null, null, null, null};
        assertArrayEquals(actual, expected);
    }
}