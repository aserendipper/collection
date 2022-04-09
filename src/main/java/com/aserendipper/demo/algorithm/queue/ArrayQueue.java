package com.aserendipper.demo.algorithm.queue;

/**
 * 数组实现的队列
 */
public class ArrayQueue {
    //数据
    private int[] data;
    //头
    private int head = 0;
    //尾
    private int tail = 0;
    //数组长度
    private int n = 0;

    public ArrayQueue(int cap) {
        this.data = new int[cap];
        n = cap;
    }

    public void push(int m) {
        if (tail == n) {
            //如果队列满时，把所有数据往前移动
            if (head == 0) {
                return;
            } else {
                for (int i = head; i < tail; i++) {
                    data[i - head] = data[i];
                    data[i] = 0;
                }
            }
            tail = tail - head;
            head = 0;
        }
        data[tail++] = m;
    }

    public int pop() {
        if (isEmpty()) {
            return -1;
        }
        int result = data[head];
        data[head++] = 0;
        return result;
    }

    public boolean isEmpty() {
        return head == tail;
    }
}
