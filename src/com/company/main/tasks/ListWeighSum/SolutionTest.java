package com.company.main.tasks.ListWeighSum;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

class SolutionTest {

    @Test
    void dfs() {
        List<NestedInteger> list = new ArrayList<>();
        List<NestedInteger> subList = new ArrayList<>();
        subList.add(new NestedInteger(1));
        subList.add(new NestedInteger(1));
        NestedInteger nestedInteger = new NestedInteger(subList);
        list.add(nestedInteger);
        list.add(new NestedInteger(2));
        List<NestedInteger> subList2 = new ArrayList<>();
        subList2.add(new NestedInteger(1));
        subList2.add(new NestedInteger(1));
        NestedInteger nestedInteger2 = new NestedInteger(subList);
        list.add(nestedInteger2);
        Solution solution = new Solution();
        System.out.println(solution.dfs(list, 1));
    }
}