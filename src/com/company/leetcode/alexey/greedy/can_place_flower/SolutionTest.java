package com.company.leetcode.alexey.greedy.can_place_flower;

import org.junit.jupiter.api.Test;

class SolutionTest {

    @Test
    void canPlaceFlowers1() {
        int[] flowerbed = new int[]{1,0,0,0,1};
        int n = 1;

        Solution solution = new Solution();
        System.out.println(solution.canPlaceFlowers(flowerbed, n));
    }

    @Test
    void canPlaceFlowers2() {
        int[] flowerbed = new int[]{1,0,0,0,1};
        int n = 2;

        Solution solution = new Solution();
        System.out.println(solution.canPlaceFlowers(flowerbed, n));
    }

    @Test
    void canPlaceFlowers3() {
        int[] flowerbed = new int[]{1,0,0,0,0,0,1};
        int n = 2;

        Solution solution = new Solution();
        System.out.println(solution.canPlaceFlowers(flowerbed, n));
    }

    @Test
    void canPlaceFlowers4() {
        int[] flowerbed = new int[]{1,0,1,0,1,0,1};
        int n = 1;

        Solution solution = new Solution();
        System.out.println(solution.canPlaceFlowers(flowerbed, n));
    }

    @Test
    void canPlaceFlowers5() {
        int[] flowerbed = new int[]{1,0,0,0,0,1};
        int n = 2;

        Solution solution = new Solution();
        System.out.println(solution.canPlaceFlowers(flowerbed, n));
    }

    @Test
    void canPlaceFlowers6() {
        int[] flowerbed = new int[]{1,0,1,0,1,0,1};
        int n = 1;

        Solution solution = new Solution();
        System.out.println(solution.canPlaceFlowers(flowerbed, n));
    }

    @Test
    void canPlaceFlowers7() {
        int[] flowerbed = new int[]{0,0,1,0,1};
        int n = 1;

        Solution solution = new Solution();
        System.out.println(solution.canPlaceFlowers(flowerbed, n));
    }

    @Test
    void canPlaceFlowers8() {
        int[] flowerbed = new int[]{1,0,1,0,0};
        int n = 1;

        Solution solution = new Solution();
        System.out.println(solution.canPlaceFlowers(flowerbed, n));
    }

    @Test
    void canPlaceFlowers9() {
        int[] flowerbed = new int[]{1,0,0,0,0};
        int n = 2;

        Solution solution = new Solution();
        System.out.println(solution.canPlaceFlowers(flowerbed, n));
    }

    @Test
    void canPlaceFlowers10() {
        int[] flowerbed = new int[]{1,0,0,0,0,0,1};
        int n = 2;

        Solution solution = new Solution();
        System.out.println(solution.canPlaceFlowers(flowerbed, n));
    }

    @Test
    void canPlaceFlowers11() {
        int[] flowerbed = new int[]{0,0,0,0,0,0,1};
        int n = 3;

        Solution solution = new Solution();
        System.out.println(solution.canPlaceFlowers(flowerbed, n));
    }

    @Test
    void canPlaceFlowers12() {
        int[] flowerbed = new int[]{1, 0};
        int n = 1;

        Solution solution = new Solution();
        System.out.println(solution.canPlaceFlowers(flowerbed, n));
    }

    @Test
    void canPlaceFlowers13() {
        int[] flowerbed = new int[]{0, 1, 0};
        int n = 1;

        Solution solution = new Solution();
        System.out.println(solution.canPlaceFlowers(flowerbed, n));
    }

    @Test
    void canPlaceFlowers14() {
        int[] flowerbed = new int[]{0};
        int n = 1;

        Solution solution = new Solution();
        System.out.println(solution.canPlaceFlowers(flowerbed, n));
    }
}