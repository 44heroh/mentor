package com.company.algorithms.fibonacci;

public class Solution {

    public int fibonacci(int n) {
        if (n <= 1) {
            return 0;
        } else if (n == 2) {
            return 1;
        }

        return fibonacci(n - 2) + fibonacci(n - 1);
    }
}
