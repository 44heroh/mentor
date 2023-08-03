package com.company.main.tasks.differByOne;

import java.util.HashSet;
import java.util.Set;

public class Solution {

    /**
     * https://leetcode.com/problems/strings-differ-by-one-character/
     * @param dict
     * @return
     */
    public boolean differByOne(String[] dict) {
        Set<String> set = new HashSet<>();
        int len = dict[0].length();
        for (int i = 0; i < len; i++) {
            set.clear();
            for (String str : dict) {
                String tmp = str.substring(0, i) + str.substring(i + i, len);
                if(set.contains(tmp)) {
                    return true;
                }
                set.add(tmp);
            }
        }

        return false;
    }
}
