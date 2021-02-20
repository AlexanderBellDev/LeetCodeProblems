package dev.alexanderbell;

import java.util.*;

public class LeetCodeGroupAnagrams {
    public static void main(String[] args) {
        System.out.println(groupAnagrams(new String[]{"eat", "tea", "tan", "ate", "nat", "bat"}));
    }

    public static List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> stringListHashMap = new HashMap<>();
        for (String str : strs) {
            char[] chars = str.toCharArray();
            Arrays.sort(chars);
            String orderedString = new String(chars);
            if (stringListHashMap.containsKey(orderedString)) {
                List<String> stringList = stringListHashMap.get(orderedString);
                stringList.add(str);
                stringListHashMap.put(orderedString, stringList);
            } else {
                ArrayList<String> value = new ArrayList<>();
                value.add(str);
                stringListHashMap.put(orderedString, value);
            }
        }
        List<List<String>> finalList = new ArrayList<>();
        for (String s : stringListHashMap.keySet()) {
            finalList.add(stringListHashMap.get(s));
        }
        return finalList;
    }

    public static List<List<String>> groupAnagrams2(String[] strs) {
        HashMap<String, List<String>> canonToStrings = new HashMap<>();
        for (String str : strs) {
            //get the individual characters
            char[] letters = str.toCharArray();
            // sort the characters
            Arrays.sort(letters);
            // form a new string from sorted characters
            String canon = new String(letters);

            //return the list with the index of the sorted word
            List<String> canonWords = canonToStrings.getOrDefault(canon, new ArrayList<>());
            //add the unsorted word
            canonWords.add(str);
            //reinsert into the hashmap
            canonToStrings.put(canon, canonWords);
        }
        List<List<String>> finalList = new ArrayList<>();
        for (String s : canonToStrings.keySet()) {
            finalList.add(canonToStrings.get(s));
        }

        return finalList;
    }
}
