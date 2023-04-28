package com.company.leetcode.problems.reverseInteger;

public class Solution {
    /**
     * 7. Reverse Integer https://leetcode.com/problems/reverse-integer/
     * @param x
     * @return
     */
    public int reverse(int x) {
        String num = "" + x;
        int count = 0;
        boolean isMinus = false;

        if(num.charAt(0) != '-'){
            count = num.length();
        } else {
            count = num.length() - 1;
            isMinus = true;
            x *= -1;
        }

        long result = 0;
        for(int i = 0; i < count; i++){
            int mul = 10;
            int digit = x % 10;
            if(i != count - 1){
                if(i != 0)
                    result *= mul;
                mul *= digit;
                result += mul;
            } else {
                result += digit;
            }

            x /= 10;
        }

        if(isMinus){
            result *= -1;
        }

        if(result < -2147483648 || result > 2147483647)
            return 0;

        return (int) result;
    }
}
