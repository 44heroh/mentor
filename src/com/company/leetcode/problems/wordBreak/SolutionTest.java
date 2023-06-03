package com.company.leetcode.problems.wordBreak;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

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

    @Test
    void wordBreak3() {
        String s = "bb";
        List<String> wordDict = new ArrayList<>();
        wordDict.add("a");
        wordDict.add("b");
        wordDict.add("bbb");
        wordDict.add("bbbb");
        Solution solution = new Solution();
        System.out.println(solution.wordBreak(s, wordDict));
    }

    @Test
    void wordBreak4() {
        String s = "abcd";
        List<String> wordDict = new ArrayList<>();
        wordDict.add("a");
        wordDict.add("abc");
        wordDict.add("b");
        wordDict.add("cd");
        Solution solution = new Solution();
        System.out.println(solution.wordBreak(s, wordDict));
    }
}