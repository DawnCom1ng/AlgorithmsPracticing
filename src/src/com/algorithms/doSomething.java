package com.algorithms;

import java.util.ArrayList;

public class doSomething {
    public static void main(String[] args) {
        ArrayList<String> s = new ArrayList<>(10);
        for (int i = 0; i < 5; i++) {
            s.add("b");
        }
        System.out.println(s);
        for (int i = 0; i < 5; i++) {
            s.set(i, "a");
        }
        System.out.println(s);
    }
}

