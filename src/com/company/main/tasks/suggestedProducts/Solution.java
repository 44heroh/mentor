package com.company.main.tasks.suggestedProducts;

import java.util.ArrayList;
import java.util.List;
import java.util.PriorityQueue;

public class Solution {

    /**
     * 1268. Search Suggestions System https://leetcode.com/problems/search-suggestions-system/description/
     * @param products
     * @param searchWord
     * @return
     */
    public List<List<String>> suggestedProducts(String[] products, String searchWord) {
        //Инициируем PriorityQueue priorityQueue
        PriorityQueue<String> priorityQueue = new PriorityQueue<>(3, (s1, s2) -> s1.compareTo(s2));
        //Инициируем List<List<String>> для результата операций
        List<List<String>> list = new ArrayList<>();

        //Начинаем цикл с int i = 0 до i < products.length
        for (int i = 0; i < products.length; i++) {
            //Ищем начало слова searchWord.substring(0, i)
            String temp = searchWord.substring(0, i);
            //Начинаем подцикл по products
            for(String s : products) {
                //Смотрим начинается ли текущий product с начала искомого слова
                if(s.startsWith(temp)) {
                    //если начинается то добавляем в priorityQueue
                    priorityQueue.add(s);
                }
            }

            //Инициируем List<String> tempList для передачи списков в результат
            List<String> tempList = new ArrayList<>();
            for (int j = 0; j < 3; j++) {
                //Если priorityQueue != null
                if(priorityQueue.peek() != null) {
                    //То добаввляем её в tempList
                    tempList.add(priorityQueue.poll());
                }
            }

            //Очищаем priorityQueue
            priorityQueue.clear();
            //Добавляем tempList в результирующую переменную
            list.add(tempList);
        }

        return list;
    }
}
