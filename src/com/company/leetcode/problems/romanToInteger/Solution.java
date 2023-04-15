package com.company.leetcode.problems.romanToInteger;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Solution {

    /**
     * 13. Roman to Integer https://leetcode.com/problems/roman-to-integer/
     * @param s
     * @return
     */
    public int romanToInt(String s) {

        Map<String, Integer> map = new HashMap<>();
        map.put("I", 1);
        map.put("V", 5);
        map.put("X", 10);
        map.put("L", 50);
        map.put("C", 100);
        map.put("D", 500);
        map.put("M", 1000);

        Map<String, Integer> diffs = new HashMap<>();
        diffs.put("IV", 4);
        diffs.put("IX", 9);
        diffs.put("XL", 40);
        diffs.put("XC", 90);
        diffs.put("CD", 400);
        diffs.put("CM", 900);

        char[] chars = s.toCharArray();
        int num = 0;

        for(int i = 0; i < chars.length; i++){
            String current = "" + chars[i];

            if(i + 1 < chars.length){
                String diff = "" + chars[i] + chars[i + 1];

                if(diffs.get(diff) != null) {
                    num += diffs.get(diff);
                    i++;
                    continue;
                }
            }
            num += map.get(current);
        }

        return num;
    }
}
