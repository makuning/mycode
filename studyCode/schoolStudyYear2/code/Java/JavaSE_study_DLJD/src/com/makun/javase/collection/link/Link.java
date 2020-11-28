package com.makun.javase.collection.link;

// 自写单链表集合
public class Link {
    // 1、头节点Node
    private Node head;

    // 2、添加方法
    public void add (Object data) {
        if (this.getHead() == null) {
            // 如果head为空，说明还没有添加过数据，则将数据添加到head中
            this.head = new Node(data,null);
        } else {
            // 如果head不为空说明已经有数据了，所以先添加一个节点，
            // 再找到之前最后的节点，更改它的next
            this.lastNode(this.getHead()).setNext(new Node(data,null));
        }

        // size加1
        this.size++;
        // 设置下标
        this.lastNode(this.getHead()).setIndex(this.size - 1);
    }

    // 3、删除方法
    public void remove (Object data) {

    }
    public void remove (int index) {

    }

    // 4、修改方法
    public void alter (Object data) {

    }
    public void alter (int index) {

    }

    // 5、查找方法1（通过数据返回索引）
    public int seek (Object data) {
        return 1;
    }

    // 5、查找方法2（通过索引返回数据）
    public Object seek (int index) {
        return new Object();
    }

    // 6、size属性
    private int size = 0;

    // 7、size() 方法
    public int size () {
        return this.size;
    }

    // 8、lastNode() 递归方法（找到单链表中最后一个节点）
    private Node lastNode(Node head) {
        if (head.getNext() == null) {
            return head;
        }
        return lastNode(head.getNext());
    }

    // 9、构造方法
    public Link () {

    }


    // set、get方法

    public Node getHead() {
        return head;
    }

    public void setHead(Node head) {
        this.head = head;
    }
}
