package com.company.leetcode.problems.reverseBits;

public class Solution {


    /**
     * 190. Reverse Bits https://leetcode.com/problems/reverse-bits/
     * @param n
     * @return
     */
    // you need treat n as an unsigned value
    public int reverseBits(int n) {
        int reverse = 0;
        String count = "" + n;

        for(int i = 0; i < count.length(); i++){
            reverse =  reverse << 1;
            reverse |= n & 1; // показывает нечетность числа
            n = n >> 1;
        }

        return reverse;
    }
}
