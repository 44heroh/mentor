package com.company.main.tasks.CombinationsofArray;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Solution {

    public static Set<List<Integer>> generateCombinations(int[] nums, int k) {
//        List<List<Integer>> combinations = new ArrayList<>();
//        backtrack(combinations, new ArrayList<>(), nums, 0, k);
//        System.out.println(combinations);
//        List<List<Integer>> combinations1 = new ArrayList<>();
//        backtrack1(combinations1, new ArrayList<>(), nums, new boolean[nums.length]);
//        System.out.println(combinations1);
        Set<List<Integer>> combinations2 = new HashSet<>();
        for (int i = 1; i <= nums.length; i++) {
            backtrack2(combinations2, new ArrayList<>(), nums, new boolean[nums.length], 0, i);
        }
        return combinations2;
    }

    /**
     * без перестановок массива
     * @param combinations
     * @param current
     * @param nums
     * @param start
     * @param k
     */
    private static void backtrack(List<List<Integer>> combinations, List<Integer> current, int[] nums, int start, int k) {
        if(k == current.size()) {
            combinations.add(new ArrayList<>(current));
            return;
        }

        for (int i = start; i < nums.length; i++) {
            current.add(nums[i]);
            backtrack(combinations, current, nums, i + 1, k);
            current.remove(current.size() - 1);
        }
    }

    /**
     * Все перестановки массива
     * @param combinations
     * @param current
     * @param nums
     * @param used
     */
    private static void backtrack1(List<List<Integer>> combinations, List<Integer> current, int[] nums, boolean[] used) {
        if (current.size() == nums.length) {
            combinations.add(new ArrayList<>(current));
            return;
        }

        for (int i = 0; i < nums.length; i++) {
            if (used[i]) {
                continue;
            }

            current.add(nums[i]);
            used[i] = true;
            backtrack1(combinations, current, nums, used);
            used[i] = false;
            current.remove(current.size() - 1);
        }
    }

    private static void backtrack2(Set<List<Integer>> combinations, List<Integer> current, int[] nums, boolean[] used, int start, int k) {
        if (current.size() == k) {
            combinations.add(new ArrayList<>(current));
            return;
        }

        if(k == nums.length) {
            start = 0;
        }

        for (int i = start; i < nums.length; i++) {
            if (used[i]) {
                continue;
            }

            current.add(nums[i]);
            used[i] = true;
            backtrack2(combinations, current, nums, used, i + 1, k);
            used[i] = false;
            current.remove(current.size() - 1);
        }
    }
}
