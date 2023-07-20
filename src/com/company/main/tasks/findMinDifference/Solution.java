package com.company.main.tasks.findMinDifference;

import java.util.Arrays;
import java.util.List;

public class Solution {

    public int findMinDifference(List<String> timePoints) {
        int len = timePoints.size();
        int[] array = new int[len];

        for (int i = 0; i < len; i++) {
            array[i] = format(timePoints.get(i));
        }

        Arrays.sort(array);
        int res = Integer.MAX_VALUE;
        int t;

        for (int i = 0; i < len; i++) {
            t = Math.abs(array[i] - array[(i + 1) % len]);
            if(t > 12 * 60) {
                t = 24 * 60 - t;
            }

            res = Math.min(res, t);
        }

        return res;
    }

    private int format(String s) {
        String[] arr = s.split(":");
        return Integer.parseInt(arr[0]) * 60 + Integer.parseInt(arr[1]);
    }
}
