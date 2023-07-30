package com.company.main.tasks.evalRPN;

import java.util.Stack;

public class Solution {

    /**
     * 150. Evaluate Reverse Polish Notation https://leetcode.com/problems/evaluate-reverse-polish-notation/
     * @param tokens
     * @return
     */
    public int evalRPN(String[] tokens) {
        int a,b;
        Stack<Integer> stack = new Stack<Integer>();
        String symbols = "+-*/";
        for (String s: tokens) {
            if(symbols.contains(s)){
                a = stack.pop();
                b = stack.pop();
                stack.add(getResultOperation(s, a, b));
            } else {
                stack.add(Integer.valueOf(s));
            }
        }

        return stack.pop();
    }

    private int getResultOperation(String s, int a, int b) {
        int tmp = 0;
        if(s.equals("+")) {
            tmp = a + b;
        } else if(s.equals("-")) {
            tmp = a - b;
        } else if(s.equals("*")) {
            tmp = a * b;
        } else if(s.equals("/")) {
            tmp = a / b;
        }

        return tmp;
    }

}
