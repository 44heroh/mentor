package com.company.main.tasks.reorganizeString;

import java.util.Arrays;

public class Solution {

    /**
     * 767. Reorganize String https://leetcode.com/problems/reorganize-string
     * @param s
     * @return
     */
    public String reorganizeString(String s) {
        int[] hash = new int[26];
        for (int i = 0; i < s.length(); i++) {
            hash[s.charAt(i) - 'a']++;
        }
        System.out.println(Arrays.toString(hash));

        int max = 0, letter = 0;
        for (int i = 0; i < hash.length; i++) {
            if(hash[i] > max) {
                max = hash[i];
                letter = i;
            }
        }
        if(max > (s.length() + 1) / 2){
            return "";
        }

        char[] res = new char[s.length()];
        int index = 0;
        while (hash[letter] > 0) {
            res[index] = (char) (letter + 'a');
            index += 2;
            hash[letter]--;
        }

        System.out.println(Arrays.toString(res));

        for (int i = 0; i < hash.length; i++) {
            while (hash[i] > 0) {
                if(index >= res.length) {
                    index = 1;
                }
                res[index] = (char) (i + 'a');
                index += 2;
                hash[i]--;
            }
        }
        return String.valueOf(res);
    }
}
