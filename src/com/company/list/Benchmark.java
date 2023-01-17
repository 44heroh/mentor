package com.company.list;

import org.openjdk.jmh.annotations.*;

@State(Scope.Benchmark)
public class Benchmark {
    @Param({"1000000", "10000000", "100000000"})
    public int listSize;

//    @Fork(value = 1, warmups = 1)
//    @Warmup(iterations = 1)
//    @org.openjdk.jmh.annotations.Benchmark
//    @BenchmarkMode(Mode.AverageTime)
//    public int helloWorldBenchmark() {
//        return listSize;
//    }


    @Fork(value = 1, warmups = 1)
    @Warmup(iterations = 1)
    @org.openjdk.jmh.annotations.Benchmark
    @BenchmarkMode(Mode.AverageTime)
    public void init() {
        MyList list = new MyList();
        for(int i = 0; i < listSize; i++){
            list.add(i);
        }
    }
}
