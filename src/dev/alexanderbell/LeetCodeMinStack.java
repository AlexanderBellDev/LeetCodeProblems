package dev.alexanderbell;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Stack;

public class LeetCodeMinStack {
    public static void main(String[] args) {
        MinStack minStack = new MinStack();
        minStack.push(-2);
        minStack.push(0);
        minStack.push(-1);
        int min = minStack.getMin();
        minStack.top();
        minStack.pop();
        int min1 = minStack.getMin();
    }
}
class MinStack {
    Stack<Integer[]> integers;
    /** initialize your data structure here. */
    public MinStack() {
       integers = new Stack<>();
    }

    public void push(int x) {
        if(integers.isEmpty()){
            integers.push(new Integer[]{x,x});
        }else {
            int currentMin = integers.peek()[1];
            if(x < currentMin){
                currentMin = x;
            }
            integers.push(new Integer[]{x,currentMin});
        }

    }

    public void pop() {
      integers.pop();
    }

    public int top() {
       return integers.get(integers.size()-1)[0];
    }

    public int getMin() {
        return integers.peek()[1];
    }
}