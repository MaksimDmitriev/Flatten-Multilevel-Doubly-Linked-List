package com.app;

public class Main {

    public static void main(String[] args) {
        Solution solution = new Solution();

        Solution.Node head = new Solution.Node(1);
        head.next = new Solution.Node(2);
        head.next.prev = head; // 1<-2

        head.next.next = new Solution.Node(3);
        head.next.next.prev = head.next; // 2<-3

        head.next.next.next = new Solution.Node(4);
        head.next.next.next.prev = head.next.next; // 3<-4

        head.next.next.next.next = new Solution.Node(5);
        head.next.next.next.next.prev = head.next.next.next; // 4<-5

        head.next.next.next.next.next = new Solution.Node(6);
        head.next.next.next.next.next.prev = head.next.next.next.next; // 5<-6

        head.next.next.child = new Solution.Node(7);
        head.next.next.child.next = new Solution.Node(8);
        head.next.next.child.next.prev = head.next.next.child; // 7<-8

        head.next.next.child.next.child = new Solution.Node(11);
        head.next.next.child.next.child.next = new Solution.Node(12);
        head.next.next.child.next.child.next.prev = head.next.next.child.next.child; // 11<-12

        head.next.next.child.next.next = new Solution.Node(9);
        head.next.next.child.next.next.prev = head.next.next.child.next; // 8<-9

        head.next.next.child.next.next.next = new Solution.Node(10);
        head.next.next.child.next.next.next.prev = head.next.next.child.next.next; // 9<-10

        solution.flatten(head);
    }
}
