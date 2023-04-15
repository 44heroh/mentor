package com.company.leetcode.problems.firstUniqueCharacterInAString;

import java.util.HashMap;
import java.util.Locale;
import java.util.Map;

public class Solution {

    /**
     * 387. First Unique Character in a String https://leetcode.com/problems/first-unique-character-in-a-string/
     * @param s
     * @return
     */
    public int firstUniqChar(String s) {
        s = s.toLowerCase();
        Map<String, Integer> map = new HashMap<>();
        for(int i = 0; i < s.length(); i++){
            String current = "" + s.charAt(i);
            if(!map.containsKey(current)){
                map.put(current, 1);
            } else {
                map.put(current, map.get(current) + 1);
            }
        }

        for(int i = 0; i < s.length(); i++){
            String current = "" + s.charAt(i);
            if(map.get(current) == 1) {
                return i;
            }
        }

        return -1;
    }

    public int firstUniqChar1(String s) {
        s = s.toLowerCase();
        for(int i = 0; i < s.length(); i++) {
            int count = 0;
            for(int j = 0; j < s.length(); j++) {
                if(s.charAt(i) != s.charAt(j) && i != j) {
                    count++;
                }
            }

            if(count == s.length() - 1) {
                return i;
            }
        }

        return -1;
    }
}
