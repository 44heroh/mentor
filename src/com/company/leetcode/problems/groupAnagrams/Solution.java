package com.company.leetcode.problems.groupAnagrams;

import java.util.*;
import java.util.stream.Collectors;

public class Solution {

    /**
     * 49. Group Anagrams https://leetcode.com/problems/group-anagrams/
     * @param strs
     * @return
     */
    public List<List<String>> groupAnagrams(String[] strs) {
        if(strs.length == 0){
            return new ArrayList<>();
        }

        Map<String, ArrayList<String>> map = new HashMap<>();

        for (String s : strs) {
            char[] chars = new char[26];
            for (char ch : s.toCharArray()){
                chars[ch - 'a']++;
            }

            String key = String.valueOf(chars);
            if(!map.containsKey(key)){
                map.put(key, new ArrayList<>());
            }
            map.get(key).add(s);
        }

        return new ArrayList<>(map.values());
    }

    public List<List<String>> groupAnagrams12(String[] strs) {
        Map<String, ArrayList<String>> map = new HashMap<>();

        for (String s : strs) {
            char[] chars = s.toCharArray();
            Arrays.sort(chars);
            String key = new String(chars);
            ArrayList<String> list = map.getOrDefault(key, new ArrayList<>());
            list.add(s);
            map.put(key, list);
        }

        List<List<String>> ans = new ArrayList<>();
        for (Map.Entry<String, ArrayList<String>> entry : map.entrySet()){
            ans.add(entry.getValue());
        }

        return ans;
    }

    public List<List<String>> groupAnagrams11(String[] strs) {
        System.out.println(strs.length);
        System.exit(1);
        List<List<String>> groups = new ArrayList<>();
        List<String> strings = new ArrayList<>();
        Collections.addAll(strings, strs);
        int count = 0;
        int i = 0;
        while (count != strs.length && i <= strings.size() - 1){
            List<String> list = new ArrayList<>();
            List<Integer> removers = new ArrayList<>();
            for (int j = 0; j < strings.size(); j++){
                if (i!=j){
                    if(isAnagram(strings.get(i), strings.get(j))){
                        if(!list.contains(strings.get(i))){
                            list.add(strings.get(i));
                            removers.add(i);
                        }

                        list.add(strings.get(j));
                        removers.add(j);
                    }
                }
            }

            if(!list.isEmpty())
                groups.add(list);
            else {
                i++;
            }
            if(!removers.isEmpty())
                remove(strings, removers);
            count++;
        }

        if(!strings.isEmpty()){
            for (String str : strings){
                List<String> list = new ArrayList<>();
                list.add(str);
                groups.add(list);
            }
        }

        return groups;
    }


    public List<List<String>> groupAnagrams1(String[] strs) {
        List<List<String>> groups = new ArrayList<>();
        List<String> strings = new ArrayList<>();
        Collections.addAll(strings, strs);
        Map<String, Boolean> map = new HashMap<>();
        int i = 0;
        int end = 0;
        while (!strings.isEmpty() && end < strings.size()){
            List<String> list = new ArrayList<>();
            List<Integer> removers = new ArrayList<>();
            if(strings.size() == 1){
                list.add(strings.get(i));
                removers.add(i);
            } else {
                for (int j = 0; j < strings.size(); j++){
                    if(i != j) {
                        if(isAnagram(strings.get(i), strings.get(j))){
                            if(!list.contains(strings.get(i)) || strings.get(i).length() <= 1){
                                list.add(strings.get(i));
                                removers.add(i);
                            }

                            if(!list.contains(strings.get(j)) || strings.get(j).length() <= 1){
                                list.add(strings.get(j));
                                removers.add(j);
                            }
                        }
                    }
                }
            }

            if(!strings.isEmpty() && !removers.isEmpty()){
                groups.add(list);
                remove(strings, removers);
            } else {
                end++;
            }
        }

        return groups;
    }

    private void remove(List<String> strings, List<Integer> removers){
        int count = 0;
        for(Integer id : removers){
            if(count > 0){
                strings.remove((int)id - count);
            } else {
                strings.remove((int)id);
            }
            count++;
        }
    }

    private boolean isAnagram(String s1, String s2){
        if(s1.length() != s2.length())
            return false;

        Map<Character, Integer> word1 = new HashMap<>();
        for (int i = 0; i < s1.length(); i++){
            Character current = s1.charAt(i);
            if(!word1.containsKey(current)){
                word1.put(current, 1);
            } else {
                word1.put(current, word1.get(current) + 1);
            }
        }

        Map<Character, Integer> word2 = new HashMap<>();
        for (int i = 0; i < s2.length(); i++){
            Character current = s2.charAt(i);
            if(!word2.containsKey(current)){
                word2.put(current, 1);
            } else {
                word2.put(current, word2.get(current) + 1);
            }
        }

        if(word1.equals(word2))
            return true;

        return false;
    }
}
