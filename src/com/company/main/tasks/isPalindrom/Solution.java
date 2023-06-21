package com.company.main.tasks.isPalindrom;

public class Solution {

    /**
     * 9. Palindrome Number https://leetcode.com/problems/palindrome-number/
     * @param x
     * @return
     */
    public boolean isPalindrom(int x) {
        if(x < 0 || (x != 0 && x % 10 == 0))
            return false;

        int rev = 0;
        while (x > rev) {
            rev = (rev * 10) + (x % 10);
            x /= 10;
        }

        return (x == rev || x == rev / 10);
    }
}
