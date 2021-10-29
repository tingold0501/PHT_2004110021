package com.tinph2004110021.tuan08;

public class TreeDemoTestDrive {
    public static void main(String[] args) {
       TreeDemo treeDemo = new TreeDemo();
       NodeDemo root = new NodeDemo(5);
       System.out.println("Root:" + root.value);
       treeDemo.insert(root, 4);
       treeDemo.insert(root, 6);
       treeDemo.insert(root, 3);
       treeDemo.insert(root, 7);
       treeDemo.insert(root, 2);
    //    treeDemo.traverseInOrder(root);
    }
}
