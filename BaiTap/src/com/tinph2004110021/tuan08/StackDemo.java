package com.tinph2004110021.tuan08;

import java.util.Stack;

public class StackDemo {
    public static void main(String[] args) {
        Stack<String> stack = new Stack<>();
        stack.push("Huỳnh Tín");
        stack.push("Name");
        stack.push("item");
        System.out.println(stack);
        String poped = stack.pop();
        System.out.println("Lấy Từ Stack:"+ poped);
        String peeked = stack.peek();
        System.out.println("Lấy Từ Stack:"+ peeked);
    }
}
