package com.company.main.tasks.ListWeighSum;

import java.util.List;

class NestedInteger {
    private List<NestedInteger> list;
    private Integer integer;

    public NestedInteger(Integer integer) {
        this.list = null;
        this.integer = integer;
    }

    public NestedInteger(List<NestedInteger> list) {
        this.list = list;
        this.integer = null;
    }


    public List<NestedInteger> getList() {
        return list;
    }

    public Integer getInteger() {
        return integer;
    }

    public boolean isInteger() {
        return integer != null;
    }

    public boolean isList() {
        return list != null && list.size() > 0;
    }
}

public class Solution {

    private int ans;
    /**
     *
     * @param list
     * @param depth
     * @return
     */
    public int dfs(List<NestedInteger> list, int depth) {
        for (NestedInteger item : list) {
            if(!item.isInteger()) {
                dfs(item.getList(), depth + 1);
            } else {
                ans += item.getInteger() * depth;
            }
        }

        return ans;
    }
}
