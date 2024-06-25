package com.company.codeforces.contest_1985.task_h2;

public class Solution {

    int n, m, minR, maxR, minC, maxC, sz, ans;
    int[] R, C, freeR, freeC;
    boolean[][] visit;
    char[][] A;
    int[][] RC;

    public int solve(int n, int m, char[][] chars) {
        this.n= n;
        this.m = m;

        R = new int[n + 5];
        C = new int[m + 5];
        freeR = new int[n + 5];
        freeC = new int[m + 5];
        visit = new boolean[n + 5][m + 5];
        A = new char[n + 5][m + 5];
        RC = new int[n + 5][m + 5];

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= m; j++) {
                A[i][j] = chars[i - 1][j - 1];
                if (A[i][j] == '.') {
                    freeR[i]++;
                    freeC[j]++;
                }
            }
        }

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= m; j++) {
                if (visit[i][j] || A[i][j] == '.') continue;

                sz = 0;
                minR = Integer.MAX_VALUE;
                maxR = Integer.MIN_VALUE;
                minC = Integer.MAX_VALUE;
                maxC = Integer.MIN_VALUE;

                dfs(i, j);

                minR = Math.max(minR - 1, 1);
                maxR = Math.min(maxR + 1, n);
                minC = Math.max(minC - 1, 1);
                maxC = Math.min(maxC + 1, m);

                R[minR] += sz;
                R[maxR + 1] -= sz;

                C[minC] += sz;
                C[maxC + 1] -= sz;

                RC[minR][minC] += sz;
                RC[maxR + 1][minC] -= sz;
                RC[minR][maxC + 1] -= sz;
                RC[maxR + 1][maxC + 1] += sz;
            }
        }

        for (int i = 1; i <= n; i++) {
            R[i] += R[i - 1];
        }

        for (int i = 1; i <= m; i++) {
            C[i] += C[i - 1];
        }

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= m; j++) {
                RC[i][j] += RC[i - 1][j] + RC[i][j - 1] - RC[i - 1][j - 1];
            }
        }

        ans = 0;

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= m; j++) {
                ans = Math.max(ans, (R[i] + C[j] - RC[i][j]) + (freeR[i] + freeC[j] - (A[i][j] == '.' ? 1 : 0)));
            }
        }

        return ans;
    }

    private void dfs(int i, int j) {
        if (i <= 0 || i > n || j <= 0 || j > m || visit[i][j] || A[i][j] == '.') return;

        visit[i][j] = true;

        sz++;
        minR = Math.min(minR, i);
        maxR = Math.max(maxR, i);
        minC = Math.min(minC, j);
        maxC = Math.max(maxC, j);

        dfs(i - 1, j);
        dfs(i + 1, j);
        dfs(i, j - 1);
        dfs(i, j + 1);
    }
}
