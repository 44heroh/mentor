package com.company.leetcode.problems.tripletSum;

import java.util.*;

public class Solution {

    /**
     * 15. 3Sum  https://leetcode.com/problems/3sum/
     * @param nums
     * @return
     */
    public List<List<Integer>> threeSum(int[] nums) {
        Set<List<Integer>> set = new HashSet<>();
        if(nums.length < 3)
            return new ArrayList<>();
        Arrays.sort(nums);

        for(int i = 0; i < nums.length - 2; i++){
            if(nums[i] > 0)
                break;
            int j = i + 1;
            int k = nums.length - 1;
            while(k > j){
                int currSum = nums[i] + nums[j] + nums[k];
                if(currSum == 0){
                    set.add(Arrays.asList(nums[i], nums[j], nums[k]));
                    j++;
                    k--;
                }
                if(currSum > 0){
                    k--;
                }
                if(currSum < 0){
                    j++;
                }
            }
        }

        return new ArrayList<>(set);
    }





































    public List<List<Integer>> threeSum1(int[] nums) {
        List<List<Integer>> list = new ArrayList<>();
        if(nums.length < 3)
            return list;
        Arrays.sort(nums);

        for(int i = 0; i < nums.length - 2; i++){
            for(int j = i + 1; j < nums.length; j++){
                for(int k = nums.length - 1; k > j; k--){
                    int currSum = nums[i] + nums[j] + nums[k];
                    if(i != j && i != k && j != k && currSum == 0){
                        List<Integer> tmp = new ArrayList<>();
                        tmp.add(nums[i]);
                        tmp.add(nums[j]);
                        tmp.add(nums[k]);
                        if(!list.contains(tmp))
                            list.add(tmp);
                    }
                }
            }
        }

        return list;
    }

    public List<List<Integer>> threeSum2(int[] nums) {
        Set<List<Integer>> set=new HashSet<>();
        if(nums.length < 3)
            return new ArrayList<>();
        Arrays.sort(nums);

        for(int i = 0; i < nums.length - 2; i++){
            for(int j = i + 1; j < nums.length; j++){
                for(int k = nums.length - 1; k > j; k--){
                    int currSum = nums[i] + nums[j] + nums[k];
                    if(i != j && i != k && j != k && currSum == 0){
                        List<Integer> tmp = new ArrayList<>();
                        tmp.add(nums[i]);
                        tmp.add(nums[j]);
                        tmp.add(nums[k]);
                        set.add(tmp);
                    }
                }
            }
        }

        return new ArrayList<>(set);
    }

    public List<List<Integer>> threeSum3(int[] nums) {
        Set<List<Integer>> set=new HashSet<>();
        if(nums.length < 3)
            return new ArrayList<>();
        Arrays.sort(nums);

        for(int i = 0; i < nums.length - 2; i++){
            if(nums[i] > 0)
                break;
            int j = i + 1;
            int k = nums.length - 1;
            while(k > j){
                int currSum = nums[i] + nums[j] + nums[k];
                if(currSum == 0){
                    set.add(Arrays.asList(nums[i], nums[j], nums[k]));
                    j++;
                    k--;
                }
                if(currSum > 0){
                    k--;
                }
                if(currSum < 0) {
                    j++;
                }
            }
        }

        return new ArrayList<>(set);
    }
}
