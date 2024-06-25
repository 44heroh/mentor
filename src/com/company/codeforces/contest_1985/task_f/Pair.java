package com.company.codeforces.contest_1985.task_f;

import org.jetbrains.annotations.NotNull;

public class Pair implements Comparable<Pair>{

    long turn;
    long refresh;
    int index;

    public Pair(long turn, long refresh, int index) {
        this.turn = turn;
        this.refresh = refresh;
        this.index = index;
    }

    @Override
    public int compareTo(@NotNull Pair o) {
        if (this.turn == o.turn) {
            return Integer.compare(this.index, o.index);
        }

        return Long.compare(this.turn, o.turn);
    }
}
