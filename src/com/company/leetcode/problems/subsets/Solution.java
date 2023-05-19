package com.company.leetcode.problems.subsets;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Solution {

    /**
     * 78. Subsets https://leetcode.com/problems/subsets/
     * @param nums
     * @return
     */
    public List<List<Integer>> subsets(int[] nums) {
        Set<List<Integer>> ans = new HashSet<>();
        List<Integer> sub = new ArrayList<>();
        backtrack(nums, ans, sub, 0);

        return new ArrayList<>(ans);
    }

    private void backtrack(int[] nums, Set<List<Integer>> ans, List<Integer> sub, int index) {
        ans.add(new ArrayList<>(sub));
        for (int i = index; i < nums.length; i++) {
            sub.add(nums[i]);
            backtrack(nums, ans, sub, i + 1);
            sub.remove(sub.size() - 1);
        }
    }

    private void backtrack1(int[] nums, Set<List<Integer>> ans, List<Integer> sub, int index) {
        if(index == nums.length){
            ans.add(new ArrayList<>(sub));
            return;
        }

        sub.add(nums[index]);
        backtrack(nums, ans, sub, index + 1);
        sub.remove(sub.size() - 1);
        backtrack(nums, ans, sub, index + 1);
    }


//    public List<List<Integer>> subsets1(int[] nums) {
//        Set<List<Integer>> ans = new HashSet<>();
//        List<Integer> sub = new ArrayList<>();
//        backtrack1(nums, 0, ans, sub);
//        return new ArrayList<>(ans);
//    }

//    private void backtrack1(int[] nums, int index, Set<List<Integer>> ans, List<Integer> sub) {
//        ans.add(new ArrayList<>(sub));
//        for(int i = index; i < nums.length; i++) {
//            sub.add(nums[i]);
//            backtrack(nums, i + 1, ans, sub);
//            sub.remove(sub.size() - 1);
//        }
//    }
}
