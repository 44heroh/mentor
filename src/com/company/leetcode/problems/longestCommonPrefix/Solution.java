package com.company.leetcode.problems.longestCommonPrefix;

import java.util.Arrays;

public class Solution {

    /**
     * 14. Longest Common Prefix https://leetcode.com/problems/longest-common-prefix/
     * @param strs
     * @return
     */
    public String longestCommonPrefix1(String[] strs) {

        if(strs.equals(null))
            return "";
        else if(strs.length == 1) {
            return strs[0];
        }
        else {
            for(int i = 0; i < strs.length; i++){
                if(strs[i].equals(""))
                    return "";
                strs[i] = strs[i].toLowerCase();
            }
        }

        String prefix = "";
        int prefixIndex = 0;
        for(int i = 0; i < 200; i++){
            if(prefixIndex > 0)
                prefix = strs[0].substring(0, prefixIndex);
            for(int j = 0; j < strs.length - 1; j++) {
                if(strs[j].length() - 1 < i || strs[j + 1].length() - 1 < i)
                    return prefix.length() > 0 ? prefix : "";
                if(strs[j].charAt(i) != strs[j + 1].charAt(i))
                    return prefix.length() > 0 ? prefix : "";
            }
            prefixIndex++;
        }

        return prefix;
    }

    public String longestCommonPrefix(String[] strs) {
        Arrays.sort(strs);
        String str1 = strs[0];
        String str2 = strs[strs.length - 1];
        int prefixIndex = 0;
        while(prefixIndex < str1.length() && prefixIndex < str2.length()){
            if(str1.charAt(prefixIndex) == str2.charAt(prefixIndex)){
                prefixIndex++;
            } else {
                break;
            }
        }

        return str1.substring(0, prefixIndex);
    }
}
