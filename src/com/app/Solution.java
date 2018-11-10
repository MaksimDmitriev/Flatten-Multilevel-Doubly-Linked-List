package com.app;

public class Solution {

    static class Node {
        public int val;
        public Node prev;
        public Node next;
        public Node child;

        public Node(int _val) {
            val = _val;
        }

        @Override
        public String toString() {
            return Integer.toString(val);
        }
    }


    public Node flatten(Node head) {
        if (head == null) {
            return null;
        }
        flattenInternal(head);
        return head;
    }

    private Node flattenInternal(Node node) {
        Node prev = node;
        node = node.next;
        while (node != null) {
            if (node.child == null) {
                prev = node;
                node = node.next;
            } else {
                Node next = node.next;
                Node last = flattenInternal(node.child);
                node.next = node.child;
                node.child = null;
                last.next = next;

            }
        }
        return prev;
    }
}
