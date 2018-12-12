package com.algorithms.example;

public class ArrtoQueue {

    private int[] queue;

    private int size;

    private int in;

    private int out;

    private int s;

    public ArrtoQueue(int size) {
        this.size = size;
        this.queue = new int[size];
        this.in = 0;
        this.out = 0;
        this.s = 0;
    }

    public int getSize() {
        return this.size;
    }

    public int[] getQueue() {
        return this.queue;
    }

    public int getIn() {
        return in;
    }
    public int getOut() {
        return out;
    }

    public int getS() {
        return s;
    }

    public boolean isFull() {
        return s<size ? false : true;
    }

    public boolean isEmpty() {
        return s>0 ? false : true;
    }


    public int outQueue() {
        if (isEmpty()) {
            System.out.println("the queue is empty!return 0!");
            return 0;
        } else {
            int o = this.queue[out];
            out = (out+1)%size;
            s--;
            return o;
        }
    }


    public boolean inQueue(int num) {
        if(isFull()) {
            System.out.println("the queue is full");
            return false;
        } else {
            this.queue[in] = num;
            in = (in+1)%size;
            s++;
            return true;
        }
    }

    public int peek() {
        return this.queue[out];
    }

    public static void main(String[] args) {
        ArrtoQueue queue = new ArrtoQueue(6);
        System.out.println(queue.getS());
        System.out.println(queue.isEmpty());
        System.out.println(queue.isFull());
        queue.inQueue(1);
        queue.inQueue(2);
        System.out.println(queue.outQueue());
        queue.inQueue(3);
        queue.inQueue(4);
        queue.inQueue(5);
        queue.inQueue(6);
        queue.inQueue(7);
        System.out.println(queue.peek());
        System.out.println(queue.isFull());
        System.out.println(queue.getS());
        queue.inQueue(8);
        System.out.println(queue.outQueue());
        System.out.println(queue.getS());
        System.out.println(queue.inQueue(8));
        System.out.println(queue.peek());
    }
}
