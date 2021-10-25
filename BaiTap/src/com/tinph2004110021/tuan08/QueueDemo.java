package com.tinph2004110021.tuan08;

import java.util.LinkedList;
import java.util.Queue;

public class QueueDemo {
    public static void main(String[] args) {
        Queue <Integer> queue = new LinkedList<>();
        queue.add(5);
        queue.add(1);
        queue.add(20);
        queue.add(2020);
        System.out.println("Phần Tử Trong Queue:" + queue);
        int queued = queue.remove();
        System.out.println("Lấy Phần Tử Ở Queue:" + queued);
        int queuePeek = queue.peek();
        System.out.println("Thăm Phần Tử Queue:" + queuePeek);
        System.out.println("Phần Còn Lại Của Queue:" + queue);
    }
}
// Left Right Root: 3,22,16,37,99,45,23
// Right RooT Left: 37,45,99,23,3,16,22
// Root Right Left: 23,37,45,99,3,16,22
// Root Left Right: 23,16,3,22,45,37,99 

// Left Root Right: 4,2,5,1,3
// Root Left Right: 1,2,4,5,3
// Right Root Left: 3,1,5,2,4
// Right Left Root: 3,5,4,2,1

//Root Left Right: A,B,D,E,C,F,G
//Root Right Left: A,C,G,F,B,E,D
//Left Right Root: D,E,B,F,G,C,A
//Left Root Right: D,B,E,A,F,C,G
//Right Left Root: G,F,C,E,D,B,A
//Right Root Left: G,C,F,A,E,B,D