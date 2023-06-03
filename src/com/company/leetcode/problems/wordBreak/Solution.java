package com.company.leetcode.problems.wordBreak;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Solution {

    /**
     * 139. Word Break https://leetcode.com/problems/word-break/
     * @param s
     * @param wordDict
     * @return
     */
    public boolean wordBreak(String s, List<String> wordDict) {
        boolean[] t = new boolean[s.length()];
        helper(s, wordDict, 0, t);
        return t[s.length() - 1];
    }

    private void helper(String s, List<String> wordDict, int start, boolean[] t) {
        if(start >= s.length())
            return;

        for (String word : wordDict) {
            int end = start + word.length();

            if(end > s.length()) continue;

            if(end < t.length)
                if(t[end - 1]) continue;

            if(s.substring(start, end).equals(word)){
                t[end - 1] = true;
                helper(s, wordDict, end, t);
            }
        }

        return;
    }


    public boolean wordBreak1(String s, List<String> wordDict) {
        Map<String, int[]> map = new HashMap<>();
        int index = 0;
        int len = 0;
        int count = 0;
        for (String str : wordDict) {
            int newIndex = s.indexOf(str, index);
            if(newIndex >= index) {
                count++;
            }
            int[] startEndStr = {newIndex, newIndex + str.length() - 1};
            map.put(str, startEndStr);
            len += str.length();
            index = newIndex + str.length();
        }

        for (Map.Entry<String, int[]> entry : map.entrySet()) {
            System.out.println("key = " + entry.getKey() + " , begin index => " + Arrays.toString(entry.getValue()));
        }

        if(count != wordDict.size())
            return false;
        else
            return true;
    }
}
