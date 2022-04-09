package com.aserendipper.demo.algorithm.queue;

/**
 * 链表实现的队列
 */
public class ListQueue {
    private Node head;
    private Node tail;
    private int len;

    public ListQueue(int value) {
        head = new Node(value);
        tail = head;
        len = 1;
    }
    public void push(int value) {
        Node next = new Node(value);
        //当head为null时，意味着所有已经pop完了，所以需要重新初始化
        if (head == null) {
            head = next;
            tail = head;
            len = 1;
        } else {
            tail.setNext(next);
            tail = next;
            ++len;
        }
    }

    public int pop() {
        if (isEmpty()) {
            return -1;
        }
        //如果pop最后一个元素时，head是会为null的，再push时需要初始化
        Node result = head;
        head = head.getNext();
        --len;
        return result.getValue();
    }

    public boolean isEmpty() {
        return len == 0;
    }

    static class Node {
        private final int value;
        private Node next;

        public Node(int value) {
            this.value = value;
        }

        public int getValue() {
            return value;
        }

        public Node getNext() {
            return next;
        }

        public void setNext(Node next) {
            this.next = next;
        }
    }
}
