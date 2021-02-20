package dev.alexanderbell;

import java.util.Arrays;

public class LeetCodeValidAnagram {
    public static void main(String[] args) {
        System.out.println(isAnagram("a","ab"));
    }

    public static boolean isAnagram(String s, String t) {
        if(s.length() != t.length()) return false;
        char[] sChars = s.toCharArray();
        char[] tChars = t.toCharArray();
        Arrays.sort(sChars);
        Arrays.sort(tChars);
        int l = 0, r = 0;
        for (int i = 0; i < s.length(); i++) {
            if(sChars[i] != tChars[i]){
                return false;
            }
        }

        return true;
    }
}
