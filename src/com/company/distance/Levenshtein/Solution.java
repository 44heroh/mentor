package com.company.distance.Levenshtein;

import com.company.stack.StackLinkedList;

import java.util.Arrays;

public class Solution {

    public static void main(String[] args) {
        double similarity = LevenshteinDistance.calculate("[{}(][]", "[{}()][]");
        System.out.println(similarity);

//        System.out.println(AddBracketsForVaild.isValid("[{}}][]"));
//        System.out.println(AddBracketsForVaild.isValid("[{}(][]"));
//        System.out.println(AddBracketsForVaild.isValid("}}"));

        System.out.println(AddBracketsForVaild.isValid("(}})[}"));
    }

}
