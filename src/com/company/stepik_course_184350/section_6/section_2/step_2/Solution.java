package com.company.stepik_course_184350.section_6.section_2.step_2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Solution {

    /**
     * https://stepik.org/lesson/1135564/step/3?unit=1147202
     * Задача B. Город Мечта
     *
     * В центре города Мечта есть пешеходная улица - одно из самых популярных мест для прогулок жителей города.
     * По этой улице очень приятно гулять, ведь вдоль улицы расположено n забавных памятников.
     * Девочке Маше из города Мечта нравятся два мальчика из ее школы, и она никак не может сделать выбор между ними.
     * Чтобы принять окончательное решение, она решила назначить обоим мальчикам свидание в одно и то же время.
     * Маша хочет выбрать два памятника на пешеходной улице, около которых мальчики будут ее ждать.
     * При этом она хочет выбрать такие памятники, чтобы мальчики не увидели друг друга.
     * Маша знает, что из-за тумана мальчики увидят друг друга только в том случае, если они будут на расстоянии не более 𝑟 r метров.
     * Маше заинтересовалась, а сколько способов есть выбрать два различных памятника для организации свиданий.
     *
     * Формат входных данных
     *
     * В первой строке входного файла находятся два целых числа n и r - количество памятников и максимальное расстояние, на котором мальчики могут увидеть друг друга.
     * Во второй строке задано 𝑛 n положительных чисел - расстояния от i-го памятника до начала улицы.
     * Все памятники находятся на разном расстоянии от начала улицы.
     * Памятники приведены в порядке возрастания расстояния от начала улицы.
     *
     * Формат выходных данных
     * Выведите одно число - число способов выбрать два памятника для организации свиданий.
     *
     * Input 1:
     * 4 4
     * 1 3 5 8
     * Output 1:
     * 2
     *
     * Input 2:
     * 2 4
     * 1 5
     * Output 2:
     * 0
     *
     * @param args
     */
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int[] nr = getArrayIntFromString(reader.readLine(), null);
        int n = nr[0], r = nr[1];
        int[] coords = getArrayIntFromString(reader.readLine(), null);

        System.out.println(solve(coords, n, r));
    }

    private static int solve(int[] coords, int n, int r) {
        Arrays.sort(coords);
        int start = 0, end = n - 1, count = 0, pos = 0;

        for (int i = n - 1; i >= 0; i--) {
            if (coords[i] - coords[start] > r) {
                pos = i;
            }
        }

        while (end >= pos && start < end) {
            if (coords[end] - coords[start] > r) {
                count++;
            }

            if (start + 1 == end) {
                end--;
                start = 0;
            } else {
                start++;
            }
        }

        return count;
    }

    private static int solve1(int[] coords, int n, int r) {
        int i = 0, j = 1, count = 0;

        while (i >= 0 && j < n) {
            if (coords[j] - coords[i] <= r) {
                j++;
            } else {
                count += n - j;
                i++;
            }
        }

        return count;
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
