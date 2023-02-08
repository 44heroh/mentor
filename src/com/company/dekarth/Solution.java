package com.company.dekarth;

import java.util.Arrays;

public class Solution {
    public static void main(String[] args) throws Exception {
        dekarth();
        String string = "102";
        int num = parseStringToInt(string);
        System.out.println(parseIntToString(num));

        num = 1;
        System.out.println();
        System.out.println(num >> 1);
        System.out.println(num << 1);
        System.out.println(num & 1);
        System.out.println(num | 1);
        System.out.println(num ^ 1);

        System.out.println();

        System.out.println();
        System.out.println(binaryMulti(10, 10));
        System.out.println(binaryDivision(10, 3));
        System.out.println(binaryDivision(100, 10));
    }

    public static int binaryMulti(int a, int b) {
        int result = 0;
        while(b > 0) {
            if((b & 1) == 1) {
                result += a;
            }
            a <<= 1;
            b >>= 1;
        }

        return result;
    }

    public static int binaryDivision(int dividend, int divisor) {
        int result = 0;
        while(divisor * result < dividend) {
            result += 1;
        }
        if(divisor * result > dividend) {
            result -= 1;
        }
        return result;
    }

    public static String parseIntToString(int num) {

        StringBuilder result = new StringBuilder();
        while(num != 0) {
            result.append(num);
            num /= 10;
            num %= 10;
        }
        return result.toString();
    }

    public static int parseStringToInt(String str) {
        int result = 0;
        boolean isMinus = false;
        for(int i = 0; i < str.length(); i++) {
            int tmpVal = 0;
            if(str.charAt(i) == '-') {
                isMinus = true;
            } else {
                tmpVal = Integer.parseInt(String.valueOf(str.charAt(i)));
            }

            if(str.charAt(i) != '-'){
                if(isMinus) {
                    result -= tmpVal;
                } else {
                    result += tmpVal;
                }
            }

            if(str.length() - 1 > i) {
                result *= 10;
            }
        }

        return result;
    }

    public static void dekarth() throws Exception {
        Character[] characters =  {'&', '|', '^'};
        boolean[] values = {true, false};
        boolean[] result = new boolean[12];

        int count = 0;
        for(int i = 0; i < values.length; i++) {
            for (int j = 0; j < values.length; j++) {
                for (char ch : characters) {
                    result[count] = evalute(values[i], values[j], ch);
//                    String str = values[i] + " " + ch + " " + values[j] + " = " + result[count];
//                    System.out.println(str);
                    count++;
                }
            }
        }

    }

    public static boolean evalute(boolean i1, boolean i2, char ch) throws Exception {
        switch (ch) {
            case '&':
                return i1 & i2;
            case '|':
                return i1 | i2;
            case '^':
                return i1 ^ i2;
            default:
                throw new Exception("unknow operator: " + ch);
        }
    }
}
