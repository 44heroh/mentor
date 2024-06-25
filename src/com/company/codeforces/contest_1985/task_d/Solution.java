package com.company.codeforces.contest_1985.task_d;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Solution {

    /**
     * https://codeforces.com/contest/1985/problem/D
     * @param args
     */
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int[] nm = getArrayIntFromString(reader.readLine(), null);
        int n = nm[0], m = nm[1];
        String[] strings = new String[n + 1];

        for (int i = 1; i < n + 1; i++) {
            strings[i] = reader.readLine();
        }

        System.out.println(Arrays.toString(solve(strings)));
    }

    private static int[] solve(String[] strings) {

        int n = strings.length, m = strings[1].length(), count = 0, end = 0;
        int[][] lastPoint = new int[1][2];
        int[][] topPoint = new int[1][2];
        int[][] leftPoint = new int[1][2];
        boolean isBreak = false;

        for (int i = 1; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (strings[i].charAt(j) == '#') {
                    lastPoint[0][0] = i;
                    lastPoint[0][1] = j;
                    if (count == 0) {
                        topPoint[0][0] = i;
                        topPoint[0][1] = j;
                    }
                    count++;
                    if (j - 1 >= 0 && i + 1 <= n - 1 && strings[i + 1].charAt(j - 1) == '#') {
                        leftPoint[0][0] = i + 1;
                        leftPoint[0][1] = j - 1;
                        j -= 2;
                        i += 1;
                        end = count + 2;
                    } else {
                        isBreak = true;
                        break;
                    }
                }
//                System.out.println(Arrays.toString(lastPoint[0]));
            }
            if (isBreak) {
                break;
            }
        }

        int y, x;
        if (leftPoint[0][0] > 0) {
            y = leftPoint[0][0];
        } else {
            y = topPoint[0][0];
        }

        x = topPoint[0][1] + 1;

        return new int[]{y, x};
    }

    private static int[] getArrayIntFromString(String s, String regex) throws Exception {
        if (s == null || s.equals("") || s.length() == 0) {
            throw new Exception("s is null");
        }

        if (regex == null || regex.equals("") || regex.length() == 0) {
            regex = " ";
        }

        return Arrays.stream(s.split(regex)).mapToInt(Integer::parseInt).toArray();
    }
}
