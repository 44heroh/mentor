package com.company.stack;

import java.util.Arrays;

public class Solution {
    public static void main(String[] args) {
//        int size = 10;
//        Stack stack = new Stack(size);
//        for(int i = 0; i < size; i++) {
//            stack.put('(');
//        }
//        System.out.println(Arrays.toString(stack.getArray()));
//        System.out.println(stack.pop());
//        System.out.println(Arrays.toString(stack.getArray()));
//
//        System.out.println(isValid("([])"));

        StackLinkedList sll = new StackLinkedList();
        sll.push(1);
        sll.push(2);
        sll.push(3);
        sll.print();
        System.out.println();
        System.out.println("top = " + sll.peek());
        sll.pop();
        System.out.println("top = " + sll.peek());
        sll.print();
    }

    public static boolean isValid(String str) {
        // массив открытых скобок
        String[] open = {"(", "[", "{"};
        // массив закрытых скобок
        String[] close = {")", "]", "}"};
        StackLinkedList stack = new StackLinkedList();

        // проходим циктом по строке
        for(int i = 0; i < str.length(); i++){
            // присваиваем в переменную целевое значение
            String target = String.valueOf(str.charAt(i));
            // если целевое значение входит в массив открытых скобок
            if(Arrays.asList(open).contains(target)) {
                // то добавляем его в стек
                stack.push(target);
                continue;
            }

            // присваиваем в переменную текущее значение в стеке
            String current = (String) stack.peek();
            // текущее значение входит в массив закрытых скобок
            if(stack.getSize() == 0 && Arrays.asList(close).contains(target)) {
                return false;
            }

            // если target == "]" и current == "["
            if(target.equals("]") && current.equals("[")) {
                // то извлекаем один элемент сверху стека
                stack.pop();
            } else if(target.equals(")") && current.equals("(")) {
                stack.pop();
            } else if(target.equals("}") && current.equals("{")) {
                stack.pop();
            } else {
                return false;
            }
        }

        return stack.getSize() == 0;
    }
}
