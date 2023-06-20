package com.company.main.tasks.lengthOfLastWorld;

public class Solution {

    /**
     *
     * @param s
     * @return
     */
    public int lengthOfLastWorld(String s) {
        // обрезать конечные пробелы
        int index = s.length() - 1;
        while (index >= 0 && s.charAt(index) == ' ') {
            index--;
        }

        // вычислить длину последнего слова
        int length = 0;
        while (index >= 0 && s.charAt(index) != ' ') {
            index--;
            length++;
        }

        return length;
    }

    public int lengthOfLastWorld1(String s) {
        char[] chars = s.toCharArray();
        int start = chars.length - 1;
        if(s.charAt(s.length() - 1) == ' ') {
            start = chars.length - 2;
        }

        for (int i = start; i > 0 ; i--) {
            if(chars[i] == ' ') {
                return start - i;
            }
        }

        return -1;
    }
}
