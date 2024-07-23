package com.company.algorithms.reverseInt;

public class Solution {

    /**
     *
     * @param n
     * @return
     */
    public int reverseInt(int n) {
        int ans = 0;
        while (n > 0) {
            ans += n % 10;
            if (n >= 10) ans *= 10;
            n /= 10;
        }

        return ans;
    }
}
