package com.company.leetcode.alexey.greedy.remove_k_digits;

import java.math.BigInteger;
import java.util.*;
import java.util.stream.Collectors;

public class Solution {

    /**
     * https://leetcode.com/problems/remove-k-digits/
     *
     * 402. Remove K Digits
     *
     * Given string num representing a non-negative integer num, and an integer k, return the smallest possible integer after removing k digits from num.
     *
     * Example 1:
     *
     * Input: num = "1432219", k = 3
     * Output: "1219"
     * Explanation: Remove the three digits 4, 3, and 2 to form the new number 1219 which is the smallest.
     *
     * Example 2:
     *
     * Input: num = "10200", k = 1
     * Output: "200"
     * Explanation: Remove the leading 1 and the number is 200. Note that the output must not contain leading zeroes.
     *
     * Example 3:
     *
     * Input: num = "10", k = 2
     * Output: "0"
     * Explanation: Remove all the digits from the number and it is left with nothing which is 0.
     *
     * @param num
     * @param k
     * @return
     */
    public String removeKdigits(String num, int k) {
        int n = num.length();
        if (k == n) {
            return "0";
        }

        char[] digits = num.toCharArray();
        char[] stack = new char[n];

        int i = 0;
        int stackTop = -1;
        int oldK = k;

        while (i < n) {
            while (k > 0 && stackTop >= 0 && stack[stackTop] > digits[i]) {
                stackTop--;
                k--;
            }
            stackTop++;
            stack[stackTop] = digits[i++];
        }

        int nonZeroStart = 0;

        while (stack[nonZeroStart] == '0' && nonZeroStart < n - oldK - 1) {
            nonZeroStart++;
        }

        return String.valueOf(stack, nonZeroStart, n - oldK - nonZeroStart);

//        String ans = new String(stack);
//        BigInteger result = new BigInteger("0");
//
//        if (stack != null && n - oldK > 0) {
//            result = new BigInteger(ans.substring(0, n - oldK));
//        }
//
//        return n - oldK == 0 ? "0" : "" + result;
    }

    public String removeKdigits1(String num, int k) {
        int n = num.length();
        Stack<Character> stack = new Stack<>();
        int i = 0;

        while (i < n) {
            while (!stack.isEmpty() && stack.peek() > num.charAt(i) && k > 0) {
                k--;
                stack.pop();
            }
            stack.push(num.charAt(i++));
        }

        while (!stack.isEmpty() && k > 0) {
            k--;
            stack.pop();
        }

//        while (!stack.isEmpty() && stack.firstElement() == '0') {
//            stack.removeElementAt(0);
//        }

        String ans = stack.stream().map(String::valueOf).collect(Collectors.joining(""));
        BigInteger result = new BigInteger("0");
        if (!stack.isEmpty()) {
            result = new BigInteger(ans);
        }

        return stack.isEmpty() ? "0" : "" + result;
    }

    public String removeKdigits2(String num, int k) {
        int n = num.length();
        List<Integer> ans = new ArrayList<>();
        if (n == k) {
            return "0";
        }

        ans.add(Integer.valueOf(num.substring(k, n)));
        for (int start = 0; start < n - k; start++) {
            String sub = num.substring(0, start + 1) + num.substring(start + k + 1, n);
            ans.add(Integer.valueOf(sub));
        }

        int min = Collections.min(ans);

        return "" + min;
    }
}
