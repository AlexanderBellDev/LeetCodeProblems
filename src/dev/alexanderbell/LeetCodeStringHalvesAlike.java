package dev.alexanderbell;

import java.util.Set;

public class LeetCodeStringHalvesAlike {

    public static void main(String[] args) {
        System.out.println(halvesAreAlike("AbCdEfGh"));
    }

    public static boolean halvesAreAlike(String s) {
        Set<Character> vowels = Set.of('a', 'e', 'i', 'o', 'u', 'A', 'E', 'I', 'O', 'U');
        int middlePoint = s.length() / 2;
        int leftSideLen = 0;
        int rightSideLen = 0;
        char[] chars = s.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            if(i < s.length() /2){
                if(vowels.contains(chars[i])){
                    leftSideLen++;
                }
            }else {
                if(vowels.contains(chars[i])){
                    rightSideLen++;
                }
            }
        }
        return leftSideLen == rightSideLen;
    }
}
