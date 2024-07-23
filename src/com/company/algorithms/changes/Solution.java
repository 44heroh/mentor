package com.company.algorithms.changes;

import java.util.Comparator;
import java.util.Map;
import java.util.TreeMap;
import java.util.TreeSet;

public class Solution {

    /**
     * https://leetcode.com/problems/lemonade-change/
     *
     * 860. Lemonade Change
     *
     * At a lemonade stand, each lemonade costs $5.
     * Customers are standing in a queue to buy from you and order one at a time (in the order specified by bills).
     * Each customer will only buy one lemonade and pay with either a $5, $10, or $20 bill.
     * You must provide the correct change to each customer so that the net transaction is that the customer pays $5.
     * Note that you do not have any change in hand at first.
     * Given an integer array bills where bills[i] is the bill the ith customer pays, return true if you can provide every customer with the correct change, or false otherwise.
     *
     * Example 1:
     *
     * Input: bills = [5,5,5,10,20]
     * Output: true
     * Explanation:
     * From the first 3 customers, we collect three $5 bills in order.
     * From the fourth customer, we collect a $10 bill and give back a $5.
     * From the fifth customer, we give a $10 bill and a $5 bill.
     * Since all customers got correct change, we output true.
     *
     * Example 2:
     *
     * Input: bills = [5,5,10,10,20]
     * Output: false
     * Explanation:
     * From the first two customers in order, we collect two $5 bills.
     * For the next two customers in order, we collect a $10 bill and give back a $5 bill.
     * For the last customer, we can not give the change of $15 back because we only have two $10 bills.
     * Since not every customer received the correct change, the answer is false.
     *
     * @param bills
     * @param changes
     * @return
     */
    public boolean getChange(int[] bills, Map<Double, Integer> changes, int price) {
        int n = bills.length;
        Map<Double, Integer> billCount = new TreeMap<>(Comparator.reverseOrder());
        TreeSet<Double> coins = new TreeSet<>(Comparator.reverseOrder());

        for (Map.Entry<Double, Integer> entry : changes.entrySet()) {
            if (!billCount.containsKey(entry.getKey())) {
                billCount.put(entry.getKey(), entry.getValue());
                coins.add(entry.getKey());
            }
        }

        // Проходимся по каждому элементу в массиве bills
        for (int bill : bills) {
            double billdouble = (double) bill;
            if (changes.containsKey(billdouble)) {
                billCount.put(billdouble, billCount.getOrDefault(billdouble, 0) + 1);
            }

            // Рассчитываем сдачу
            double change = billdouble - price;

            // Если сдача > 0, то начинаем цикл
            if (change > 0) {
                // Проверяем, можем ли мы дать сдачу
                for (double coin : coins) {
                    while (change >= coin && billCount.get(coin) > 0) {
                        change -= coin;
                        billCount.put(coin, billCount.get(coin) - 1);
                    }
                    if (change == 0) {
                        break;
                    }
                }
            }

            // Если сдачу не удалось выдать, возвращаем false
            if (change > 0) {
                return false;
            }
        }

        return true;
    }
}
