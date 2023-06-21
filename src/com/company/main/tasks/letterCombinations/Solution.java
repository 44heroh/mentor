package com.company.main.tasks.letterCombinations;

import java.util.*;
import java.util.stream.Stream;

public class Solution {

    /**
     * 17. Letter Combinations of a Phone Number https://leetcode.com/problems/letter-combinations-of-a-phone-number/
     * @param num
     * @return
     */
    public List<String> letterCombinations(int num) {
        int[] nums = Stream.of(String.valueOf(num).split(""))
                .mapToInt(Integer::parseInt)
                .toArray();
        String[] table = { "0",   "1",   "abc",  "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz" };
        List<String> list = new ArrayList<>();
        Queue<String> queue = new LinkedList<>();
        queue.add("");

        while (!queue.isEmpty()) {
            String s = queue.remove();

            if(s.length() == nums.length) {
                list.add(s);
            } else {
                String value = table[nums[s.length()]];
                for (int i = 0; i < value.length(); i++) {
                    queue.add(s + value.charAt(i));
                }
            }
        }

        return list;
    }
}
