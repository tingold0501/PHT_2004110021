package com.tinph2004110021.tuan08;

public class TreeDemo 
{
    NodeDemo root;
    
    public void insert(NodeDemo node, int value)
    {
        if(value < node.value)
        {
           if(node.left != null)
           {
               insert(node.left, value);
           }
           else
           {
               System.out.println("Inserted: " + value + " To Left Of: " + node.value);
               node.left = new NodeDemo(value);
           }
        }
        else if( value > node.value)
        {
            if(node.right != null)
            {
                insert(node.right, value);
            }
            else
            {
                System.out.println("Inserted: " + value + " To Right Of: " + node.value);
                node.right = new NodeDemo(value);
            }
        }
    }
    public void traverseInOrder(NodeDemo node)
    {
        if(node != null)
        {
            traverseInOrder(node.left);
            System.out.println(" " + node.value);
            traverseInOrder(node.right);
        }
    }
    private NodeDemo delete_Recursive(NodeDemo root, int key)
    {
        if(root == null)
        return root;
        if(key < root.value)
        {
            root.left = delete_Recursive(root.left, key);
        }
        else if(key > root.value)
        {
            root.right = delete_Recursive(root.right, key);
        }
        else{
            if(root.left == null)
            {
                return root.right;
            }
            else if(root.left == null)
            {
                return root.left;
            }
            root.value = minValue(root.right);
            root.right = delete_Recursive(root.right, root.value);        }
        return root;
    }
    public void deleteKey(int key)
    {
        root = delete_Recursive(root, key);
    }
    private int minValue(NodeDemo root) {
        int minval = root.value;
        while(root.left != null)
        {
            minval = root.left.value;
            root = root.left;
        }
        return minval;
    }
    private NodeDemo insert_Recursive(NodeDemo root, int key)
    {
        if(root == null)
        {
            root = new NodeDemo(key);
            return root;
        }
        if(key < root.value)
        {
            root.left = insert_Recursive(root.left, key);
        }
        else if( key > root.value)
        {
            root.right = insert_Recursive(root.right, key);
        }
        return root;
    }
    public void insertTree(int key)
    {
        root = insert_Recursive(root, key);
    }
    public void inorder()
    {
        inorder_Recursive(root);
    }
    public void inorder_Recursive(NodeDemo root)
    {
        if(root != null)
        {
            inorder_Recursive(root.left);
            System.out.print(root.value + " ");
            inorder_Recursive(root.right);
        }
    }
    private NodeDemo search_Recursive(NodeDemo root, int key)
    {
        if(root == null || root.value == key)
        {
            return root;
        }
        if(root.value > key)
        {
            return search_Recursive(root.left, key);
        }
        return search_Recursive(root.right, key);
    }
    public boolean search(int key)
    {
        root = search_Recursive(root, key);
        if(root != null)
        {
            return true;
        }
        else
        {
            return false;
        }
    }
}