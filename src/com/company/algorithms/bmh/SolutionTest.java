package com.company.algorithms.bmh;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    @Test
    void bmhSearch() {
        String text = "awersome apple";
        String subString = "apple";

        System.out.println(Solution.bmhSearch(text, subString));
    }
}