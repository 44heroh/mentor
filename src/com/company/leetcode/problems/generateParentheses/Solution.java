package com.company.leetcode.problems.generateParentheses;

import java.util.*;

public class Solution {



    public List<String> generateParenthesis(int n) {
        List<String> result = new ArrayList<>();
        recurse(result, 0, 0, n, "");

        return result;
    }

    public void recurse(List<String> result, int left, int right, int n, String s){
        if(n * 2 == s.length()){
            result.add(s);
        }

        if(left < n){
            recurse(result, left + 1, right, n, s + "(");
        }

        if(left > right){
            recurse(result, left, right + 1, n, s + ")");
        }
    }





























    public static class ParenthesesString {
        public String s;
        public int openCount;
        public int closeCount;

        ParenthesesString(String s, int openCount, int closeCount) {
            this.s = s;
            this.openCount = openCount;
            this.closeCount = closeCount;
        }
    }

    /**
     * 22. Generate Parentheses https://leetcode.com/problems/generate-parentheses/
     * @param n
     * @return
     */
    public List<String> generateParenthesis1(int n) {

        Queue<ParenthesesString> queue = new ArrayDeque<>();
        queue.add(new ParenthesesString("", 0, 0));
        List<String> result = new ArrayList<>();

        while(!queue.isEmpty()){
            ParenthesesString current = queue.poll();
            if(current.openCount == n && current.closeCount == n){
                result.add(current.s);
            } else {
                if(current.openCount > current.closeCount){
                    queue.add(new ParenthesesString(current.s + ")", current.openCount, current.closeCount + 1));
                }
                if(current.openCount < n){
                    queue.add(new ParenthesesString(current.s + "(", current.openCount + 1, current.closeCount));
                }

            }
        }

        return result;
    }
}
