package com.company.leetcode.alexey.greedy.can_place_flower;

public class Solution {

    int countInsertion;
    boolean isInsertion;
    /**
     * https://leetcode.com/problems/can-place-flowers/description/
     *
     * 605. Can Place Flowers
     *
     * You have a long flowerbed in which some of the plots are planted, and some are not.
     * However, flowers cannot be planted in adjacent plots.
     * Given an integer array flowerbed containing 0's and 1's, where 0 means empty and 1 means not empty, and an integer n, return true if n new flowers can be planted in the flowerbed without violating the no-adjacent-flowers rule and false otherwise.
     *
     * @param flowerbed
     * @param n
     * @return
     */
    public boolean canPlaceFlowers(int[] flowerbed, int n) {
        int ans = 0, len = flowerbed.length;

        for (int i = 0; i < len; i++) {
            if (flowerbed[i] == 1) {
                i++;
            } else {
                if (i == 0 && i + 1 < len && flowerbed[i + 1] == 0) {
                    flowerbed[i] = 1;
                    ans++; i++;
                } else if (i > 0 && i == len - 1 && flowerbed[i - 1] == 0) {
                    flowerbed[i] = 1;
                    ans++; i++;
                } else if (i > 0 && flowerbed[i - 1] == 0 && flowerbed[i + 1] == 0) {
                    flowerbed[i] = 1;
                    ans++; i++;
                } else if (i == 0 && i == len - 1) {
                    flowerbed[i] = 1;
                    ans++; i++;
                }
            }
        }

        return ans >= n;
    }

    public boolean canPlaceFlowers1(int[] flowerbed, int n) {
        int len = flowerbed.length;
        int[] countNumbers = new int[2];
        isInsertion = false;
        countInsertion = 0;

        if (len == 1 && flowerbed[0] != 1) {
            return true;
        }

        for (int i = 0; i < len; i++) {
            if (flowerbed[i] != 1) {
                if (i == 0 && flowerbed[i + 1] != 1) {
                    addCountInsertion();
                    flowerbed[i] = 1;
                } else if (i == len - 1 && flowerbed[i - 1] != 1) {
                    addCountInsertion();
                    flowerbed[i] = 1;
                } else if (!isInsertion && flowerbed[i - 1] != 1 && flowerbed[i + 1] != 1){
                    addCountInsertion();
                    flowerbed[i] = 1;
                } else {
                    isInsertion = false;
                }
                countNumbers[flowerbed[i]]++;
            } else {
                isInsertion = false;
                countNumbers[flowerbed[i]]++;
            }
        }



        return countInsertion >= n;
    }

    private void addCountInsertion() {
        countInsertion++;
        isInsertion = true;
    }
}
