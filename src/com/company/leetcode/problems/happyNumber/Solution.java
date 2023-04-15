package com.company.leetcode.problems.happyNumber;

import java.util.HashSet;
import java.util.Set;

public class Solution {
    /**
     * 202. Happy Number https://leetcode.com/problems/happy-number/
     * @param n
     * @return
     */
    public boolean isHappy(int n) {

        Set<Integer> seen = new HashSet<>();
        int result = n;

        while(n != 1 && !seen.contains(result)){
            seen.add(result);
            int sum = 0;
            while(result != 0) {
                sum += Math.pow(result % 10, 2);
                result /= 10;
            }

            result = sum;
        }

        return result == 1;
    }
}
