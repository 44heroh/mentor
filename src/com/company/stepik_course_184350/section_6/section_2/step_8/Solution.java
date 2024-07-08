package com.company.stepik_course_184350.section_6.section_2.step_8;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Solution {

    /**
     * Задача D. Красота превыше всего
     *
     * В парке города Питсбурга есть чудесная аллея, состоящая из 𝑁 посаженных в один ряд деревьев, каждое одного из 𝐾 сортов.
     * В связи с тем, что Питсбург принимает открытый чемпионат Байтландии по программированию, было решено построить огромную арену для проведения соревнований.
     * Так, согласно этому плану вся аллея подлежала вырубке.
     * Однако министерство деревьев и кустов воспротивилось этому решению, и потребовало оставить некоторые из деревьев в покое.
     * Согласно новому плану строительства все деревья, которые не будут вырублены, должны образовывать один непрерывный отрезок, являющийся подотрезком исходного.
     * Каждого из 𝐾 видов деревьев требуется сохранить хотя бы по одному экземпляру.
     * На вас возложена задача найти отрезок наименьшей длины, удовлетворяющий указанным ограничениям.
     *
     * Формат входных данных
     *
     * В первой строке входного файла находятся два числа 𝑁 и 𝐾.
     * Во второй строке входного файла следуют 𝑁 чисел (разделенных пробелами), 𝑖 -ое число второй строки задает цвет 𝑖 - ого слева дерева в аллее.
     * Гарантируется, что присутствует хотя бы одно дерево каждого цвета
     *
     * Формат выходных данных
     *
     * В выходной файл выведите два числа, координаты левого и правого концов отрезка минимальной длины, удовлетворяющего условию.
     * Если оптимальных ответов несколько, выведите любой.
     *
     * Input 1:
     * 5 3
     * 1 2 1 3 2
     * Output 1:
     * 2 4
     *
     * Input 2:
     * 6 4
     * 2 4 2 3 3 1
     * Output 2:
     * 2 6
     * @param args
     */
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int[] nk = getArrayIntFromString(reader.readLine(), null);
        int n = nk[0], k = nk[1];
        int[] trees = getArrayIntFromString(reader.readLine(), null);
        int[] ans = solve(trees, n, k);
        System.out.println(ans[0] + " " + ans[1]);
    }

    private static int[] solve(int[] trees, int n, int k) {
        int[] countColor = new int[k];
        int l = 0, r = 0, minDiff = Integer.MAX_VALUE;
        int found = 0, leftBorder = 0;

        while (r < n) {
            if (countColor[trees[r] - 1] == 0) {
                found++;
            }
            countColor[trees[r] - 1]++;

            while (found == k) {
                int diff = r - l;
                if (diff < minDiff) {
                    minDiff = diff;
                    leftBorder = l;
                }
                countColor[trees[l] - 1]--;

                if (countColor[trees[l] - 1] == 0) {
                    found--;
                }
                l++;
            }

            r++;
        }

        return new int[]{leftBorder + 1, leftBorder + minDiff + 1};
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
