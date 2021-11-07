package com.tinph2004110021.tuan09;


public class LinkedListApple {
    private int size;
    private NodeApple head, tail;
    Apple apple = new Apple();
    public LinkedListApple(){
        Apple.autoId = 1;
        this.size = 0;
        this.head = null;
        this.tail = null;
    }
    public int size()
    {
        return this.size;
    }
    public void insertAt(NodeApple nApple, int position)
    {
        if(position < 1)
        { 
            nApple.next = this.head;
            this.head = nApple;
            
            if(this.head == null)
            {
                this.tail = nApple;
            }
            this.size++;
            return;
        }
        if(position >= this.size)
        {
            if(this.tail != null)
            {
                this.tail.next = nApple;
            }
            this.tail = nApple;
            if(this.head == null)
            {
                this.head = nApple;
            }
            this.size++;
            return;
        }
    }
    public void searchAp(int id)
    {
        apple.display();
        NodeApple nApple = searchId(id);
       if(nApple != null)
       {
           nApple.apple.displayApple();
       }
       else{
           System.out.println("Id Không Hợp Lệ!!!");
       }
    }
    public void selectionSort(NodeApple nApple)
    {
        
    }
    private NodeApple searchId(int id)
    {
        NodeApple nApple = this.head;
        while(nApple != null)
        {
            if(nApple.id(id))
            {
                return nApple;
            }
            nApple = nApple.next;
        }
        return null;
    }
    public void searchCl(String name)
    {
        apple.display();
        NodeApple nApple = searchColor(name);
       if(nApple != null)
       {
            nApple.apple.displayApple();
       }
       else{
           System.out.println("Màu Không Hợp Lệ!!!");
       }
    }
    private NodeApple searchColor(String name)
    {
        NodeApple nApple = this.head;
        while(nApple != null)
        {
            if(nApple.color(name))
            {
                return nApple;
            }
            nApple = nApple.next;
        }
        return null;
    }
    public void searchW(float W)
    {
        apple.display();
        NodeApple nApple = searchWeight(W);
       if(nApple != null)
       { 
            nApple.apple.displayApple();
       }
       else{
           System.out.println("Màu Không Hợp Lệ!!!");
       }
    }
    private NodeApple searchWeight(float w)
    {
        NodeApple nApple = this.head;
        while(nApple != null)
        {
            if(nApple.weight(w))
            {
                return nApple;
            }
            nApple = nApple.next;
        }
        return null;
    }
    // public NodeApple max(NodeApple nApple)
    // {
    //     float m =  0;
    //     NodeApple nApple2 = null;
    //     NodeApple nApple3 = this.head;
    //     while(nApple3 != null)
    //     {
    //         if(nApple3.apple.Weight > m)
    //         {
    //             m = nApple3.apple.Weight;
    //         }
    //     }
    //     return nApple3;
    // }
    public void showData()
    {
        NodeApple nApple = head;
        while(nApple != null)
        {
            nApple.displayData();
            nApple = nApple.next;
        }
    }
}
