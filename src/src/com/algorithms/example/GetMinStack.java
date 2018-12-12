package com.algorithms.example;

import java.util.Stack;

public class GetMinStack {
    /**
     * 实现一个特殊的栈，在实现栈的基本功能的基础上，再实现返回栈中的最小元素的操作。
     */

    private Stack<Integer> normStack;
    private Stack<Integer> minStack;

    public GetMinStack() {
        normStack = new Stack<>();
        minStack = new Stack<>();
    }

    public void push(int intPush) {
        normStack.push(intPush);
        if (!minStack.isEmpty()) {
            if(minStack.peek()<intPush){
                minStack.push(minStack.peek());
            } else {
                minStack.push(intPush);
            }
        } else {
            minStack.push(intPush);
        }
    }

    public int pop() {
        minStack.pop();
        return normStack.pop();
    }

    public int getMin() {
        int res = minStack.pop();
        minStack.push(res);
        return res;
    }


    public static void main(String[] args) {
        GetMinStack stack = new GetMinStack();
        stack.push(4);
        stack.push(2);
        stack.push(3);
        stack.push(3);
        stack.push(1);
        System.out.println(stack.getMin());
        stack.pop();
        System.out.println(stack.getMin());
    }


}

