package dev.alexanderbell;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;
import java.util.Stack;

public class LeetCodeValidParenthesis {
    public static void main(String[] args) {
        System.out.println(isValid("]"));
    }

    public static boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();
        HashMap<Character,Character> bracketPair = new HashMap<>();
        bracketPair.put('(',')');
        bracketPair.put('{','}');
        bracketPair.put('[',']');
        
        for (int i = 0; i < s.length(); i++) {
            if(s.charAt(i) == '(' || s.charAt(i) == '{'  || s.charAt(i) == '[' ){
                stack.push(s.charAt(i));
            }else {
                if(stack.isEmpty()) return false;
                Character pop = stack.pop();
                if(!(s.charAt(i) == (bracketPair.get(pop)))){
                    return false;
                }
            }
        }
        return stack.isEmpty();
        }
           
    }

//    public static boolean isValid2(String s) {
//        String[] split = s.split("");
//        if(split.length <=1){
//            return false;
//        }
//        Stack<String> stack = new Stack<>();
//        for (String s1 : split) {
//            if(s1.equals("(") || s1.equals("[") || s1.equals("{")){
//                stack.push(s1);
//            }
//            if(s1.equals(")")){
//              if(stack.size() > 0 && stack.peek().equals("(")){
//                  stack.pop();
//              }else {
//                  return false;
//              }
//            }
//            if(s1.equals("]")){
//                if(stack.size() > 0 &&stack.peek().equals("[")){
//                    stack.pop();
//                }else {
//                    return false;
//                }
//            }
//            if(s1.equals("}")){
//                if(stack.size() > 0 &&stack.peek().equals("{")){
//                    stack.pop();
//                }else {
//                    return false;
//                }
//            }
//
//        }
//
//        return stack.size() == 0;
//    }