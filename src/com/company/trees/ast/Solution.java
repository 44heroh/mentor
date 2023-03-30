package com.company.trees.ast;

import com.company.search.binary.tree.BinaryTreeSearch;

import java.util.Arrays;
import java.util.List;
import java.util.Stack;

public class Solution {

    public static class Node {
        Object value;
        Solution.Node left;
        Solution.Node right;
        Solution.Node parent;
        boolean visited;

        Node(Object value) {
            this.value = value;
            this.left = null;
            this.right = null;
            this.parent = null;
            this.visited = false;
        }
    }

    private double result = 0;

    public Node buildParseTree1(String expression) {
        char[] chars = expression.toCharArray();
        System.out.println(Arrays.toString(chars));
        Node root = new Node(null);
        Stack<String> stack = new Stack<>();
        Node current = root;
        String[] operators = {"+", "-", "*", "/"};
        Node parent = null;

        for(int i = 0; i < chars.length; i++) {
            String currentChar = "" + chars[i];

            if(currentChar.equals("(")) {
                Node node = new Node(null);
                if(current.left == null) {
                    current.left = node;
                    current.left.parent = current;
                    current = current.left;
                } else if(current.right == null) {
                    current.right = node;
                    current.right.parent = current;
                    current = current.right;
                }
                stack.push(currentChar);

            } else if(Arrays.asList(operators).contains(currentChar)) {
                current.value = currentChar;
            } else if(isNumeric(currentChar)) {
                Node node = new Node(currentChar);
                if(current.left == null) {
                    node.parent = current;
                    current.left = node;
                } else if(current.right == null) {
                    node.parent = current;
                    current.right = node;
                }
            } else if(currentChar.equals(")")) {
                stack.pop();
                if(current != null)
                    current = current.parent;
            }
        }

        return root.equals(null) ? root.left : root;
    }

    public Node buildParseTree(String expression) {
        char[] chars = expression.toCharArray();
        System.out.println(Arrays.toString(chars));
        Node root = new Node(null);
        Stack<Node> stack = new Stack<>();
        Node current = root;
        String[] operators = {"+", "-", "*", "/"};
        Node parent = null;
        stack.push(root);

        for(int i = 0; i < chars.length; i++) {
            String currentChar = "" + chars[i];

            if(currentChar.equals("(")) {
                Node node = new Node("");
                current.left = node;
                stack.push(current);
                current = current.left;
            } else if(currentChar.equals(")")) {
                current = stack.pop();
            } else if(!Arrays.asList(operators).contains(currentChar)) {
                current.value = currentChar;
                parent = stack.pop();
                current = parent;
            } else if(Arrays.asList(operators).contains(currentChar) && !currentChar.equals(")")) {
                Node node = new Node("");
                current.value = currentChar;
                current.right = node;
                stack.push(current);
                current = current.right;
            }

            printTree(current);
        }

        return root.equals(null) ? root.left : root;
    }

    public static boolean isNumeric(String str) {
        try {
            Integer.parseInt(str);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }


    public List<Double> calc (Solution.Node current, List<Double> result, Solution.Node parent) {
        String[] operators = {"+", "-", "*", "/"};
        if(current == null)
            return result;

        if(current.left != null) {
            if(Arrays.asList(operators).contains((String) current.left.value))
                calc(current.left, result, current);
        }

        if(Arrays.asList(operators).contains((String) current.value)
                && current.visited == false
                && !Arrays.asList(operators).contains((String) current.left.value)
                && !Arrays.asList(operators).contains((String) current.right.value)
        ){
            double tmp = 0;
            switch((String) current.value) {
                case "+" :
                    tmp = Double.valueOf((String) current.left.value) + Double.valueOf((String) current.right.value);
                    break;
                case "-" :
                    tmp = Double.valueOf((String) current.left.value) - Double.valueOf((String) current.right.value);
                    break;
                case "*" :
                    tmp = Double.valueOf((String) current.left.value) * Double.valueOf((String) current.right.value);
                    break;
                case "/" :
                    tmp = Double.valueOf((String) current.left.value) / Double.valueOf((String) current.right.value);
                    break;
                default:
                    break;
            }
            current.value = String.valueOf(tmp);
            result.add(Double.valueOf((String) current.value));
            current.visited = true;
            current.left = null;
            current.right = null;
            if(parent != null) {
                current = parent;
            } else {
                return result;
            }

            calc(current, result, parent);
        }

        if(current.right != null){
            if(Arrays.asList(operators).contains((String) current.right.value))
                calc(current.right, result, current);
        }

        return result;
    }

    public List<Double> calc1 (Solution.Node current, List<Double> result) {
        String[] operators = {"+", "-", "*", "/"};
        if(current == null)
            return result;

        if(current.left != null) {
            if(Arrays.asList(operators).contains((String) current.left.value))
                calc1(current.left, result);
        }

        if(Arrays.asList(operators).contains((String) current.value)
                && current.visited == false
                && !Arrays.asList(operators).contains((String) current.left.value)
                && !Arrays.asList(operators).contains((String) current.right.value)
        ){
            double tmp = 0;
            switch((String) current.value) {
                case "+" :
                    tmp = Double.valueOf((String) current.left.value) + Double.valueOf((String) current.right.value);
                    break;
                case "-" :
                    tmp = Double.valueOf((String) current.left.value) - Double.valueOf((String) current.right.value);
                    break;
                case "*" :
                    tmp = Double.valueOf((String) current.left.value) * Double.valueOf((String) current.right.value);
                    break;
                case "/" :
                    tmp = Double.valueOf((String) current.left.value) / Double.valueOf((String) current.right.value);
                    break;
                default:
                    break;
            }
            current.value = String.valueOf(tmp);
            result.add(Double.valueOf((String) current.value));
            current.visited = true;
            current.left = null;
            current.right = null;
            if(current.parent != null) {
                current = current.parent;
            } else {
                return result;
            }

            calc1(current, result);
        }

        if(current.right != null){
            if(Arrays.asList(operators).contains((String) current.right.value))
                calc1(current.right, result);
        }

        return result;
    }

    /**
     * Вывод дерева
     * @param root
     */
    public static void printTree(Solution.Node root) { // метод для вывода дерева в консоль
        Stack globalStack = new Stack(); // общий стек для значений дерева
        globalStack.push(root);
        int gaps = 32; // начальное значение расстояния между элементами
        boolean isRowEmpty = false;
        String separator = "-----------------------------------------------------------------";
        System.out.println(separator);// черта для указания начала нового дерева
        while (isRowEmpty == false) {
            Stack localStack = new Stack(); // локальный стек для задания потомков элемента
            isRowEmpty = true;

            for (int j = 0; j < gaps; j++)
                System.out.print(' ');
            while (globalStack.isEmpty() == false) { // покуда в общем стеке есть элементы
                Solution.Node temp = (Solution.Node) globalStack.pop(); // берем следующий, при этом удаляя его из стека
                if (temp != null) {
                    System.out.print(temp.value); // выводим его значение в консоли
                    localStack.push(temp.left); // соохраняем в локальный стек, наследники текущего элемента
                    localStack.push(temp.right);
                    if (temp.left != null ||
                            temp.right != null)
                        isRowEmpty = false;
                }
                else {
                    System.out.print("__");// - если элемент пустой
                    localStack.push(null);
                    localStack.push(null);
                }
                for (int j = 0; j < gaps * 2 - 2; j++)
                    System.out.print(' ');
            }
            System.out.println();
            gaps /= 2;// при переходе на следующий уровень расстояние между элементами каждый раз уменьшается
            while (localStack.isEmpty() == false)
                globalStack.push(localStack.pop()); // перемещаем все элементы из локального стека в глобальный
        }
        System.out.println(separator);// подводим черту
    }
}
