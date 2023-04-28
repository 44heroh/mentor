package com.company.leetcode.problems.stringToIntegerAtoi;

public class Solution {

    /**
     * 8. String to Integer (atoi) https://leetcode.com/problems/string-to-integer-atoi/
     * @param s
     * @return
     */
    public int myAtoi(String s) {
        s = s.strip();
        if(s.equals(""))
            return 0;
        if(s.matches("^[a-zA-Z].*"))
            return 0;

        long res = 0;
        final int sign = s.charAt(0) == '-' ? -1 : 1;
        if(s.charAt(0) == '-' || s.charAt(0) == '+'){
            s = s.substring(1);
        }

        for(int i = 0; i < s.length(); i++){
            char ch = s.charAt(i);
            if(!Character.isDigit(ch))
                break;
            res = res * 10 + (ch - '0');
            if(sign * res <= Integer.MIN_VALUE)
                return Integer.MIN_VALUE;
            if(sign * res >= Integer.MAX_VALUE)
                return Integer.MAX_VALUE;
        }

        return sign * (int)res;
    }
}
