package com.company.main.tasks.wordBreak;

import java.util.List;

public class Solution {

    public boolean wordBreak(String s, List<String> wordDict) {
        boolean[] t = new boolean[s.length()];
        helper(s, wordDict, t, 0);
        return t[s.length() - 1];
    }

    private void helper(String s, List<String> wordDict, boolean[] t, int start) {
        if(start >= s.length())
            return;

        for (String word : wordDict) {
            int end = start + word.length();

            if(end > s.length()) continue;;

            if(end > t.length)
                if(t[end - 1]) continue;

            if(s.substring(start, end).equals(word)) {
                t[end - 1] = true;
                helper(s, wordDict, t, end);
            }
        }
    }
}
