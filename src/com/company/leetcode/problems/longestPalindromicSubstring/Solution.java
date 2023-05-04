package com.company.leetcode.problems.longestPalindromicSubstring;

import java.util.Arrays;

public class Solution {

    public String longestPalindrome(String s) {
        String result = "";
        for(int i = 0; i < s.length(); i++){
            for(int left = i, right = i; left >= 0 && right < s.length() && s.charAt(left) == s.charAt(right); left--, right++)
                if((right - left) + 1 > result.length())
                    result = s.substring(left, right + 1);
            for(int left = i, right = i + 1; left >= 0 && right < s.length() && s.charAt(left) == s.charAt(right); left--, right++)
                if((right - left) + 1 > result.length())
                    result = s.substring(left, right + 1);
        }

        return result;
    }

    public String longestPalindrome2(String s) {
        if(s.isEmpty())
            return "";
        if(s.length() == 1)
            return s;

        String result = "";

        for(int i = 0; i < s.length(); i++){
            String first = getPalindrome(s, i, i);
            String second = getPalindrome(s, i, i + 1);
            if(result.length() < first.length()){
                result = first;
            }
            if(result.length() < second.length()){
                result = second;
            }
        }

        return result;
    }

    public String getPalindrome(String s, int left, int right){
        while (left >= 0 && right < s.length()){
            if(s.charAt(left) == s.charAt(right)){
                left--;
                right++;
            } else {
                break;
            }
        }

        return s.substring(left + 1, right);
    }






































    /**
     * 5. Longest Palindromic Substring https://leetcode.com/problems/longest-palindromic-substring/
     * @param s
     * @return
     */
    public String longestPalindrome1(String s) {
        if(s.isEmpty())
            return "";
        if(s.length() == 1)
            return s;

        System.out.println(s.length());
        String result = "";
        int widthPalindrome = Integer.MIN_VALUE;

        for(int i = 0; i < s.length(); i++){
            int left = i;
            int right = s.length() - 1;
            while(left < right){
                System.out.println(Arrays.toString(s.substring(left, right + 1).toCharArray()));
                String tmp = s;
                if(left > 0 || right < s.length() - 1)
                    tmp = s.substring(left, right + 1);
                int diff = (right - left);
                if(isPalindrome(tmp)){
                    if(diff > widthPalindrome){
                        result = tmp;
                        widthPalindrome = diff;
                    }
                    right--;
                    left++;
                } else {
                    right--;
                }
            }
        }

        if(result.isEmpty())
            return s.substring(0, 1);
        return result;
    }



    /**
     * 11
     *
     *
     * Метод определяет является ли строка палиндромом. Решение в одну строчку.
     * 1.replaceAll("\\W",""): убираем из строки все не нужные символы (знаки препинания, пробелы и т.д.);
     * 2. new StringBuilder: создаем вторую строку, но пересортированную в обратном порядке с помощью метода reverse();
     * 3. equalsIgnoreCase: сравниваем их между собой, игнорируя регистр.
     * @param text
     * @return
     */
    public static boolean isPalindrome(String text) {
        return text.replaceAll("\\W","")
                .equalsIgnoreCase(new StringBuilder(text.replaceAll("\\W",""))
                        .reverse().toString());
    }
}
