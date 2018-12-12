package com.algorithms.example;

public class ArrtoStack {


    private int[] stack;

    private int size;

    private int top;


    public ArrtoStack(int size) {
        this.size = size;
        stack = new int[size];
        this.top = 0;
    }

    public int[] getStack(){
        return stack;
    }

    public int getSize(){
        return size;
    }

    public int getTop(){
        return top;
    }

    public boolean isFull () {
        return top<size ? false : true;
    }

    public boolean isEmpty() {
        return top>0 ? false : true;
    }

    public int pop(){
        if(isEmpty()){
            System.out.println("the stack is empty!return 0!");
            return 0;
        } else {
            return stack[--top];
        }
    }

    public boolean append(int num) {
        if(isFull()){
            System.out.println("the Stack is full!");
            return false;
        } else {
            stack[top++] = num;
            return  true;
        }
    }

    public int peek() {
        return this.stack[top-1];
    }

    public static void main (String[] args) {
        ArrtoStack stack = new ArrtoStack(5);
        stack.append(1);
        stack.append(2);
        stack.append(3);
        stack.append(4);
        stack.append(5);
        stack.append(6);
        System.out.println(stack.getTop());
        System.out.println(stack.isFull());
        System.out.println(stack.isEmpty());
        stack.pop();
        stack.pop();
        System.out.println(stack.getTop());
        System.out.println(stack.isFull());
        System.out.println(stack.isEmpty());
        stack.pop();
        System.out.println(stack.peek());
        //stack.pop();
        //stack.pop();
        stack.pop();
        for(int i = 0;i<stack.getTop();i++){
            System.out.print(stack.getStack()[i]);
        }

    }

}
