package com.company.trees.ast;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    @Test
    void buildParseTree() {
        Solution solution = new Solution();
//        Solution.Node node = solution.buildParseTree("(3+(4*5))");
//        Solution.printTree(node);
//        Solution.Node node = solution.buildParseTree("(3+7)*(4*5)");
//        Solution.printTree(node);
        Solution.Node node = solution.buildParseTree("((3+2)+(7-4))*(4*5)");
        Solution.printTree(node);
        System.out.println();
        List<Double> result = solution.calc(node, new ArrayList<Double>());
        Collections.sort(result, Collections.reverseOrder());
        System.out.println(result.toString());
    }
}