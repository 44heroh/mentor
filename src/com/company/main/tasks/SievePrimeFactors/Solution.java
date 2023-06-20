package com.company.main.tasks.SievePrimeFactors;

import java.util.ArrayList;
import java.util.List;

public class Solution {

    public List<Integer> SievePrimeFactors(int num) {
        boolean[] booleans = new boolean[num];

        for (int i = 0; i < booleans.length; i++) {
            booleans[i] = true;
        }

        for (int i = 2; i < Math.sqrt(num); i++) {
            if (booleans[i] == true) {
                for (int j = i * 2; j < num; j += i) {
                    booleans[j] = false;
                }
            }
        }

        List<Integer> ans = new ArrayList<>();
        for (int i = 2; i < booleans.length; i++) {
            if(booleans[i] == true) {
                ans.add(i);
            }
        }

        return ans;
    }
}
