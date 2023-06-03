package com.company.leetcode.problems.maximumProductSubarray;

import java.util.ArrayList;
import java.util.List;

public class Solution {

    /**
     * 152. Maximum Product Subarray https://leetcode.com/problems/maximum-product-subarray/
     * @param nums
     * @return
     */
    public int maxProduct(int[] nums) {
        int maxProduct = nums[0], minProduct = nums[0];
        int ans = nums[0];
        for(int i = 1; i < nums.length; i++){
            int tmp = Math.max(Math.max(maxProduct * nums[i], minProduct * nums[i]), nums[i]);
            minProduct = Math.min(Math.min(maxProduct * nums[i], minProduct * nums[i]), nums[i]);
            maxProduct = tmp;
            ans = Math.max(maxProduct, ans);
        }

        return ans;
    }

    public int maxProduct2(int[] nums) {
        if(nums.equals(null))
            return 0;

        if(nums.length == 1)
            return nums[0];

        int idx = 1;
        int maxProd = nums[0], minProd = nums[0], ans = 0;
        for (int i = idx; i < nums.length; i++) {
            int tmp = maxProd;
            maxProd = Math.max(Math.max(maxProd * nums[i], minProd * nums[i]), nums[i]);
            minProd = Math.max(Math.max(tmp * nums[i], minProd * nums[i]), nums[i]);
            ans = Math.max(ans, maxProd);
        }

        return ans;
    }

    public int maxProduct1(int[] nums) {
        if(nums.equals(null))
            return 0;

        if(nums.length == 1)
            return nums[0];

        int idx = 1;
        int multi = Integer.MIN_VALUE;
        int a = 0, b = 0;
        for (int i = idx; i < nums.length; i++) {
            if(nums[i] == 0 && nums[i - 1] > 0)
                a = 1;
            else
                a = nums[i];
            if(nums[i - 1] == 0 && nums[i] > 0)
                b= 1;
            else
                b = nums[i - 1];
            int tmp = a * b;
            multi = Math.max(tmp, multi);
        }

        return multi;
    }
}
