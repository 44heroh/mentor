package com.company.search.binary.tree;

import java.util.Arrays;
import java.util.Stack;

public class BinaryTreeSearch {

    public static class Node {
        int value;
        Node left;
        Node right;

        Node(int value) {
            this.value = value;
            this.left = null;
            this.right = null;
        }
    }

    private int[] resultFindByRange;

    public int[] getResultFindByRange() {
        return resultFindByRange;
    }

    public static int height(Node root)
    {
        if(root == null) {
            return 0;
        }

        return 1 + Math.max(height(root.left), height(root.right));
    }

    public static Node createTree(int[] arr, int left, int right) {
        if(left > right) {
            return null;
        }

        if(left == right) {
            return new Node(arr[left]);
        }

        int mid = (left + right) / 2;
        Node node = new Node(arr[mid]);
        node.left = createTree(arr, left, mid - 1);
        node.right = createTree(arr, mid + 1, right);

        return node;
    }

    public static int[] runLNR(Node current, int count, int[] result) {
        if(current == null) {
            return new int[result.length];
        }

        runLNR(current.left, count, result);
        while(result[count] != 0) {
            ++count;
        }
        result[count] = current.value;
        count++;
        runLNR(current.right, count, result);
        return result;
    }

    public static boolean find(Node current, int search) {
        while(true) {
            if(search < current.value) {
                current = current.left;
            } else if(search > current.value) {
                current = current.right;
            } else if(search == current.value) {
                return true;
            } else {
                return false;
            }
        }
    }

    public static int[] findByRange(Node current, int from, int to, int count, int[] result) {
        if(current == null) {
            return new int[result.length];
        }

        if(current.left != null) {
            if(from <= current.left.value + 1 && current.left.value <= to) {
                findByRange(current.left, from, to, count, result);
            }
        }
        if(from < current.value && current.value <= to) {
            while(result[count] != 0) {
                ++count;
            }
            result[count] = current.value;
            count++;
        }
        if(current.right != null) {
            if (from <= current.right.value && current.right.value <= to) {
                findByRange(current.right, from, to, count, result);
            }
        }

        return result;
    }

    public static void printTree(Node root) { // метод для вывода дерева в консоль
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
                Node temp = (Node) globalStack.pop(); // берем следующий, при этом удаляя его из стека
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
