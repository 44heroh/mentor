package com.company.main.tasks.generateParenthesis;

import java.util.ArrayList;
import java.util.List;

public class Solution {

    /**
     * 22. Generate Parentheses https://leetcode.com/problems/generate-parentheses/
     * @param n
     * @return
     */
    public List<String> generateParenthesis(int n) {
        List<String> result = new ArrayList<>();
        recurse(result, 0, 0, n, "");

        return result;
    }

    public void recurse(List<String> result, int left, int right, int n, String s) {
        if(n * 2 == s.length()) {
            result.add(s);
        }

        if(left < n) {
            recurse(result, left + 1, right, n, s + "(");
        }

        if (left > right) {
            recurse(result, left, right + 1, n, s + ")");
        }
    }
}
