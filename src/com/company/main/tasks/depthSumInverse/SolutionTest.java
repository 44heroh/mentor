package com.company.main.tasks.depthSumInverse;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

class SolutionTest {

    @Test
    void depthSumInverse() {
        List<NestedInteger> list = new ArrayList<>();
        list.add(new NestedInteger(List.of(new NestedInteger(1), new NestedInteger(1))));
        list.add(new NestedInteger(2));
        list.add(new NestedInteger(List.of(new NestedInteger(1), new NestedInteger(1))));
        Solution solution = new Solution();
        System.out.println(solution.depthSumInverse(list));
    }
}