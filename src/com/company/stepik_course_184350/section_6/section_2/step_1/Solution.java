package com.company.stepik_course_184350.section_6.section_2.step_1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Solution {

    /**
     * Задача A. Слияние
     *
     * Вам даны два целочисленных массива, отсортированных в порядке неубывания.
     * Необходимо объединить массивы в один так, чтобы отсортированность в порядке неубывания сохранилась.
     * Важно: Окончательный отсортированный массив должен храниться внутри первого списка.
     * Чтобы это учесть, первый список дозаполнен недостающими нулями при вводе.
     *
     * Формат входных данных В первой строке вводится значение n - длина первого списка.
     * В следующей строке вводится первый список.
     * Элементы  разделены через пробел.
     * В третьей строке вводится значение m - длина второго списка.
     * В следующей строке вводится второй список.
     *
     * Формат выходных данных Выведите результирующий список.
     *
     * Input 1:
     * 3
     * 1 2 3 0 0 0
     * 3
     * 2 5 6
     * Output 1:
     * 1 2 2 3 5 6
     *
     * Input 2:
     * 4
     * 1 5 10 44 0 0
     * 2
     * 12 22
     * Output 2:
     * 1 5 10 12 22 44
     * @param args
     * @throws Exception
     */
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(reader.readLine());
        int[] a = new int[n];
        if (n > 0) {
            a = getArrayIntFromString(reader.readLine(), null);
        }

        int m = Integer.parseInt(reader.readLine());
        int[] b = new int[m];
        if (m > 0) {
            b = getArrayIntFromString(reader.readLine(), null);
        }

        if (n == 0 && m > 0) {
            a = b;
        } else if (m == 0 && n > 0) {
            b = a;
        } else if (m > 0 && n > 0){
            a = merge(n, a, m, b);
        }

        for (int i = 0; i < a.length; i++) {
            if (i == a.length - 1) {
                System.out.print(a[i]);
            } else {
                System.out.print(a[i] + " ");
            }
        }
        System.out.println();
        System.out.println(Arrays.toString(merge(n, a, m, b)));
    }

    private static int[] merge(int n, int[] a, int m, int[] b) {
        int i = n - 1, j = m - 1, len = n + m - 1;
        while (i >= 0 && j >= 0) {
            if (a[i] > b[j]) {
                a[len] = a[i];
                i--;
            } else {
                a[len] = b[j];
                j--;
            }
            len--;
        }

        return a;
    }

    private static void swap(int[] tmp, int i, int j) {
        int temp = tmp[i];
        tmp[i] = tmp[j];
        tmp[j] = temp;
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
