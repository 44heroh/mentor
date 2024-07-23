package com.company.algorithms.from10;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Solution {

    /**
     * перевод из системы с основанием 10 в системы по основанию s
     * @param x
     * @param s
     * @return
     */
    public List<Integer> from10(int x, int s) {
        List<Integer> ans = new ArrayList<>();

        while (x > 0) {
            ans.add(x % s);
            x /= s;
        }

        Collections.reverse(ans);
        return ans;
    }
}
