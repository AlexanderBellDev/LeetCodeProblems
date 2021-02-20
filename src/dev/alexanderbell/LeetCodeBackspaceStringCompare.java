package dev.alexanderbell;

import java.util.Stack;

public class LeetCodeBackspaceStringCompare {
    public static void main(String[] args) {
        System.out.println(backspaceCompare("bx#tw", "bxj##tw"));
    }

    public static boolean backspaceCompare(String S, String T) {
        Stack<Character> sStack = new Stack<>();
        Stack<Character> tStack = new Stack<>();

        for (int i = 0; i < S.length(); i++) {
            char c = S.charAt(i);
            if(c == '#'){
                if (!sStack.isEmpty()){
                    sStack.pop();
                }
            }else {
                sStack.push(S.charAt(i));
            }
        }

        for (int i = 0; i < T.length(); i++) {
            char currentChar = T.charAt(i);
            if(currentChar == '#'){
                if (!tStack.isEmpty()){
                    tStack.pop();
                }
            }else {
                tStack.push(T.charAt(i));
            }
        }
        return sStack.equals(tStack);
    }
}


















//    public static boolean backspaceCompare(String S, String T) {
//        Stack<String> integerStackS = new Stack<>();
//        String[] split = S.split("");
//        for (String s : split) {
//            if (s.equals("#")) {
//                if (!integerStackS.empty()) {
//                    integerStackS.pop();
//                }
//            } else {
//                integerStackS.push(s);
//            }
//        }
//
//        Stack<String> integerStackT = new Stack<>();
//        split = T.split("");
//
//        for (String s : split) {
//            if (s.equals("#")) {
//                if (!integerStackT.empty()) {
//                    integerStackT.pop();
//                }
//            } else {
//                integerStackT.push(s);
//            }
//        }
//
//
//        return integerStackS.equals(integerStackT);
//    }