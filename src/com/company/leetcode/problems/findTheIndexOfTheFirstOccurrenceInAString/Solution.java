package com.company.leetcode.problems.findTheIndexOfTheFirstOccurrenceInAString;

public class Solution {
    public int strStr(String haystack, String needle) {
        char[] haystackChars = haystack.toCharArray();
        char[] needleChars = needle.toCharArray();
        for(int i = 0; i < (haystackChars.length + 1 - needleChars.length); i++) {
            for(int j = 0; j < needleChars.length; j++) {
                if(haystackChars[i + j] != needleChars[j])
                    break;
                if(j == needleChars.length - 1)
                    return i;
            }
        }
        return -1;
    }
}
