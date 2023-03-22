package com.company.hash.map;

import java.util.Arrays;

public class Solution {

    public static Object[] addToLinkedList(){
        LinkedList linkedList = new LinkedList<>();
        for(int i = 0; i < 4; i++) {
            linkedList.add(new Node(i, i));
        }
        linkedList.print();
        System.out.println(linkedList.get(2).toString());
        return new Object[0];
    }

    public static Object[] addToHashMap(){
        HashMap hashMap = new HashMap(3);
        int[] arr = {0, 1, 2, 3, 4};
        for(int i = 0; i < 5; i++) {
            hashMap.add(arr[i], arr[i]);
        }
        hashMap.print();
        System.out.println(hashMap.get(1).toString());
        System.out.println(hashMap.get(3).toString());
        System.out.println(Arrays.toString(hashMap.getListKeys().getElements()));
        return new Object[0];
    }
}
