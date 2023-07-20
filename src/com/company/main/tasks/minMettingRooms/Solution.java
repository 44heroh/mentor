package com.company.main.tasks.minMettingRooms;

import java.util.Arrays;

public class Solution {

    /**
     * https://leetcode.com/problems/meeting-rooms/
     * @return
     */
    public int minMettingRooms(int[][] intervals) {
        int[] stars = new int[intervals.length];
        int[] ends = new int[intervals.length];
        for (int i = 0; i < intervals.length; i++) {
            stars[i] = intervals[i][0];
            ends[i] = intervals[i][1];
        }

        Arrays.sort(stars);
        Arrays.sort(ends);
        int rooms = 0;
        int endsItr = 0;
        for (int i = 0; i < stars.length; i++) {
            if(stars[i] < ends[endsItr]) {
                rooms++;
            } else {
                endsItr++;
            }
        }

        return rooms;
    }
}
