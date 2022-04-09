package com.aserendipper.demo.algorithm.queue;

/**
 * 循环队列
 */
public class CycleArrayQueue {
    //数据
    private int[] data;
    //头
    private int head = 0;
    //尾
    private int tail = 0;
    //数组长度
    private int n = 0;

    public CycleArrayQueue(int cap) {
        this.data = new int[cap];
        n = cap;
    }

    public void push(int m) {
        //牺牲一个存储单元
        if ((tail + 1) % n == head) {
            //如果队列满时，直接返回或者扩容
            return;
        }
        data[tail] = m;
        tail = (tail + 1) % n;
    }

    public int pop() {
        if (isEmpty()) {
            return -1;
        }
        int m = data[head];
        head = (head + 1) % n;
        return m;
    }

    public boolean isEmpty() {
        return head == tail;
    }
}
