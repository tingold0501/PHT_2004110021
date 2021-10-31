package com.tinph2004110021.tuan08;

public class TreeTestDrive {
    public static void main(String[] args) {
        Tree tree = new Tree();
        tree.root = new Node(45); 
        tree.root.left = new Node(10); 
        tree.root.right = new Node(90); 
        tree.root.left.left = new Node(7); 
        tree.root.left.right = new Node(12); 
        System.out.println("BST => PreOrder Traversal:"); 
        tree.preOrder_traversal(); 
        System.out.println("BST => InOrder Traversal:"); 
        tree.inOrder_traversal(); 
        System.out.println("BST => PostOrder Traversal:"); 
        tree.postOrder_traversal(); 
    }
}
