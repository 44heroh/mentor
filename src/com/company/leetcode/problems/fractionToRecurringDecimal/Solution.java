package com.company.leetcode.problems.fractionToRecurringDecimal;

import java.util.HashMap;
import java.util.Map;

public class Solution {

    /**
     * 166. Fraction to Recurring Decimal https://leetcode.com/problems/fraction-to-recurring-decimal/
     * @param n
     * @param d
     * @return
     */
    public String fractionToDecimal(int n, int d) {
        Long a = Math.abs(Long.valueOf(n));
        Long b = Math.abs(Long.valueOf(d));

        StringBuilder sb = new StringBuilder();

        if((n < 0 && d > 0) || (d < 0 && n > 0))
            sb.append('-');

        sb.append(a / b);
        a = a % b;

        if (a > 0)
            sb.append('.');

        Map<Long, Integer> map = new HashMap<>();

        while (!map.containsKey(a)) {
            map.put(a, map.size());
            a *= 10;

            if(a > 0)
                sb.append(a / b);

            a = a % b;
        }

        if (a > 0) {
            sb.insert(sb.length() - (map.size() - map.get(a)), '(');
            sb.append(')');
        }

        return sb.toString();
    }

    public String fractionToDecimal2(int numerator, int denominator) {
        double divResult = ((double)numerator / (double)denominator);
        String str = String.valueOf(divResult);
        int count = String.valueOf(denominator).length();
        int numeratorX3 = numerator * 3;
        int denominatorX3 = denominator * 3;
        System.out.println(numeratorX3);
        System.out.println(denominatorX3);
        System.out.println(divResult);
        String numeratorStr = String.valueOf(numeratorX3);
        String repeat = count > numeratorStr.length() ? "0" + numeratorStr : numeratorStr;
        String prev = str.substring(0, str.lastIndexOf('.') + 1);
        String result = prev + "(" + repeat + ")";


        return result;
    }

    public String fractionToDecimal1(int numerator, int denominator) {
        double divResult = ((double)numerator / (double)denominator);
        String tmp = String.valueOf(divResult);
        String current = "";
        String prev = "";
        String repeat = "";
        int left = 0, right = tmp.length();
        while (left <= right) {
            String ch = tmp.charAt(left) == '.' ? "\\." : "" + tmp.charAt(left);
            current = current + ch;
            int count = (tmp + "\0").split(current).length - 1;
            if(count == 1) {
                prev = current + tmp.charAt(left);
                repeat = "";
                current = "";
            } else {
                if(!repeat.contains(current))
                    repeat = repeat + ch;
            }

            left++;
        }
        return prev + "(" + current + ")";
    }
}
