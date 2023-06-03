package com.company.leetcode.problems.evaluateReversePolishNotation;

import java.util.Stack;

public class Solution {

    /**
     * 150. Evaluate Reverse Polish Notation https://leetcode.com/problems/evaluate-reverse-polish-notation/
     * @param tokens
     * @return
     */
    private int position;
    private String[] tokens;

    public int evalRPN(String[] tokens) {
        this.position = tokens.length - 1;
        this.tokens = tokens;
        return eval();
    }

    private int eval() {
        String element = tokens[position--];
        switch (element) {
            case "+":
                return eval() + eval();
            case "-":
                return -eval() + eval();
            case "*":
                return eval() * eval();
            case "/":
                int x = eval();
                int y = eval();
                return y / x;
            default:
                return Integer.parseInt(element);
        }
    }

    public int evalRPN2(String[] tokens) {
        if (tokens == null)
            return 0;

        if(tokens.length == 1)
            return Integer.parseInt(tokens[0]);

        Stack<String> stack = new Stack<>();
        int i = 0, sum = 0;
        while ((!stack.isEmpty() || i == 0) && i < tokens.length) {
            String elem = tokens[i];
            if(elem.matches("[+\\-\\/*]")) {
                int b = Integer.parseInt(stack.pop());
                int a = Integer.parseInt(stack.pop());
                switch (elem) {
                    case "+":
                        sum = a + b;
                        break;
                    case "-":
                        sum = a - b;
                        break;
                    case "*":
                        sum = a * b;
                        break;
                    case "/":
                        sum = a / b;
                        break;
                }
                stack.push(String.valueOf(sum));
                i++;
            } else {
                stack.push(elem);
                i++;
            }
        }

        return sum;
    }

    public int evalRPN1(String[] tokens) {
        if (tokens == null)
            return 0;

        Stack<String> stack = new Stack<>();
        int i = 0;
        stack.push(tokens[0]);
        int sum = 0;
        while (!stack.isEmpty() || i == 0) {
            String element = tokens[i];
            if(i == 0) {
                sum += Integer.parseInt(stack.pop());
            }
            if(element.matches("[+\\-\\/*]")) {
                while (!stack.isEmpty()) {
                    int tmp = Integer.parseInt(stack.pop());
                    switch (element) {
                        case "+":
                            sum += tmp;
                            break;
                        case "-":
                            sum -= tmp;
                            break;
                        case "*":
                            sum *= tmp;
                            break;
                        case "/":
                            sum /= tmp;
                            break;
                    }
                }

                stack.push(String.valueOf(tokens[0]));
            } else {
                i++;
                stack.push(tokens[i]);
            }
        }
        return sum;
    }
}
