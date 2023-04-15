package com.company.leetcode.problems.moveZeroes;

import java.util.Arrays;

public class Solution {

    /**
     * 283. Move Zeroes https://leetcode.com/problems/move-zeroes/
     * @param nums
     */
    public void moveZeroes1(int[] nums) {
        for(int i = 0; i < nums.length; i++){
            if(nums[i] == 0 && i < nums.length + 1) {
                int j = i + 1;
                while(j < nums.length) {
                    if(nums[j] != 0) {
                        swap(nums, i , j);
                        break;
                    }
                    j++;
                }
            }
        }

        System.out.println(Arrays.toString(nums));
    }

    public void swap(int[] nums, int x, int y) {
        int tmp = nums[x];
        nums[x] = nums[y];
        nums[y] = tmp;
    }

    public void moveZeroes(int[] nums) {
        int k=0;
        while(k<nums.length){
            if(nums[k] == 0){
                break;
            } else{
                k++;
            }
        }

        int i = k, j=k+1;
        while(i<nums.length && j<nums.length){
            if(nums[j]!=0){
                int tmp = nums[i];
                nums[i] = nums[j];
                nums[j] = tmp;
                i++;
            }

            j++;
        }

        System.out.println(Arrays.toString(nums));
    }
}
