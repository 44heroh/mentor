package com.company.algorithms.changes;

import org.junit.jupiter.api.Test;

import java.util.HashMap;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {


    @Test
    void getChange1() {
        Map<Double, Integer> changes = new HashMap<>();
        changes.put(1.0, 10);
        changes.put(5.0, 0);
        changes.put(10.0, 0);

        int[] bills = {5,5,5,10,20};
        int price = 5;

        Solution solution = new Solution();

        System.out.println(solution.getChange(bills, changes, price));
    }

    @Test
    void getChange2() {
        Map<Double, Integer> changes = new HashMap<>();
        changes.put(1.0, 1);
        changes.put(5.0, 0);
        changes.put(10.0, 0);

        int[] bills = {5,5,10,10,20};
        int price = 5;

        Solution solution = new Solution();

        System.out.println(solution.getChange(bills, changes, price));
    }

    @Test
    void getChange3() {
        Map<Double, Integer> changes = new HashMap<>();
        changes.put(1.0, 10);
        changes.put(2.0, 0);
        changes.put(5.0, 0);

        int[] bills = {2, 3, 4};
        int price = 2;
        Solution solution = new Solution();
        System.out.println(solution.getChange(bills, changes, price));
    }
}