package com.company.leetcode.problems.gasStation;

import java.util.Arrays;

public class Solution {

    /**
     * 134. Gas Station https://leetcode.com/problems/gas-station/
     * @param gas
     * @param cost
     * @return
     */
    public int canCompleteCircuit(int[] gas, int[] cost) {
        int have = 0, needed = 0, start = 0;
        for (int i = 0; i < gas.length; i++) {
            if(have < 0) {
                needed += have;
                start = i;
                have = 0;
            }

            have += gas[i] - cost[i];
        }

        if(have + needed >= 0) return start;

        return -1;
    }




















    public int canCompleteCircuit5(int[] gas, int[] cost) {
        int have = 0, needed = 0, start = 0;
        for (int i = 0; i < gas.length; i++) {
            if(have < 0) {
                needed += have;
                start = i;
                have = 0;
            }

            have += gas[i] - cost[i];
        }

        if(have + needed >= 0) return start;
        return -1;
    }


    public int canCompleteCircuit4(int[] gas, int[] cost) {
        for (int i = 0; i < gas.length; i++) {
            if(gas[i] >= cost[i]) {
                int end = findEndPoint(i, gas, cost);
                if(end == i)
                    return end;
                if(i > end)
                    return -1;
                i = end;
            }
        }

        return -1;
    }

    private int findEndPoint(int start, int[] gas, int[] cost) {
        int end = (start == gas.length - 1) ? 0 : start + 1;
        int tank = gas[start] - cost[start];

        while (end != start) {
            tank += gas[end] - cost[end];
            if(tank < 0)
                return end;
            end++;
            if(end == gas.length)
                end = 0;
        }

        return start;
    }









    public int canCompleteCircuit3(int[] gas, int[] cost) {
        for (int startPoint = 0; startPoint < gas.length; startPoint++) {
            if(gas[startPoint] >= cost[startPoint]) {
                int endPoint = findEndPoint(startPoint, gas, cost);
                if(endPoint == startPoint) {
                    return startPoint;
                }
                if(endPoint > startPoint)
                    return -1;
                startPoint = endPoint;
            }
        }
        return -1;
    }

    private int findEndPoint1(int start, int[] gas, int[] cost) {
        int end = (start == gas.length - 1) ? 0 : start + 1;
        int tank = gas[start] - cost[start];
        while (end != start) {
            tank += gas[start] - cost[start];
            if(tank < 0)
                return end;
            end++;
            if(end == gas.length)
                end = 0;
        }

        return start;
    }

    public int canCompleteCircuit2(int[] gas, int[] cost) {
        System.out.println(Arrays.toString(gas));
        System.out.println(Arrays.toString(cost));
        System.exit(1);
        int i = 0;
        int j = 0;
        int count = 0;
        int tank = 0;
        while (i <= gas.length - 1) {

            count = 0;
            tank = gas[i];
            j = i;
            int current = helper(i, j, count, tank, gas, cost);

            if(current >= 0)
                return current;

            i++;
        }

        return -1;
    }

    private int helper(int i, int j, int count, int tank,  int[] gas, int[] cost) {
        if(count == gas.length && j == i)
            return i;

        if(j == gas.length)
            return -1;

        if(tank >= 0)
            tank = tank - cost[j];

        if(tank < 0)
            return helper(i, j + 1, count, 0, gas, cost);

        if(j == gas.length - 1)
            j = 0;
        else
            j++;

        tank += gas[j];
        count++;

        return helper(i, j, count, tank, gas, cost);
    }

    public int canCompleteCircuit1(int[] gas, int[] cost) {
        int i = 0;
        int j = 0;
        int count = 0;
        int tank = 0;
//        System.out.println("-------------------");
        while (i <= gas.length - 1) {
            count = 0;
            tank = gas[i];
            j = i;
            while (count <= gas.length) {
//                System.out.println(gas[j]);
                if(count == gas.length && j == i)
                    return i;
                tank = tank - cost[j];
                if(tank < 0)
                    break;
                if(j == gas.length - 1)
                    j = 0;
                else
                    j++;
                tank += gas[j];
//                System.out.println("tank = " + tank);
                count++;
            }
            i++;
//            System.out.println("-------------------");
        }

        return -1;
    }
}
