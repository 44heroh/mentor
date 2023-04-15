package com.company.leetcode.problems.pascalsTriangle;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    @Test
    void generate() {
        Solution solution = new Solution();
        List<List<Integer>> pascal = (ArrayList)solution.generate(5);
        pascal.stream().forEach((v)->System.out.println(" " + v.toString()));
//        for(List<Integer> value : pascal){
//            System.out.println(value);
//        }
    }
}