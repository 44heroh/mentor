package com.company.leetcode.problems.longestSubstringWithoutRepeatingCharacters;

public class Solution {
    /**
     * 3. Longest Substring Without Repeating Characters https://leetcode.com/problems/longest-substring-without-repeating-characters/
     * @param s
     * @return
     */
    public int lengthOfLongestSubstring(String s) {
        String sub = "";
        int count = 0;

        for(int i = 0; i < s.length(); i++){
            String tmp = "" + s.charAt(i);
            if(!sub.contains(tmp)){
                sub = sub + tmp;
                count = Math.max(count, sub.length());
            } else {
                int cur = sub.indexOf(tmp);
                sub = sub.substring(cur + 1) + tmp;
            }
        }

        return count;
    }
}
