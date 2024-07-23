package com.company.leetcode.alexey.greedy.integer_replacement;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Solution {

    Map<Integer, Integer> visited = new HashMap<>();
    /**
     * https://leetcode.com/problems/integer-replacement/
     *
     * 397. Integer Replacement
     *
     * Given a positive integer n, you can apply one of the following operations:
     *
     * If n is even, replace n with n / 2.
     * If n is odd, replace n with either n + 1 or n - 1.
     * Return the minimum number of operations needed for n to become 1.
     *
     * Example 1:
     *
     * Input: n = 8
     * Output: 3
     * Explanation: 8 -> 4 -> 2 -> 1
     *
     * Example 2:
     *
     * Input: n = 7
     * Output: 4
     * Explanation: 7 -> 8 -> 4 -> 2 -> 1
     * or 7 -> 6 -> 3 -> 2 -> 1
     *
     * Example 3:
     *
     * Input: n = 4
     * Output: 2
     *
     * @param n
     * @return
     */
    public int integerReplacement(int n) {
        int steps = 0;
        long num = n;

        // Запускаем цикл, который будет работать до тех пор, пока num больше 1
        while (num > 1) {
            // Если num чётное (остаток от деления на 2 равен 0)
            if (num % 2 == 0) {
                // Делим num на 2 с помощью побитового сдвига вправо
                num >>= 1;
            // Если num нечётное
            } else {
                // Проверяем, если num равно 3 или второй бит с конца num равен 0 (num & 2 == 0)
                if (num == 3 || (num & 2) == 0) {
                    // Уменьшаем num на 1
                    num--;
                } else {
                    // Увеличиваем num на 1
                    num++;
                }
            }
            steps++;
        }

        return steps;
    }

    public int integerReplacement2(int n) {
        if (n <= 1) return 0;

        if (!visited.containsKey(n)) {
            if ((n & 1) == 1) {
                visited.put(n, 2 + Math.min(integerReplacement(n >> 1),integerReplacement(1 + (n >> 1))));
            } else {
                visited.put(n, 1 + integerReplacement(n >> 1));
            }
        }

        return visited.get(n);
    }

    public long integerReplacement4(int n) {
        if (n > Math.pow(2, 31) - 1) return 0;
        return minOperation(n);
    }

    private long minOperation(long n) {
        if (n <= 1) return 0;

        if (n % 2 == 0) {
            return 1 + minOperation(n >> 1);
        } else {
            return 2 + Math.min(1 + minOperation(n - 1), 1 + minOperation(n + 1));
        }
    }
}
