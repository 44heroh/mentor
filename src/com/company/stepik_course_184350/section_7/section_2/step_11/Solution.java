package com.company.stepik_course_184350.section_7.section_2.step_11;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Solution {

    /**
     * https://stepik.org/lesson/1136541/step/11?unit=1148177
     *
     * Задача E. Симпатичные узоры
     *
     * Компания планирует заняться выкладыванием во дворах у состоятельных клиентов узор из черных и белых плиток, каждая из которых имеет размер 1 × 1 метр.
     * Известно, что дворы всех состоятельных людей имеют наиболее модную на сегодня форму прямоугольника 𝑀 × 𝑁 метров.
     * Однако при составлении финансового плана у директора этой организации появилось целых две серьезных проблемы: во первых, каждый новый клиент очевидно захочет, чтобы узор, выложенный у него во дворе, отличался от узоров всех остальных клиентов этой фирмы, а во вторых, этот узор должен быть симпатичным.
     * Как показало исследование, узор является симпатичным, если в нем нигде не встречается квадрата 2 × 2 метра, полностью покрытого плитками одного цвета.
     * Для составления финансового плана директору необходимо узнать, сколько клиентов он сможет обслужить, прежде чем симпатичные узоры данного размера закончатся.
     * Помогите ему!
     *
     * Формат входных данных
     * В первой строке входных данных содержатся два положительных целых числа, разделенных пробелом: 𝑀 и 𝑁.
     *
     * Формат выходных данных
     * Выведите единственное число - количество различных симпатичных узоров, которые можно выложить во дворе.
     * Узоры, получающиеся друг из друга сдвигом, поворотом или отражением, считаются различными.
     *
     * @param args
     */
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int[] mn = getArrayIntFromString(reader.readLine(), null);
        Arrays.sort(mn);
        int M = mn[0], N = mn[1];

        System.out.println(solve(M, N));
    }

    private static int solve(int m, int n) {
        int[][] dp = new int[n][1 << m]; // 1 << m = (int) Math.pow(2, m)
        Arrays.fill(dp[0], 1);

        for (int i = 1; i < n; i++) {
            for (int p1 = 0; p1 < 1 << m; p1++) {
                for (int p2 = 0; p2 < 1 << m; p2++) {
                    if (match(p1, p2, m)) {
                        dp[i][p2] += dp[i - 1][p1];
                    }
                }
            }
        }

        int sum = Arrays.stream(dp[n - 1]).sum();

        return sum;
    }

    private static boolean match(int p1, int p2, int m) {
        // check 1111 rectangles
        int x1 = p1 & p2;
        int y1 = x1 << 1;
        // check 0000 rectangles
        p1 = 1 << m - p1;
        p2 = 1 << m - p2;
        int x2 = p1 & p2;
        int y2 = x2 << 1;

        return (x1 & y1) == 0 && (x2 & y2) == 0;
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
