package com.company.list;

import com.company.heap.max.Solution;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BenchmarkTest {

    @Test
    void add() {
        Object[] actual = Benchmark.add();
        Object[] expected = {20, 16, 11, 10, 9};
        assertArrayEquals(actual, expected);
    }
}