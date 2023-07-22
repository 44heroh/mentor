package com.company.main.tasks.depthSumInverse;

import java.util.List;

public class Solution {

    int flatSum = 0;
    int max = 1;

    public int depthSumInverse(List<NestedInteger> nestedIntegerList) {
        int depthSum = dfs(nestedIntegerList, 1);
        return flatSum * (max + 1) - depthSum;
    }

    private int dfs(List<NestedInteger> input, int depth) {
        if(input == null || input.size() == 0) return 0;
        int sum = 0;
        for (NestedInteger i : input) {
            if(i.isInteger()) {
                max = Math.max(depth, max);
                sum += i.getInteger() * depth;
                flatSum += i.getInteger();
            } else {
                sum += dfs(i.getList(), depth + 1);
            }
        }

        return sum;
    }
}

class NestedInteger {
    private Integer value;
    private List<NestedInteger> nestedList;

    // Constructor for an integer value
    public NestedInteger(int value) {
        this.value = value;
        this.nestedList = null;
    }

    // Constructor for a nested list
    public NestedInteger(List<NestedInteger> nestedList) {
        this.nestedList = nestedList;
        this.value = null;
    }

    // Check if this NestedInteger holds a single integer
    public boolean isInteger() {
        return value != null;
    }

    // Get the integer value if this NestedInteger holds a single integer
    public int getInteger() {
        if (isInteger()) {
            return value;
        } else {
            throw new UnsupportedOperationException("NestedInteger does not hold an integer value.");
        }
    }

    // Get the nested list if this NestedInteger holds a nested list
    public List<NestedInteger> getList() {
        if (!isInteger()) {
            return nestedList;
        } else {
            throw new UnsupportedOperationException("NestedInteger does not hold a nested list.");
        }
    }
}
