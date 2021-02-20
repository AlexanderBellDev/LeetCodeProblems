package dev.alexanderbell;

import java.util.Stack;

public class LeetCodeMinRemoveToMakeValidParenthesis {
    public static void main(String[] args) {
        System.out.println(minRemoveToMakeValid("))(("));
    }

    public static String minRemoveToMakeValid(String s) {
        StringBuilder stringBuilder = new StringBuilder(s);
        String[] split = s.split("");
        if (split.length <= 1) {
            return s;
        }
        Stack<Pair> stack = new Stack<>();
        for (int i = 0; i < split.length; i++) {
            if (split[i].equals("(")) {
                stack.push(new Pair(i,split[i]));
            }
            if (split[i].equals(")")) {
                if(stack.isEmpty()){
                    stack.push(new Pair(i,split[i]));
                    continue;
                }
                if(!stack.peek().symbol.equals("(")){
                    stack.push(new Pair(i,split[i]));
                    continue;
                }
                if (stack.peek().symbol.equals("(")) {
                    stack.pop();
                }

            }
        }
        while (!stack.isEmpty()){
            Pair pop = stack.pop();
            stringBuilder.deleteCharAt(pop.index);
        }

        return stringBuilder.toString();
    }
}

class Pair {
    public int index;
    public String symbol;

    public Pair(int index, String symbol) {
        this.index = index;
        this.symbol = symbol;
    }
}