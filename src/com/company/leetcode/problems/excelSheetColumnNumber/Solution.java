package com.company.leetcode.problems.excelSheetColumnNumber;

import java.util.HashMap;

public class Solution {

    /**
     * 171. Excel Sheet Column Number https://leetcode.com/problems/excel-sheet-column-number/
     * @param columnTitle
     * @return
     */
    public int titleToNumber(String columnTitle) {

        if(columnTitle.equals(null))
            return -1;

        columnTitle = columnTitle.toUpperCase();
        char[] chars = columnTitle.toCharArray();
        HashMap<Character, Integer> map = new HashMap<>();
        map.put('A', 1);
        map.put('B', 2);
        map.put('C', 3);
        map.put('D', 4);
        map.put('E', 5);
        map.put('F', 6);
        map.put('G', 7);
        map.put('H', 8);
        map.put('I', 9);
        map.put('J', 10);
        map.put('K', 11);
        map.put('L', 12);
        map.put('M', 13);
        map.put('N', 14);
        map.put('O', 15);
        map.put('P', 16);
        map.put('Q', 17);
        map.put('R', 18);
        map.put('S', 19);
        map.put('T', 20);
        map.put('U', 21);
        map.put('V', 22);
        map.put('W', 23);
        map.put('X', 24);
        map.put('Y', 25);
        map.put('Z', 26);

        int sum = 0;
        for(int i = 0; i < chars.length; i++) {
            sum = sum * 26 + map.get(chars[i]);
        }

        return sum;
    }

    public int titleToNumber2(String columnTitle) {

        if(columnTitle.equals(null))
            return -1;

        char[] ch = columnTitle.toCharArray();
        int sum = 0;
        for(int i = 0; i < ch.length; i++) {
            int diff = ch[i] - 'A' + 1;
            sum = sum * 26 + diff;
        }

        return sum;
    }
}
