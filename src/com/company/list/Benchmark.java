package com.company.list;

public class Benchmark {

//    @org.openjdk.jmh.annotations.Benchmark
    public int helloWorldBenchmark() {
        return 1;
    }

    @org.openjdk.jmh.annotations.Benchmark
    public void init() {
        MyList list = new MyList();
        for(int i = 1; i < 514; i++){
            list.add(i);
//            System.out.println(Arrays.toString(list.getBuffer()));
        }
    }
}
