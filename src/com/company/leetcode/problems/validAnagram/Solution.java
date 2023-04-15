package com.company.leetcode.problems.validAnagram;


import java.util.*;

public class Solution {

    /**
     * 242. Valid Anagram https://leetcode.com/problems/valid-anagram/
     * @param head
     * @return
     */
    public boolean isAnagram(String s, String t) {
        if(s.length() != t.length())
            return false;

        Map<Character, Integer> word1 = new HashMap<>();
        Map<Character, Integer> word2 = new HashMap<>();

        for(int i = 0; i < s.length(); i++){
            if(word1.get(s.charAt(i)) == null){
                word1.put(s.charAt(i), 1);
            } else {
                word1.put(s.charAt(i), word1.get(s.charAt(i)) + 1);
            }
        }

        for(int j = 0; j < t.length(); j++){
            if(word2.get(t.charAt(j)) == null){
                word2.put(t.charAt(j), 1);
            } else {
                word2.put(t.charAt(j), word2.get(t.charAt(j)) + 1);
            }
        }

        if(word1.equals(word2))
            return true;

        return false;
    }
}
