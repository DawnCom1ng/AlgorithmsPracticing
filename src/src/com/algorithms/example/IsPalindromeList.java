package com.algorithms.example;

import java.util.Stack;

public class IsPalindromeList {

    public static class Node {
        public int data;
        public Node next;

        public Node(int data) {
            this.data = data;
        }
    }

    public static boolean isPalindrome1(Node head) {

        /**
         * need n extra space
         */

        Stack<Node> stack = new Stack<Node>();
        Node cur = head;
        while (cur != null) {
            stack.push(cur);
            cur = cur.next;
        }
        while (head != null) {
            if (head.data != stack.peek().data) {
                return false;
            }
            stack.pop();
            head = head.next;
        }
        return true;
    }

    public static boolean isPalindrome2(Node head) {
        /**
         * need n/2 extra space
         */

        Stack<Node> stack =  new Stack<Node>();
        Node node1 = head;
        Node node2 = head;
        /*while (node2.next != null) {


            if (node2.next.next == null) {
                node2 = node2.next;
                break;
            }
            node2 = node2.next.next;
            node1 = node1.next;
        }*/
        if (head == null) {
            return true;
        }

        while (node2.next != null) {


            if (node2.next.next == null) {
                node2 = node2.next;
                node1 = node1.next;
                break;
            }
            node2 = node2.next.next;
            node1 = node1.next;
        }


        while (node1 != null) {
            stack.push(node1);
            node1 = node1.next;
        }

        while (!stack.isEmpty()) {
            if (head.data != stack.pop().data) {
                return false;
            }
            head = head.next;

        }
        return true;


    }


    public static boolean isPalindrome3(Node head) {
        Node node1 = head;
        Node node2 = head;
        Node node3;
        if (head == null) {
            return true;
        }
        while (node2.next != null) {
            if (node2.next.next == null) {
                node2 = node2.next;
                break;
            }
            node2 = node2.next.next;
            node1 = node1.next;
        }

        node2 = node1.next;
        node1.next = null;
        while (node2 != null) {
            node3 = node2.next;
            node2.next=node1;
            node1 = node2;
            node2 = node3;
        }
        node3 = node1;

        boolean res = true;
        while (head != null) {
            if (head.data != node1.data) {
                res = false;
            }
            head = head.next;
            node1 = node1.next;
        }

        node2 = node3.next;
        node3.next = null;


        while (node2!=null){
            node1 = node2.next;
            node2.next = node3;
            node3 = node2;
            node2 = node1;

        }

        return res;


    }

    public static void printLinkedList(Node head) {
        System.out.print("LinkList:");
        while (head != null){
            System.out.print(head.data + ">>>");
            head = head.next;
        }
        System.out.println();
    }



    public static void main(String[] args) {
        /*Node a = new Node(1);
        a.next = new Node(2);
        a.next.next = new Node(3);
        a.next.next.next = new Node(2);
        a.next.next.next.next = new Node(1);
        a.next.next.next.next.next = new Node(1);
        System.out.println(isPalindrome2(a));*/



        Node head = null;
        printLinkedList(head);
        System.out.print(isPalindrome1(head) + " | ");
        System.out.print(isPalindrome2(head) + " | ");
        System.out.println(isPalindrome3(head) + " | ");
        printLinkedList(head);
        System.out.println("=========================");

        head = new Node(1);
        printLinkedList(head);
        System.out.print(isPalindrome1(head) + " | ");
        System.out.print(isPalindrome2(head) + " | ");
        System.out.println(isPalindrome3(head) + " | ");
        printLinkedList(head);
        System.out.println("=========================");

        head = new Node(1);
        head.next = new Node(2);
        printLinkedList(head);
        System.out.print(isPalindrome1(head) + " | ");
        System.out.print(isPalindrome2(head) + " | ");
        System.out.println(isPalindrome3(head) + " | ");
        printLinkedList(head);
        System.out.println("=========================");

        head = new Node(1);
        head.next = new Node(1);
        printLinkedList(head);
        System.out.print(isPalindrome1(head) + " | ");
        System.out.print(isPalindrome2(head) + " | ");
        System.out.println(isPalindrome3(head) + " | ");
        printLinkedList(head);
        System.out.println("=========================");

        head = new Node(1);
        head.next = new Node(2);
        head.next.next = new Node(3);
        printLinkedList(head);
        System.out.print(isPalindrome1(head) + " | ");
        System.out.print(isPalindrome2(head) + " | ");
        System.out.println(isPalindrome3(head) + " | ");
        printLinkedList(head);
        System.out.println("=========================");

        head = new Node(1);
        head.next = new Node(2);
        head.next.next = new Node(1);
        printLinkedList(head);
        System.out.print(isPalindrome1(head) + " | ");
        System.out.print(isPalindrome2(head) + " | ");
        System.out.println(isPalindrome3(head) + " | ");
        printLinkedList(head);
        System.out.println("=========================");

        head = new Node(1);
        head.next = new Node(2);
        head.next.next = new Node(3);
        head.next.next.next = new Node(1);
        printLinkedList(head);
        System.out.print(isPalindrome1(head) + " | ");
        System.out.print(isPalindrome2(head) + " | ");
        System.out.println(isPalindrome3(head) + " | ");
        printLinkedList(head);
        System.out.println("=========================");

        head = new Node(1);
        head.next = new Node(2);
        head.next.next = new Node(2);
        head.next.next.next = new Node(1);
        printLinkedList(head);
        System.out.print(isPalindrome1(head) + " | ");
        System.out.print(isPalindrome2(head) + " | ");
        System.out.println(isPalindrome3(head) + " | ");
        printLinkedList(head);
        System.out.println("=========================");

        head = new Node(1);
        head.next = new Node(2);
        head.next.next = new Node(3);
        head.next.next.next = new Node(2);
        head.next.next.next.next = new Node(1);
        printLinkedList(head);
        System.out.print(isPalindrome1(head) + " | ");
        System.out.print(isPalindrome2(head) + " | ");
        System.out.println(isPalindrome3(head) + " | ");
        printLinkedList(head);
        System.out.println("=========================");

        head = new Node(1);
        head.next = new Node(2);
        head.next.next = new Node(3);
        head.next.next.next = new Node(3);
        head.next.next.next.next = new Node(2);
        head.next.next.next.next.next = new Node(1);
        printLinkedList(head);
        System.out.print(isPalindrome1(head) + " | ");
        System.out.print(isPalindrome2(head) + " | ");
        System.out.println(isPalindrome3(head) + " | ");
        printLinkedList(head);
        System.out.println("=========================");

        head = new Node(1);
        head.next = new Node(2);
        head.next.next = new Node(3);
        head.next.next.next = new Node(3);
        head.next.next.next.next = new Node(2);
        head.next.next.next.next.next = new Node(2);
        printLinkedList(head);
        System.out.print(isPalindrome1(head) + " | ");
        System.out.print(isPalindrome2(head) + " | ");
        System.out.println(isPalindrome3(head) + " | ");
        printLinkedList(head);
        System.out.println("=========================");

    }

}
