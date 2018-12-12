package com.algorithms.example;

import java.util.Stack;

public class TwoStacktoQueue {

    private Stack<Integer> stackPush;
    private Stack<Integer> stackPop;

    public TwoStacktoQueue() {
        stackPop = new Stack<>();
        stackPush = new Stack<>();
    }

    public void push(int intPush) {
        stackPush.push(intPush);
    }

    public int pop() {
        if(stackPush.isEmpty() && stackPop.isEmpty()){
            throw new RuntimeException("Queue is empty!");
        } else if (stackPop.isEmpty()) {
            while(!stackPush.isEmpty()) {
                stackPop.add(stackPush.pop());
            }
        }
        int res = stackPop.pop();
        return res;
    }

    public int peek() {
        if(stackPush.isEmpty() && stackPop.isEmpty()){
            throw new RuntimeException("Queue is empty!");
        } else if (stackPop.isEmpty()) {
            while(!stackPush.isEmpty()) {
                stackPop.add(stackPush.pop());
            }
        }
        int res = stackPop.pop();
        stackPop.push(res);
        return res;
    }

    public static void main(String[] args) {
        TwoStacktoQueue queue = new TwoStacktoQueue();
        queue.push(1);
        queue.push(2);
        queue.push(3);
        System.out.println(queue.pop());
        queue.push(4);
        System.out.println(queue.pop());
        queue.push(5);
        queue.push(6);
        System.out.println(queue.peek());
        System.out.println(queue.pop());
        System.out.println(queue.pop());
        System.out.println(queue.pop());
        System.out.println(queue.pop());

    }

}
