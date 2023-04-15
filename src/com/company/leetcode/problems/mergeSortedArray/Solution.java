package com.company.leetcode.problems.mergeSortedArray;

import java.util.Arrays;

public class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int i = m - 1, j = n - 1, k = n + m - 1;

        while(j >= 0) {
            if(i >= 0 && nums1[i] > nums2[j]) {
                nums1[k] = nums1[i];
                i--;
                k--;
            } else {
                nums1[k] = nums2[j];
                j--;
                k--;
            }
        }

        System.out.println(Arrays.toString(nums1));
    }

    public void merge1(int[] nums1, int m, int[] nums2, int n) {
        int i = 0, j = 0, k = 0;
        int[] a = new int[n + m];
        while(i < m && j < n) {
            if(nums1[i] <= nums2[j]) {
                a[k++] = nums1[i++];
            } else if(nums1[i] > nums2[j]){
                a[k++] = nums2[j++];
            }
        }

        while(i < m) {
            a[k++] = nums1[i++];
        }

        while(j < n) {
            a[k++] = nums2[j++];
        }

        for(int l = 0; l < a.length; l++)
        {
            nums1[l] = a[l];
        }

    }
}
