package com.company.leetcode.problems.numberOf1Bits;

public class Solution {
    // you need to treat n as an unsigned value
    public int hammingWeight1(int n) {
        int weight = 0;

        for(int i = 0; i < 9; i++){
            if(n % 10 == 1)
                weight++;
            n /= 10;
        }

        return weight;
    }

    /**
     * 191. Number of 1 Bits https://leetcode.com/problems/number-of-1-bits/description/
     * @param n
     * @return
     */
    public int hammingWeight(int n) {
        int weight = 0;

        while(n != 0) {
            if((n & 1) == 1)
                weight++;

            n = n / 2;
        }

        return weight;
    }
}