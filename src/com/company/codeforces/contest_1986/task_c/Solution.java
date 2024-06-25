package com.company.codeforces.contest_1986.task_c;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class Solution {


    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int[] nm = getArrayIntFromString(reader.readLine(), null);
        int n = nm[0], m = nm[1];
        String s = reader.readLine();
        int[] indexes = getArrayIntFromString(reader.readLine(), null);
        String c = reader.readLine();

        System.out.println(solve(n, m, s, indexes, c));
    }

    private static String solve(int n, int m, String s, int[] indexes, String c) {
        char[] cArr = c.toCharArray();
        char[] sArr = s.toCharArray();

        // Создаем список пар (индекс, символ)
        List<Pair> updates = new ArrayList<>();
        Arrays.sort(indexes);
//        Arrays.sort(cArr);
        for (int i = 0; i < m; i++) {
            updates.add(new Pair(indexes[i], cArr[i]));
        }

        // Сортируем по символу (лексикографически)
        updates.sort(Comparator.comparing(pair -> pair.index));
//        updates.sort(Comparator.comparing(pair -> pair.character));

        // Преобразуем строку s в StringBuilder для удобства обновлений
        StringBuilder sb = new StringBuilder(s);

        // Выполняем обновления
        for (Pair update : updates) {
            sb.setCharAt(update.index - 1, update.character);
        }

        return new String(sb);
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

    static class Pair {
        int index;
        char character;

        Pair(int index, char character) {
            this.index = index;
            this.character = character;
        }
    }
}
