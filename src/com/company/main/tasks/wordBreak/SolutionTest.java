package com.company.main.tasks.wordBreak;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

class SolutionTest {

    @Test
    void wordBreak() {
        String s = "leetcode";
        List<String> wordDict = new ArrayList<>();
        wordDict.add("leet");
        wordDict.add("code");
        Solution solution = new Solution();
        System.out.println(solution.wordBreak(s, wordDict));
    }

    @Test
    void wordBreak1() {
        String s = "applepenapple";
        List<String> wordDict = new ArrayList<>();
        wordDict.add("apple");
        wordDict.add("pen");
        Solution solution = new Solution();
        System.out.println(solution.wordBreak(s, wordDict));
    }

    @Test
    void wordBreak2() {
        String s = "catsandog";
        List<String> wordDict = new ArrayList<>();
        wordDict.add("cats");
        wordDict.add("dog");
        wordDict.add("sand");
        wordDict.add("and");
        wordDict.add("cat");
        Solution solution = new Solution();
        System.out.println(solution.wordBreak(s, wordDict));
    }

}