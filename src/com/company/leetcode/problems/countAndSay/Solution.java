package com.company.leetcode.problems.countAndSay;

public class Solution {

    /**
     * 38. Count and Say https://leetcode.com/problems/count-and-say/
     * @param n
     * @return
     */
    public String countAndSay(int n) {
        String prevCh = "1";
        for (int i = 1; i < n; i++){
            prevCh = convert(prevCh);
        }
        return prevCh;
    }

    private String convert(String s) {
        char prevCh = s.charAt(0);
        int prevCount = 1;
        int idx = 0;
        char[] result = new char[s.length() << 1];
        for (int i = 1; i < s.length(); i++) {
            char currentCh = s.charAt(i);
            if(currentCh != prevCh){
                result[idx++] = (char)(prevCount + '0');
                result[idx++] = prevCh;
                prevCh = currentCh;
                prevCount = 1;
            } else {
                prevCount++;
            }
        }

        result[idx++] = (char)(prevCount + '0');
        result[idx++] = prevCh;
        return new String(result, 0, idx);
    }





















    public String countAndSay4(int n) {
        if (n == 1)
            return "1";

        String prev = countAndSay(n - 1);

        char prevCh = prev.charAt(0);
        int prevCount = 0;
        int idx = 0;
        StringBuilder ans = new StringBuilder();
        int end = prev.length() << 1;
        for (char ch : prev.toCharArray()){
            if(prevCount == 0){
                prevCount = 1;
                continue;
            }

            if(prevCh != ch){
                if(idx <= end){
                    ans.append(prevCount);
                    ans.append(prevCh);
                    idx += 2;
                }
                prevCount = 1;
                prevCh = ch;
            } else {
                prevCount++;
            }
        }

        if(idx <= end){
            ans.append(prevCount);
            ans.append(prevCh);
            idx += 2;
        }
        return ans.toString();
    }

    public String countAndSay3(int n) {
        if (n == 1)
            return "1";

        String prev = countAndSay(n - 1);

        char prevCh = prev.charAt(0);
        int prevCount = 0;
        int idx = 0;
        String ans = "";
        int end = prev.length() << 1;
        for (char ch : prev.toCharArray()){
            if(prevCount == 0){
                prevCount = 1;
                continue;
            }

            if(prevCh != ch){
                if(idx <= end){
                    ans += prevCount + "" + prevCh;
                    idx += 2;
                }
                prevCount = 1;
                prevCh = ch;
            } else {
                prevCount++;
            }
        }

        if(idx <= end){
            ans += prevCount + "" + prevCh;
            idx += 2;
        }
        return ans;
    }

    public String countAndSay2(int n) {
        if (n == 1)
            return "1";

        String prev = countAndSay(n - 1);

        char prevCh = prev.charAt(0);
        int prevCount = 0;
        char[] res = new char[prev.length() << 1];
        int idx = 0;
        for (char ch : prev.toCharArray()){
            if(prevCount == 0){
                prevCount = 1;
                continue;
            }

            if(prevCh != ch){
                res[idx++] = (char)(prevCount + '0');
                res[idx++] = prevCh;
                prevCount = 1;
                prevCh = ch;
            } else {
                prevCount++;
            }
        }
        if(res.length > idx){
            res[idx++] = (char)(prevCount + '0');
            res[idx++] = prevCh;
        }
        return new String(res, 0, idx);
    }

    public String countAndSay1(int n) {
        String prevCh = "1";
        for (int i = 1; i < n; i++){
            String cnSum = convert1(prevCh);
            prevCh = cnSum;
        }
        return prevCh;
    }

    private String convert1(String s) {
        char prevCh = s.charAt(0);
        int prevCount = 1;
        String ans = "";
        for (int i = 1; i < s.length(); i++){
            char currentCh = s.charAt(i);
            if(currentCh != prevCh){
                ans += prevCount + "" + prevCh;
                prevCh = currentCh;
                prevCount = 1;
            } else {
                prevCount++;
            }
        }
        ans += prevCount + "" + prevCh;
        return ans;
    }


}
