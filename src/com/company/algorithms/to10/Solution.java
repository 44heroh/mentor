package com.company.algorithms.to10;

public class Solution {

    /**
     * Перевод из системы счисления с основанием d в c.c.с основание s
     * @param x
     * @param d
     * @return
     */
    public int to10(String x, int d) {
        x = reverseString(x);
        int res = 0;
        for (int i = 0; i < x.length(); i++) {
            int num = Integer.parseInt("" + x.charAt(i));
            res += num * Math.pow(d, i);
        }

        return res;
    }

    private String reverseString(String str) {
        return new StringBuilder(str).reverse().toString();
    }
}
