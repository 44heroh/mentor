package com.company.leetcode.problems.reverseString;

import java.util.Arrays;

public class Solution {

    /**
     * 344. Reverse String https://leetcode.com/problems/reverse-string/
     * @param s
     */
    public void reverseString(char[] s) {

        int length = (int)(s.length / 2);
        for(int i = 0; i < length; i++) {
            swap(s, i, s.length - i - 1);
        }
    }

    public void swap(char[] s, int x, int y){
        char tmp = s[x];
        s[x] = s[y];
        s[y] = tmp;
    }
}
