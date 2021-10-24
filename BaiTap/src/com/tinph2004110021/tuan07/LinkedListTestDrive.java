package com.tinph2004110021.tuan07;

public class LinkedListTestDrive {
    public static void main(String[] args) {
        LinkedList myLinkedList = new LinkedList();
        myLinkedList.add(4);
        myLinkedList.add(3);
        myLinkedList.add(8);
        myLinkedList.push(1);
        myLinkedList.removeFist(1);
        myLinkedList.removeLast(8);

        myLinkedList.print();
    }
}
