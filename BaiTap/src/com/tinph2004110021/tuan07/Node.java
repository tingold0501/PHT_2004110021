package com.tinph2004110021.tuan07;

public class Node {
    int data; 
    int position;
   
    Node next;
    
    public Node(){}

    public Node(int d){
        data = d;

    }
    public Node(int d, Node n){
        data = d;
        next = n;
    }
}
