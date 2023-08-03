package com.company.main.tasks.numberToWords;

public class Solution {
    final String[] to19 = "One Two Three Four Five Six Seven Eight Nine Ten Eleven Twelve Thirteen Fourteen Fifteen Sixteen Seventeen Eighteen Nineteen".split(" ");
    final String[] tens = "Twenty Thirty Forty Fifty Sixty Seventy Eighty Ninety".split(" ");

    /**
     * 273. Integer to English Words https://leetcode.com/problems/integer-to-english-words/
     * @param num
     * @return
     */
    public String numberToWords(int num) {
        return helper(num);
    }

    public String helper(int n) {
        if(n <= 0) {
            return "";
        }

        if(n < 20) {
            return to19[n - 1];
        }

        if(n < 100) {
            return tens[n / 10 - 2] + " " + helper(n % 10);
        }

        if(n < 1000) {
            return to19[n / 100 - 1] + " Hundred " + helper(n % 100);
        }

        String[] bigDecimals = {"Thousand", "Million", "Billion"};
        for (int i = 0; i < bigDecimals.length; i++) {
            if(n < Math.pow(1000, i + 1)) {
                return helper(n / (int)Math.pow(1000, i)) + " " + bigDecimals[i - 1] + " " + helper(n % (int)Math.pow(1000, i));
            }
        }

        return "";
    }
}
