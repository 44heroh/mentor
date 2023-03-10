package com.company.stack;

import javax.swing.text.html.Option;

public class Stack {

    private Object[] array;
    private int start = 0;
    private int end;

    public Stack(int start) {
        this.array = new Object[start + 1];
        end = start;
    }

    public Object[] getArray() {
        return array;
    }

    public int getStart() {
        return start;
    }

    public void put(Object item) {
        if(end == start)
            return;
        start++;
        array[start] = item;
    }

    public Object pop() {
        if(start == 0)
            return null;
        Object tmp = array[start];
        array[start] = null;
        start--;
        return tmp;
    }

    public Object peek() {
        return array[start];
    }
}
