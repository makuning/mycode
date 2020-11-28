package com.makun.javase.collection.link;

// 自写单链表的节点
public class Node {
    // 有索引
    private int index;
    // 有存储的数据
    private Object data;
    // 有下一个节点的内存地址
    private Node next;
    // 有参数的构造方法
    public Node (Object data,Node next) {
        this.data = data;
        this.next = next;
    }

    // 重写toString

    @Override
    public String toString() {
        return "Node{" +
                "index=" + index +
                ", data=" + data +
                ", next=" + next +
                '}';
    }


    // set、get方法

    public Object getData() {
        return data;
    }

    public Node getNext() {
        return next;
    }

    public int getIndex() {
        return index;
    }

    public void setData(Object data) {
        this.data = data;
    }

    public void setNext(Node next) {
        this.next = next;
    }

    public void setIndex(int index) {
        this.index = index;
    }
}
