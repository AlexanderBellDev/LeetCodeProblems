package dev.alexanderbell;

public class LeetCodeLengthOfLastWord {

    public static void main(String[] args) {
        String s = "Hello World d ";
        System.out.println(lengthOfLastWord(s));
    }

    public static int lengthOfLastWord(String s) {
        if(s.isBlank()) return 0;
        String[] s1 = s.split(" ");
        return s1[s1.length-1].length();
    }

    public static int lengthOfLastWordSolution2(String s) {
        int currentSize = 0;
        boolean word = true;
        for (int i = 0; i < s.length(); i++) {
            if(s.charAt(i) != ' ') {
                if(!word){
                    word = true;
                    currentSize = 0;
                }
                currentSize ++;
            }else {
                word = false;

            }
        }
        return currentSize;
    }
}
