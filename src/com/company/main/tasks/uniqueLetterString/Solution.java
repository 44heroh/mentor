package com.company.main.tasks.uniqueLetterString;

import java.util.Arrays;

public class Solution {

    /**
     * 828. Count Unique Characters of All Substrings of a Given String https://leetcode.com/problems/count-unique-characters-of-all-substrings-of-a-given-string/
     * @param s
     * @return
     */
    public int uniqueLetterString1(String s) {
        int[][] index = new int[26][2];
        for (int i = 0; i < 26; i++) Arrays.fill(index[i], -1);

        int res = 0, n = s.length(), mod = (int)Math.pow(10, 9) + 7;
        for (int i = 0; i < n; i++) {
            int c = s.charAt(i) - 'A';
            res = (res + (i - index[c][1]) * (index[c][1] - index[c][0]) % mod) % mod;
            index[c] = new int[] {index[c][1], i};
        }

        for (int j = 0; j < 26; j++) {
            res = (res + (n - index[j][1]) * (index[j][1] - index[j][0]) % mod) % mod;
        }
        return res;
    }

    public int uniqueLetterString(String s) {
        int[][] index = new int[26][2];
        //Заполняем массив [-1, -1]
        for (int i = 0; i < 26; i++) Arrays.fill(index[i], -1);

        int res = 0, n = s.length(), mod = (int)Math.pow(10, 9) + 7;
        for (int i = 0; i < n; i++) {
            int c = s.charAt(i) - 'A';
            int k = index[c][0], j = index[c][1];
            res += (i - j) * (j - k);
            index[c] = new int[]{j, i};
        }

        for (int i = 0; i < index.length; i++) {
            int k = index[i][0], j = index[i][1];
            res += ((n - j) * (j - k));
        }

        return res % mod;
    }

    public int countUniqueChars(String s) {
        int[] charsIndex = new int[26];
        char[] chars = s.toCharArray();
        int count = 0;

        for (int i = 0; i < chars.length; i++) {
            charsIndex[chars[i] - 'A']++;
            if(charsIndex[chars[i] - 'A'] == 1) {
                count++;
            } else {
                count--;
            }
        }
        return count + 1;
    }
}
