package com.company.distance.Levenshtein;

import com.company.stack.StackLinkedList;

import java.util.Arrays;
import java.util.HashMap;

public class AddBracketsForVaild {

    public static HashMap getMap() {
        HashMap<String, String> map = new HashMap<>();
        map.put("[", "]");
        map.put("]", "[");
        map.put("(", ")");
        map.put(")", "(");
        map.put("{", "}");
        map.put("}", "{");

        return map;
    }

    public static String isValid(String str) {
        // массив открытых скобок
        String[] open = {"(", "[", "{"};
        // массив закрытых скобок
        String[] close = {")", "]", "}"};
        StackLinkedList stack = new StackLinkedList();
        int count = 0;
        HashMap<String, String> map = getMap();
        String result = "";

        // проходим циктом по строке
        for(int i = 0; i < str.length(); i++){
            // присваиваем в переменную целевое значение
            String target = String.valueOf(str.charAt(i));
            // если целевое значение входит в массив открытых скобок
            if(Arrays.asList(open).contains(target)) {
                // то добавляем его в стек
                stack.push(target);
                result = result + target;
                count++;
                continue;
            } else if(Arrays.asList(close).contains(target)){
                stack.push(map.get(target));
                result = result + map.get(target);
                count++;
            }


            // текущее значение входит в массив закрытых скобок
            if(stack.getSize() == 0 && Arrays.asList(close).contains(target) && str.length() == 1 ) {
                result = result + map.get(target) + target;
                return result;
            }

            // присваиваем в переменную текущее значение в стеке
            String current = (String) stack.peek();

            // если target == "]" и current == "["
            if(target.equals("]") && current.equals("[")) {
                // то извлекаем один элемент сверху стека
                stack.pop();
                result = result + target;
                count++;
            } else if(target.equals(")") && current.equals("(")) {
                stack.pop();
                result = result + target;
                count++;
            } else if(target.equals("}") && current.equals("{")) {
                stack.pop();
                result = result + target;
                count++;
            } else {
                 String input = map.get(current);
                 if(Arrays.asList(open).contains(current) && Arrays.asList(close).contains(target) && input != target) {
                     if(Arrays.asList(close).contains(String.valueOf(str.charAt(i + 1)))) {
                         result = result + map.get(target) + target;
                     } else if(Arrays.asList(open).contains(String.valueOf(str.charAt(i + 1)))) {
                         result = result + input;
                         stack.pop();
                         result = result + target;
                         stack.pop();
                     }
                }
            }
        }


        if(stack.getSize() == 0) {
            return result;
        } else if(stack.getSize() > 0) {
            while(stack.getSize() > 0) {
                result = result + map.get(stack.peek());
                stack.pop();
            }
            return result;
        }

        return null;
    }
}
