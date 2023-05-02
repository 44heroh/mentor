package com.company.leetcode.problems.LetterCombinationsOfAPhoneNumber;

import java.util.*;
import java.util.stream.Collectors;

public class Solution {
    /**
     * 17. Letter Combinations of a Phone Number https://leetcode.com/problems/letter-combinations-of-a-phone-number/
     * @param digits
     * @return
     */
    public List<String> letterCombinations(String digits) {
        if(digits.isEmpty())
            return new ArrayList<>();

        Map<Integer, String> map = new HashMap<>();
        map.put(2, "abc");
        map.put(3, "def");
        map.put(4, "ghi");
        map.put(5, "jkl");
        map.put(6, "mno");
        map.put(7, "pqrs");
        map.put(8, "tuv");
        map.put(9, "wxyz");

        Set<String> result = new HashSet<>();
        List<String> tmp = new ArrayList<>();
        if(digits.length() >= 1){
            String first = map.get(Integer.parseInt("" + digits.charAt(0)));
            for(int i = 0; i < first.length(); i++){
                tmp.add("" + first.charAt(i));
            }

        }

        if(digits.length() == 1){
            return tmp;
        }

        int k = 1;
        while(k <= digits.length() - 1){
            List<String> old = tmp;
            tmp = new ArrayList<>();
            String second = map.get(Integer.parseInt("" + digits.charAt(k)));
            for(int i = 0; i < old.size(); i++){
                for(int j = 0; j < second.length(); j++){
                    tmp.add("" + old.get(i) + second.charAt(j));
                }
            }
            k++;
        }

        System.out.println(tmp.toString());

        return new ArrayList<>(tmp);
    }

    Map<String, List<String>> numberMap = Map.of(
            "2", List.of("a", "b", "c"),
            "3", List.of("d", "e", "f"),
            "4", List.of("g", "h", "i"),
            "5", List.of("j", "k", "l"),
            "6", List.of("m", "n", "o"),
            "7", List.of("p", "q", "r", "s"),
            "8", List.of("t", "u", "v"),
            "9", List.of("w", "x", "y", "z")
    );

    public List<String> letterCombinations1(String digits) {
        if(digits.isEmpty())
            return new ArrayList<>();

        if (digits.length() == 1) {
            return numberMap.get(digits);
        }

        List<String> result = numberMap.get("" + digits.charAt(0));

        for(int i = 1; i < digits.length(); i++){
            List<String> second = numberMap.get("" + digits.charAt(i));
            List<String> tmp = new ArrayList<>();
            for(String val : result){
                tmp.addAll(union(val, second));
            }

            result = new ArrayList<>(tmp);
        }
        return result;
    }

    private List<String> union(String val, List<String> second) {
        List<String> list = second.stream().map(s -> val + s).collect(Collectors.toList());
        return list;
    }


}
