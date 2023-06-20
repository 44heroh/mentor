package com.company.main.tasks.largestContentfulPaint.recursion;

public class Solution {

    /**
     *
     * @param strings
     * @return
     */
    public String findLCP(String[] strings) {
        String prefix = strings[0];
        for (String str : strings) {
            prefix = LCP(str, prefix);
        }

        return prefix;
    }

    private String LCP(String str, String prefix) {
        int i = 0, j = 0;
        while (i < str.length() && j < prefix.length()) {
            if(str.charAt(i) != prefix.charAt(j)){
                break;
            }
            i++;
            j++;
        }

        return str.substring(0, i);
    }
}
