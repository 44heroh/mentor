package com.company.leetcode.problems.palindromePartitioning;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Solution {

    /**
     * 131. Palindrome Partitioning https://leetcode.com/problems/palindrome-partitioning/
     * @param s
     * @return
     */
    private Set<List<String>> ans = new HashSet<>();
    private List<String> current = new ArrayList<>();
    public List<List<String>> partition(String s) {
        if(s.length() == 1) {
            current.add("" + s.charAt(0));
            ans.add(new ArrayList<>(current));
            current.clear();
            return new ArrayList<>(ans);
        }

        helper(s, 0);

        return new ArrayList<>(ans);
    }

    private void helper(String s, int start) {
        if(s.length() == start) {
            ans.add(new ArrayList<>(current));
            return;
        }

        for (int i = start; i < s.length(); i++) {
            if(s.substring(start, i + 1).equals(reverse(s.substring(start, i + 1)))) {
                current.add(s.substring(start, i + 1));
                helper(s, i + 1);
                current.remove(current.size() - 1);
            }
        }
    }

    // Метод обращения строки в Java с использованием массива символов
    public static String reverse(String str)
    {
        // возвращаем, если строка нулевая или пустая
        if (str == null || str.equals("")) {
            return str;
        }

        // создаем массив символов и инициализируем его заданной строкой
        char[] c = str.toCharArray();

        for (int l = 0, h = str.length() - 1; l < h; l++, h--)
        {
            // поменять местами значения в `l` и `h`
            char temp = c[l];
            c[l] = c[h];
            c[h] = temp;
        }

        // преобразовать массив символов в строку и вернуться
        return String.copyValueOf(c);
    }
}
