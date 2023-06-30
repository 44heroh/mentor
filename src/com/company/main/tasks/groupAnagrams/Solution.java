package com.company.main.tasks.groupAnagrams;

import java.util.*;

public class Solution {

    /**
     * 49. Group Anagrams https://leetcode.com/problems/group-anagrams/
     * @param strs
     * @return
     */
    public List<List<String>> groupAnagrams(String[] strs) {
        if (strs.length == 0) {
            return new ArrayList<>();
        }

        Map<String, ArrayList<String>> map = new HashMap<>();

        for (String s : strs) {
            char[] chars = new char[26];
            for (char ch : s.toCharArray()) {
                chars[ch - 'a']++;
            }

            String key = String.valueOf(chars);
            if(!map.containsKey(key)) {
                map.put(key, new ArrayList<>());
            }
            map.get(key).add(s);
        }

        return new ArrayList<>(map.values());
    }
}
