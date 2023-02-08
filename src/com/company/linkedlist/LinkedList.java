package com.company.linkedlist;

public class LinkedList<N> {

    private Node root;

    public LinkedList() {
        this.root = null;
    }

    public Node getRoot() {
        return root;
    }

    public void add(Object value) {
        if(root == null) {
            root = new Node(value);
            return;
        }

        Node current = root;
        while(current.next != null) {
            current = current.next;
        }
        current.next = new Node(value);;
    }

    public String addToString() {
        StringBuilder str = new StringBuilder();
        Node current = root;
        while(current.next != null) {
            str.append(current.value);
            current = current.next;
        }
        str.append(current.value);

        return str.toString();
    }

    public Node get(Object obj) {
        Node current = root;
        while(current.next != null) {
            if(current.value.equals(obj)) {
                return current;
            }
            current = current.next;
        }
        return null;
    }

    public void print() {
        Node current = root;
        while(current.next != null) {
            System.out.println(current.toString());
            current = current.next;
        }
    }
}
