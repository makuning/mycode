package com.makun.javase.collection.link;

// 自写单链表测试程序
public class LinkTest01 {
    public static void main(String[] args) {
        // 新建一个Link集合
        Link link = new Link();
        // 添加数据
        link.add(1);
        link.add(2);
        link.add(3);
        link.add(4);
        link.add(5);
        // 输出size
        System.out.println(link.size());
        // 循环答应数据
        Node node = link.getHead();
        System.out.println(node);
        for (int i = 0; i < link.size() - 1; i++) {
            System.out.println(node.getNext());
            node = node.getNext();
        }
    }
}
