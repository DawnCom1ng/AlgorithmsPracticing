package com.algorithms.example;

import java.util.LinkedList;
import java.util.Queue;

public class TwoQueuetoStack {

    private Queue<Integer> queuePush;
    private Queue<Integer> queueHelp;

    public TwoQueuetoStack() {
        queueHelp = new LinkedList<>();
        queuePush = new LinkedList<>();
    }

    public void push(int intPush) {
        queuePush.add(intPush);
    }

    public int peek() {
        if (queuePush.isEmpty()) {
            throw new RuntimeException("Stack is empty");
        }
        while (queuePush.size() > 1) {
            queueHelp.add(queuePush.poll());
        }
        int res = queuePush.poll();
        queueHelp.add(res);
        swap();
        return res;
    }

    public int pop() {
        if (queuePush.isEmpty()) {
            throw new RuntimeException("Stack is empty");
        }
        while (queuePush.size() > 1){
            queueHelp.add(queuePush.poll());
        }
        int res = queuePush.poll();
        swap();
        return res;
    }


    public void swap() {
        Queue<Integer> tmp = queuePush;
        queuePush = queueHelp;
        queueHelp = tmp;

    }

    public static void main (String[] args) {
        TwoQueuetoStack stack = new TwoQueuetoStack();
        stack.push(1);
        stack.push(2);
        stack.push(3);
        System.out.println(stack.pop());
        System.out.println(stack.peek());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
    }

}
