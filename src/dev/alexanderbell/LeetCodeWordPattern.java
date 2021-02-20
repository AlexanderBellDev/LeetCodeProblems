package dev.alexanderbell;

import java.util.HashMap;
import java.util.Map;

public class LeetCodeWordPattern {
    public static void main(String[] args) {
        System.out.println(wordPattern("a","a"));
    }

    public static boolean wordPattern(String pattern, String s) {

        Map<String,Character> hashMap = new HashMap<>();
        String[] s1 = s.split(" ");
        if(pattern.length() != s1.length) return false;
        int patternIndex = -1;
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < s1.length; i++) {
            char currentChar = pattern.charAt(i);
            if(!hashMap.containsKey(s1[i])){
                if(hashMap.containsValue(currentChar)) return false;
                result.append(currentChar);
                hashMap.put(s1[i],currentChar);

            }else {
                result.append(hashMap.get(s1[i]));
            }
        }


        return result.toString().equals(pattern);
    }
}
