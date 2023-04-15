package com.company.leetcode.problems.powerOfThree;

public class Solution {

    /**
     * 326. Power of Three https://leetcode.com/problems/power-of-three/
     * @param n
     * @return
     */
    public boolean isPowerOfThree2(int n) {
        if(n <= 0)
            return false;
        else if(n == 1)
            return true;

        return n % 3 == 0 ? isPowerOfThree(n/3) : false ;
    }

    public boolean isPowerOfThree(int n) {
        if(n <= 0)
            return false;

        int pow = (int)(Math.round(Math.log(n) / Math.log(3)));
        if(Math.pow(3, pow) == n) {
            return true;
        }

        return false;
    }

    public boolean isPowerOfThree1(int n) {
        if(n <= 0){
            return false;
        }

        double value = Math.log(n) / Math.log(3);
        double diffValue = Math.abs(Math.round(value) - value);
        if(diffValue > 0.01)
            return false;

        double pow =  Math.pow(3, value);
        double balance = pow % 1;
        double diff = Math.abs((Math.round(pow) - balance) % 1);
        if(diff < 0.01)
            pow = Math.round(pow);

        if(pow == n)
            return true;
        else
            return false;
    }
}
