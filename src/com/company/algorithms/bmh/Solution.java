package com.company.algorithms.bmh;

import java.util.Arrays;

public class Solution {

    public static int bmhSearch(String text, String subString) {
        if (subString.length() > text.length()) {
            return -1;
        }

        int startIndex = ' ';
        int endIndex = '~';
        int[] alphabetTable = preprocess(subString, startIndex, endIndex);
        int i = subString.length() - 1;
        int n = i;

        for (; i < text.length();) {
            if (text.substring(i - n, i+ 1).equals(subString)) {
                return i - n;
            }

            i = i + alphabetTable[text.charAt(i) - startIndex];
        }

        return -1;
    }

    private static int[] preprocess(String subString, int startIndex, int endIndex) {
        int[] alphabetTable = new int[endIndex - startIndex + 1];
        Arrays.fill(alphabetTable, subString.length());

        char[] symbols = subString.toCharArray();
        for (int i = 0; i < symbols.length - 1; i++) {
            alphabetTable[symbols[i] - startIndex] = subString.length() - i - 1;
        }

        return alphabetTable;
    }
}
