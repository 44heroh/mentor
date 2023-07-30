package com.company.main.tasks.arraySign;

public class Solution {

    /**
     * 1822. Sign of the Product of an Array https://leetcode.com/problems/sign-of-the-product-of-an-array/
     * @param nums
     * @return
     */
    public int arraySign(int[] nums) {
        int sign = 1;
        for (int n : nums) {
            if(n == 0) {
                return 0;
            }
            if(n < 0) {
                sign = -sign;
            }
        }

        return sign;
    }
}
