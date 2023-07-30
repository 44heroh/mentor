package com.company.main.tasks.canFinish;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class Solution {

    /**
     * 207. Course Schedule https://leetcode.com/problems/course-schedule/
     * @param numCourses
     * @param prerequisites
     * @return
     */
    public boolean canFinish(int numCourses, int[][] prerequisites) {
        List<List<Integer>> v = new ArrayList<>();
        for (int i = 0; i < numCourses; i++) {
            v.add(new ArrayList<>());
        }

        Stack<Integer> s = new Stack<>();
        int[] vis = new int[numCourses];
        int[] rst = new int[numCourses];
        for (int[] x : prerequisites) {
            v.get(x[1]).add(x[0]);
        }

        for (int i = 0; i < numCourses; i++) {
            if(vis[i] == 0 && dfs(v, i, rst, vis)) {
                return false;
            }
        }

        return true;
    }

    private boolean dfs(List<List<Integer>> v, int src, int[] rst, int[] vis) {
        vis[src] = 1;
        rst[src] = 1;
        for (int x : v.get(src)) {
            if(vis[x] == 0 && dfs(v, x, rst, vis)) {
                return true;
            } else if(rst[x] == 1) {
                return true;
            }
        }

        rst[src] = 0;
        return false;
    }
}
