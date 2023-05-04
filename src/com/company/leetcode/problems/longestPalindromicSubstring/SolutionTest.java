package com.company.leetcode.problems.longestPalindromicSubstring;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    @Test
    void longestPalindrome() {
        String s = "babad";
        Solution solution = new Solution();
        System.out.println(solution.longestPalindrome(s));
    }

    @Test
    void longestPalindrome1() {
        String s = "ac";
        Solution solution = new Solution();
        System.out.println(solution.longestPalindrome(s));
    }

    @Test
    void longestPalindrome2() {
        String s = "aacabdkacaa";
        Solution solution = new Solution();
        System.out.println(solution.longestPalindrome(s));
    }

    @Test
    void longestPalindrome3() {
        String s = "bb";
        Solution solution = new Solution();
        System.out.println(solution.longestPalindrome(s));
    }

    @Test
    void longestPalindrome4() {
        String s = "abb";
        Solution solution = new Solution();
        System.out.println(solution.longestPalindrome(s));
    }

    @Test
    void longestPalindrome5() {
        String s = "ccd";
        Solution solution = new Solution();
        System.out.println(solution.longestPalindrome(s));
    }

    @Test
    void longestPalindrome6() {
        String s = "civilwartestingwhetherthatnaptionoranynartionsoconceivedandsodedicatedcanlongendureWeareqmetonagreatbattlefiemldoftzhatwarWehavecometodedicpateaportionofthatfieldasafinalrestingplaceforthosewhoheregavetheirlivesthatthatnationmightliveItisaltogetherfangandproperthatweshoulddothisButinalargersensewecannotdedicatewecannotconsecratewecannothallowthisgroundThebravelmenlivinganddeadwhostruggledherehaveconsecrateditfaraboveourpoorponwertoaddordetractTgheworldadswfilllittlenotlenorlongrememberwhatwesayherebutitcanneverforgetwhattheydidhereItisforusthelivingrathertobededicatedheretotheulnfinishedworkwhichtheywhofoughtherehavethusfarsonoblyadvancedItisratherforustobeherededicatedtothegreattdafskremainingbeforeusthatfromthesehonoreddeadwetakeincreaseddevotiontothatcauseforwhichtheygavethelastpfullmeasureofdevotionthatweherehighlyresolvethatthesedeadshallnothavediedinvainthatthisnationunsderGodshallhaveanewbirthoffreedomandthatgovernmentofthepeoplebythepeopleforthepeopleshallnotperishfromtheearth";
        Solution solution = new Solution();
        System.out.println(solution.longestPalindrome(s));
    }
}