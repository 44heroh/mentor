package com.company.leetcode.problems.intersectionOfTwoArraysIi;

import java.util.*;

public class Solution {

    /**
     * 350. Intersection of Two Arrays II 350. Intersection of Two Arrays II
     * @param nums1
     * @param nums2
     * @return
     */

    public int[] intersect(int[] nums1, int[] nums2) {
        Arrays.sort(nums1);
        Arrays.sort(nums2);

        Map<Integer, Integer> map = new HashMap<>();
        for(int i = 0; i < nums1.length; i++){
            if(!map.containsKey(nums1[i])){
                map.put(nums1[i], 1);
            } else {
                map.put(nums1[i], map.get(nums1[i]) + 1);
            }
        }

        List<Integer> list = new ArrayList<>();
        for(int i = 0; i < nums2.length; i++){
            if(map.containsKey(nums2[i])){
                if(map.get(nums2[i]) > 1) {
                    map.put(nums2[i], map.get(nums2[i]) - 1);
                    list.add(nums2[i]);
                } else {
                    map.remove(nums2[i]);
                    list.add(nums2[i]);
                }
            }
        }


        int[] result = list.stream().mapToInt(Integer::intValue).toArray();
        return result;
    }
}
