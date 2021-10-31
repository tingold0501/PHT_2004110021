package com.tinph2004110021.tuan08;

public class TreeDemoTestDrive {
    public static void main(String[] args) {
       TreeDemo treeDemo = new TreeDemo();

        treeDemo.insertTree(7);
        treeDemo.insertTree(3);
        treeDemo.insertTree(6);
        treeDemo.insertTree(1);
        treeDemo.insertTree(2);
        treeDemo.insertTree(8);
        System.out.println("The BST Created with input data(Left-root-right):"); 
        treeDemo.inorder();
        System.out.println("\nThe BST after Delete 1(leaf node):"); 
        treeDemo.deleteKey(1);
        treeDemo.inorder();
        System.out.println("\nThe BST after Delete 8 (node with 1 child):");
        treeDemo.deleteKey(8);
        treeDemo.inorder();
        System.out.println("\nThe BST after Delete 6 (Node with two children):");
        treeDemo.deleteKey(6);
        treeDemo.inorder();
        boolean ret_val = treeDemo.search(2);
        System.out.println("\nKey 2 found in BST:" + ret_val );
        ret_val = treeDemo.search (12);
        System.out.println("\nKey 12 found in BST:" + ret_val );
    }
}
