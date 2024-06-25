package com.company.codeforces.contest_1985.task_h1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Scanner;

public class Solution {

    int n, m, minR, maxR, minC, maxC, sz, ans;
    int[] R, C, freeR, freeC;
    boolean[][] visit;
    char[][] A;

    public int solve(int n, int m, char[][] chars) {
        this.n = n;
        this.m = m;

        R = new int[n + 5];
        C = new int[m + 5];
        freeR = new int[n + 5];
        freeC = new int[m + 5];
        visit = new boolean[n + 5][m + 5];
        A = new char[n + 5][m + 5];

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= m; j++) {
                A[i][j] = chars[i - 1][j - 1];
                if (A[i][j] == '.') {
                    freeR[i]++;
                    freeC[j]++;
                }
            }
        }

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= m; j++) {
                if (visit[i][j] || A[i][j] == '.') continue;

                // Сброс значений перед новым обходом
                sz = 0;
                minR = Integer.MAX_VALUE;
                maxR = Integer.MIN_VALUE;
                minC = Integer.MAX_VALUE;
                maxC = Integer.MIN_VALUE;

                // Запуск DFS
                dfs(i, j);

                // Расширение границ на 1
                minR = Math.max(minR - 1, 1);
                maxR = Math.min(maxR + 1, n);
                minC = Math.max(minC - 1, 1);
                maxC = Math.min(maxC + 1, m);

                // Обновление префиксных сумм
                R[minR] += sz;
                R[maxR + 1] -= sz;

                C[minC] += sz;
                C[maxC + 1] -= sz;

            }
        }

        ans = 0; // Инициализация ответа

        System.out.println("R = " + Arrays.toString(R));
        System.out.println("freeR = " + Arrays.toString(freeR));
        System.out.println("C = " + Arrays.toString(C));
        System.out.println("freeC = " + Arrays.toString(freeC));

        // Обработка префиксных сумм и вычисление ответа
        for (int i = 1; i <= n; i++) {
            R[i] += R[i - 1];
            ans = Math.max(ans, freeR[i] + R[i]);
        }

        for (int i = 1; i <= m; i++) {
            C[i] += C[i - 1];
            ans = Math.max(ans, freeC[i] + C[i]);
        }

        System.out.println("R = " + Arrays.toString(R));
        System.out.println("freeR = " + Arrays.toString(freeR));
        System.out.println("C = " + Arrays.toString(C));
        System.out.println("freeC = " + Arrays.toString(freeC));

        return ans;
    }

    // Функция обхода в глубину (DFS)
    private void dfs(int i, int j) {
        // Проверка выхода за пределы и посещённых ячеек
        if (i <= 0 || i > n || j <= 0 || j > m || visit[i][j] || A[i][j] == '.') return;

        visit[i][j] = true;// Отмечаем ячейку как посещённую

        sz++; // Увеличиваем размер текущего компонента
        minR = Math.min(minR, i); // Обновляем минимальный ряд
        maxR = Math.max(maxR, i); // Обновляем максимальный ряд
        minC = Math.min(minC, j); // Обновляем минимальную колонку
        maxC = Math.max(maxC, j); // Обновляем максимальную колонку

        // Рекурсивные вызовы для соседних ячеек
        dfs(i - 1, j);
        dfs(i + 1, j);
        dfs(i, j - 1);
        dfs(i, j + 1);
    }


    private void dfs2(int i, int j) {
        if (i <= 0 || i > n || j <= 0 || j > m || visit[i][j] || A[i][j] == '.')
            return;

        visit[i][j] = true;

        sz++;
        minR = Math.min(minR, i);
        maxR = Math.max(maxR, i);
        minC = Math.min(minC, j);
        maxC = Math.max(maxC, j);

        dfs2(i - 1, j);
        dfs2(i + 1, j);
        dfs2(i, j - 1);
        dfs2(i, j + 1);
    }

    public int solve2(int n, int m, char[][] chars) {

        R = new int[n + 5]; // Включаем запас для безопасности
        C = new int[m + 5]; // Включаем запас для безопасности
        freeR = new int[n + 5]; // Включаем запас для безопасности
        freeC = new int[m + 5]; // Включаем запас для безопасности
        visit = new boolean[n + 5][m + 5];
        A = new char[n + 5][m + 5];

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= m; j++) {
                A[i][j] = chars[i - 1][j - 1];
                if (A[i][j] == '.') {
                    freeR[i]++;
                    freeC[j]++;
                }
            }
        }

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= m; j++) {
                if (visit[i][j] || A[i][j] == '.')
                    continue;

                sz = 0;
                minR = Integer.MAX_VALUE;
                maxR = Integer.MIN_VALUE;
                minC = Integer.MAX_VALUE;
                maxC = Integer.MIN_VALUE;

                dfs2(i, j);

                minR = minR == Integer.MAX_VALUE ? 1 : Math.max(minR - 1, 1);
                maxR = maxR == Integer.MIN_VALUE ? n : Math.min(maxR + 1, n);
                minC = minC == Integer.MAX_VALUE ? 1 : Math.max(minC - 1, 1);
                maxC = maxC == Integer.MIN_VALUE ? m : Math.min(maxC + 1, m);

                R[minR] += sz;
                if (maxR + 1 <= n) {
                    R[maxR + 1] -= sz;
                }

                C[minC] += sz;
                if (maxC + 1 <= m) {
                    C[maxC + 1] -= sz;
                }
            }
        }

        ans = 0;

        for (int i = 1; i <= n; i++) {
            R[i] += R[i - 1];
            ans = Math.max(ans, freeR[i] + R[i]);
        }
        for (int i = 1; i <= m; i++) {
            C[i] += C[i - 1];
            ans = Math.max(ans, freeC[i] + C[i]);
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
}
