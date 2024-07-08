package com.company.stepik_course_184350.section_6.section_2.step_6;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Solution {

    /**
     * https://stepik.org/lesson/1135564/step/6?unit=1147202
     * Задача С. Стильная одежда
     *
     * Маша обожает шоппинг.
     * Как-то раз она загорелась идеей подобрать себе майку и юбку так, чтобы выглядеть в них максимально стильно.
     * В понимании Маши стильность одежды тем больше, чем меньше разница в цвете элементов её одежды.
     * В наличии имеется N маек и M юбок, про каждый элемент известен его цвет (целое число).
     * Помогите Маше выбрать одну майку и одну юбку так, чтобы разница в их цвете была как можно меньше.
     *
     * Формат входных данных
     *
     * Сначала вводится информация о майках, далее о юбках (в двух строках).
     * Гарантируется, что номера цветов идут в возрастающем порядке (в частности, цвета никаких двух маек не совпадают).
     *
     * Формат выходных данных
     *
     * Выведите пару неотрицательных чисел -  цвет майки и цвет юбки, которые следует выбрать Маше.
     * Если вариантов выбора несколько, выведите любой из них
     *
     * Input 1:
     * 3 4
     * 1 2 3
     * Output 1:
     * 3 3
     *
     * Input 2:
     * 4 5
     * 1 2 3
     * Output 2:
     * 4 3
     *
     * Input 3:
     * 2 4
     * 1 2 6
     * Output 3:
     * 2 2
     *
     * Input 4:
     * 1 2 3 4 5
     * 1 2 3 4 5
     * Output 4:
     * 5 5
     * @param args
     */
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int[] tshirts = getArrayIntFromString(reader.readLine(), null);
        int[] skirts = getArrayIntFromString(reader.readLine(), null);

        int[] ans = solve2(tshirts, skirts);
        System.out.println(ans[0] + " " + ans[1]);
    }

    private static int[] solve(int[] tshirts, int[] skirts) {
        int n = tshirts.length, m = skirts.length;
        int i = 0, j = m - 1, minDiff = Integer.MAX_VALUE, maxSum = Integer.MIN_VALUE;
        int[] ans = new int[2];

        while (i < n && j >= 0) {
            int diff = Math.abs(tshirts[i] - skirts[j]);

            if (minDiff > diff) {
                minDiff = diff;
            }

            int sum = tshirts[i] + skirts[j];
            if (maxSum < sum && minDiff <= 1 && diff <= minDiff) {
                maxSum = sum;
                ans = new int[]{tshirts[i], skirts[j]};
            }

            if (tshirts[i] > skirts[j]) {
                i++;
            } else {
                if (Math.abs(tshirts[n - 1] - skirts[j]) <= 1) {
                    i++;
                } else {
                    j--;
                }
            }
        }

        return ans;
    }

    private static int[] solve2(int[] tshirts, int[] skirts) {
        int n = tshirts.length, m = skirts.length;
        int i = 0, j = 0, minDiff = Integer.MAX_VALUE, maxSum = Integer.MIN_VALUE;
        int[] ans = new int[2];

        while (i < n && j < m) {
            int diff = Math.abs(tshirts[i] - skirts[j]);

            if (minDiff > diff) {
                minDiff = diff;
            }

            int sum = tshirts[i] + skirts[j];
            if (maxSum < sum && diff == minDiff) {
                maxSum = sum;
                ans = new int[]{tshirts[i], skirts[j]};
            }

            if (tshirts[i] < skirts[j]) {
                i++;
            } else {
                j++;
            }
        }

        return ans;
    }

    private static int[] solve1(int[] tshirts, int[] skirts) {
        Arrays.sort(tshirts);
        Arrays.sort(skirts);
        int n = tshirts.length, m = skirts.length;
        int i = 0, j = m - 1;
        int[][] dp = new int[n][m];

        int[] ans = new int[2];
        int min = Integer.MAX_VALUE;

        for (int j1 = 0; j1 < m; j1++) {
            dp[0][j1] = Math.abs(tshirts[0] - skirts[j1]);
            int cur = dp[0][j1];

            if (cur <= 1) {
                if (min > cur) {
                    min = cur;
                    ans = new int[]{tshirts[i], skirts[j]};
                }
            }
        }

        i = 1;

        while (i < n && j >= 0) {
            int cur = Math.abs(tshirts[i] - tshirts[i - 1] + dp[i - 1][j]);
            dp[i][j] = cur;

            if (cur <= 1) {
                if (min > cur) {
                    min = cur;
                    ans = new int[]{tshirts[i], skirts[j]};
                }
            }

            if (j - 1 == 0) {
                j = m - 1;
                i++;
            } else {
                j--;
            }
        }

        return ans;
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

    private static void print(int[] ans) {
        int n = ans.length;

        for (int i = 0; i < n; i++) {
            if (i == n - 1) {
                System.out.print(ans[i]);
            } else {
                System.out.print(ans[i] + " ");
            }
        }
    }
}
