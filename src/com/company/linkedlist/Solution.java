package com.company.linkedlist;

import java.util.Arrays;

public class Solution {
    public static void main(String[] args) {
        int[] arr1 = {2, 4, 3};
        LinkedList linkedList1 = new LinkedList();
        for(int value: arr1) {
            linkedList1.add(value);
        }

        int[] arr2 = {5,6,4};
        LinkedList linkedList2 = new LinkedList();
        for(int value: arr2) {
            linkedList2.add(value);
        }

        String str1 = linkedList1.addToString();
        System.out.println(str1);
        int num1Revert = revertNum(parseStringToInt(str1));
        System.out.println(num1Revert);
        int num1 = num1Revert;
        System.out.println(num1Revert);

        System.out.println();
        String str2 = linkedList2.addToString();
        System.out.println(str2);
        int num2Revert = revertNum(parseStringToInt(str2));
        System.out.println(num2Revert);
        int num2 = num2Revert;
        System.out.println(num2Revert);

        System.out.println();
        int sum = num1 + num2;
        System.out.println(sum);
        LinkedList sumLinkedList = addToLinkedListSum(sum);
        sumLinkedList.print();
    }

    public static LinkedList addTwoNumbers(LinkedList linkedList1, LinkedList linkedList2) {

        String str1 = linkedList1.addToString();
        int num1Revert = revertNum(parseStringToInt(str1));
        int num1 = num1Revert;

        String str2 = linkedList2.addToString();
        int num2Revert = revertNum(parseStringToInt(str2));
        int num2 = num2Revert;

        int sum = num1 + num2;
        LinkedList sumLinkedList = addToLinkedListSum(sum);

        return sumLinkedList;
    }

    public static LinkedList addToLinkedListSum(int num) {
        LinkedList linkedList = new LinkedList<>();
        while(num > 0) {
            int digit = num % 10;
            linkedList.add(digit);
            num /= 10;
        }
        return linkedList;
    }

    public static int parseStringToInt(String str) {
        int result = 0;
        boolean isMinus = false;
        for(int i = 0; i < str.length(); i++) {
            int tmpVal = 0;
            if(str.charAt(i) == '-') {
                isMinus = true;
            } else {
                tmpVal = Integer.parseInt(String.valueOf(str.charAt(i)));
            }

            if(str.charAt(i) != '-'){
                if(isMinus) {
                    result -= tmpVal;
                } else {
                    result += tmpVal;
                }
            }

            if(str.length() - 1 > i) {
                result *= 10;
            }
        }

        return result;
    }

    public static int revertNum(int num) {
        int num2 = 0;
        int count = 0;
        StringBuilder stringBuilder = new StringBuilder();

        while(num > 0) {
            //Сначала забираем остаток
            int digit = num % 10;
            //Добавляем в строку
            stringBuilder.append(digit);
            //Делим нацело
            num /= 10;
            //Умножаем второе число на 10
            num2 *= 10;
            //Прибавляем остаток
            num2 += digit;
        }

        return num2;
    }
}
