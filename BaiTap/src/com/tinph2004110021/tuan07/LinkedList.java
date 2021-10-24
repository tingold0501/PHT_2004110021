package com.tinph2004110021.tuan07;

public class LinkedList {
    Node head = null;
    Node tail = null;
    int data;
    Node newNode = new Node(data);
    public LinkedList(){}

    void push(int data){
        if(head == null){
            head = newNode;
        }else{
            newNode.next = head;
            head = newNode;
        }
    }
    void add(int data){
        if(head == null){
            head = newNode;
            tail = newNode;
        }else{
            tail.next = newNode;
            tail = newNode;
        }
    }
    void removeFist(int data){
        if(head == null){
            System.out.println("Không Có Phần Tử Để Xoá!!!");
        }else{
            head = head.next;
        }
    }

    void removeLast(int data){
       Node p = head;
       while(p.next.next != null){
           p = p.next;
       }
       p.next = p.next.next; 
    }
    void print(){
        Node current = head;
        if(head == null){
            System.out.println("Danh sách rỗng!!!");
            return;
        }
        System.out.println("Các nút trong danh sách: ");
        while(current != null){
            System.out.println(current.data);
            current = current.next;
        }
    }

    void find(){
       
    }
        
}
