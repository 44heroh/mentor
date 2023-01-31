package com.company.hashmap;

import java.math.BigInteger;
import java.util.Arrays;
import java.util.Random;

public class Solution {
    public static void main(String[] args) {
        HashMap hashMap = new HashMap();
//        LinkedList linkedList = new LinkedList(new Node(0), 0);
        for(int i = 0; i < 5; i++) {
//            linkedList.add(i);
            hashMap.add(i);
        }
        System.out.println(Arrays.toString(hashMap.getListKeys().getElements()));
        System.out.println(hashMap.get(3));

//        System.out.println(linkedList.find(3));
//        linkedList.print();

//        Person person = new Person("Will", 21);
//        System.out.println(generateHash(person.toString()));
//        System.out.println(generateHash("Hello!"));

//        hash("Hello!");
        System.out.println(hashCode("Hello!3213213"));
    }

    public static Object[] add() {
        HashMap hashMap = new HashMap();
        int[] arr = {0, 1, 2, 2, 3};
        for(int i = 0; i < 5; i++) {
            hashMap.add(arr[i]);
        }
        System.out.println(hashMap.get(2));
        System.out.println(Arrays.toString(hashMap.getListKeys().getElements()));
        return hashMap.getListKeys().getElements();
    }

    public static int hashCode(Object value) {
        int hash = 7;
        hash = 31 * hash + (value == null ? 0 : value.hashCode());
        return hash;
    }

    public static String hash(String text) {
        byte[] bytes = text.getBytes();
        System.out.println(Arrays.toString(bytes));
        BigInteger bigInt = new BigInteger(bytes);
        String binary = bigInt.toString(2);
        StringBuilder stringBuilder = new StringBuilder();
        String tmp = "";
        for(int i = 0; i < bytes.length; i++) {
            tmp = toBinaryString(bytes[i]);
            System.out.println(tmp);
            stringBuilder.append(tmp);
        }
        String result = stringBuilder.toString();
        System.out.println(result);
        System.out.println(binary);
        System.exit(0);
        return binary;
    }

    public static String toBinaryString(int num) {
        StringBuilder stringBuilder = new StringBuilder();
        System.out.println();
        while (num != 0) {
            int binary = num % 2 == 0 ? 0 : 1;
            stringBuilder.append(binary);
            System.out.println("binary = " + binary);
            num /= 2;
            System.out.println("num = " + num);

        }
        String result = stringBuilder.reverse().toString();
        return result;
    }

    public static String generateHash(String input) {
        Random random = new Random();
        int seed = random.nextInt();
        random.setSeed(seed);

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < input.length(); i++) {
            sb.append(Integer.toHexString(random.nextInt() ^ input.charAt(i)));
        }

        return sb.toString();
    }
}
