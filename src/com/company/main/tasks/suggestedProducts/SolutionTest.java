package com.company.main.tasks.suggestedProducts;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    @Test
    void suggestedProducts() {
        String[] products = {"mobile","mouse","moneypot","monitor","mousepad"};
        String searchWord = "mouse";
        Solution solution = new Solution();
        System.out.println(solution.suggestedProducts(products, searchWord));
    }
}