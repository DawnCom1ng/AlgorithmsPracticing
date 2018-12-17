package com.algorithms.example;

import javax.print.attribute.standard.NumberOfDocuments;

public class PrintSameData {

    public static class Node{
        private int data;
        public Node next;

        public Node(int data) {
            this.data = data;
        }

        public int getData() {
            return this.data;
        }

    }

    public static void printSame(Node head1, Node head2) {
        while (head1 != null && head2 != null) {
            if (head1.getData()<head2.getData()) {
                head1 = head1.next;
            } else if(head1.getData() > head2.getData()) {
                head2 = head2.next;
            } else  {
                System.out.print(head1.getData() + " ");
                head1 = head1.next;
                head2 = head2.next;
            }
        }
        System.out.println();

    }

    public static void printCommomPart(Node head1, Node head2) {
        while(head1 != null && head2 != null) {
            if (head1.getData()<head2.getData()) {
                head1 = head1.next;
            } else if(head1.getData() > head2.getData()) {
                head2 = head2.next;
            } else  {
                Node[] a = printCommom(head1,head2);
                head1 = a[0];
                head2 = a[1];
            }
        }
    }

    public static Node[] printCommom(Node head1, Node head2) {
        while (head1!=null && head2!=null && head1.getData() == head2.getData()) {
            System.out.print(head1.getData());
            head1 = head1.next;
            head2 = head2.next;
        }

        return new Node[] {head1,head2};

    }

    public static void printLinkedList(Node node) {
        System.out.print("Linked List: ");
        while (node != null) {
            System.out.print(node.getData() + " ");
            node = node.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Node node1 = new Node(2);
        node1.next = new Node(3);
        node1.next.next = new Node(6);
        node1.next.next.next = new Node(7);
        node1.next.next.next.next = new Node(8);


        Node node2 = new Node(1);
        node2.next = new Node(2);
        node2.next.next = new Node(3);
        node2.next.next.next = new Node(6);
        node2.next.next.next.next = new Node(8);

        printLinkedList(node1);
        printLinkedList(node2);
        printSame(node1, node2);
        printCommomPart(node1, node2);

    }

}
