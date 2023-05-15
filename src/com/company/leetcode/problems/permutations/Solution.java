package com.company.leetcode.problems.permutations;

import java.util.*;
import java.util.stream.Collectors;

public class Solution {

    /**
     * 46. Permutations https://leetcode.com/problems/permutations/
     * @param nums
     * @return
     */
//    public List<List<Integer>> permute2(int[] nums) {
//        List<List<Integer>> finalList = new ArrayList<>();
//        List<Integer> list = new ArrayList<>();
//        int index = 0;
//        for (int i = 0; i < nums.length * 2; i++) {
//            for (int j = index; j < nums.length; j++) {
//                if(index == nums.length)
//            }
//        }
//        return finalList;
//    }

    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> finalList = new ArrayList<>();
        helper(0, finalList, nums);

        return finalList;
    }

    private void helper(int index, List<List<Integer>> finalList, int[] nums) {
        if(index == nums.length){
            List<Integer> list = new ArrayList<>();
            for (int i = 0; i < nums.length; i++) {
                list.add(nums[i]);
            }
            finalList.add(new ArrayList<>(list));
            list.clear();
            return;
        }

        for (int i = index; i < nums.length; i++) {
            swap(index, i, nums);
            helper(index + 1, finalList, nums);
            swap(index, i, nums);
        }
    }


    private void swap(int x, int y, int[] nums) {
        int tmp = nums[x];
        nums[x] = nums[y];
        nums[y] = tmp;
    }






















    public List<List<Integer>> permute2(int[] nums) {
        List<List<Integer>> finalList = new ArrayList<>();
        helper2(0, finalList, nums);

        return finalList;
    }






































    private void helper2(int index, List<List<Integer>> finalList, int[] nums) {
        if(index == nums.length){
            List<Integer> list = new ArrayList<>();
            for (int i = 0; i < nums.length; i++){
                list.add(nums[i]);
            }
            finalList.add(new ArrayList<>(list));
            list.clear();
            return;
        }
        for (int i = index; i < nums.length; i++){
            swap1(i, index, nums);
            helper(index + 1, finalList, nums);
            swap1(i, index, nums);
        }
    }


    public List<List<Integer>> permute1(int[] nums) {
        List<List<Integer>> finalList = new ArrayList<>();
        helper(0,finalList,nums);
        return finalList;
    }

    private void helper1(int index, List<List<Integer>> finalList, int[] nums) {
        if(index == nums.length){
            List<Integer> list = new ArrayList<>();
            for (int i = 0; i < nums.length; i++){
                list.add(nums[i]);
            }
            finalList.add(new ArrayList<>(list));
            list.clear();
            return;
        }
        for (int i = index; i < nums.length; i++){
            int tmp = nums[i];
            nums[i] = nums[index];
            nums[index] = tmp;
            helper(index + 1, finalList, nums);
            int tmp1 = nums[i];
            nums[i] = nums[index];
            nums[index] = tmp1;
        }
    }

    private int[] swap1(int x, int y, int[] arr) {
        int tmp = arr[x];
        arr[x] = arr[y];
        arr[y] = tmp;

        return arr;
    }
}
