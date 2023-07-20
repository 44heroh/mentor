package com.company.main.tasks.combinations;

import java.util.ArrayList;
import java.util.List;

public class Solution {

    /**
     * 77. Combinations https://leetcode.com/problems/combinations/
     * @param n
     * @param k
     * @return
     */
    public List<List<Integer>> combine(int n, int k) {
        List<List<Integer>> output = new ArrayList<>();
        List<Integer> temp = new ArrayList<>();

        for (int i = 0; i < k; i++) {
            temp.add(0);
        }

        kCombination(output, temp, 0, n, 0, k);
        return output;
    }

    private void kCombination(List<List<Integer>> output, List<Integer> temp, int index, int n, int i, int k) {
        if(index == k) {
            output.add(new ArrayList<>(temp));
            return;
        }

        if(i >= n) {
            return;
        }

        temp.set(index, i + 1);
        kCombination(output, temp, index + 1, n, i + 1, k);
        kCombination(output, temp, index, n, i + 1, k);
    }
}
