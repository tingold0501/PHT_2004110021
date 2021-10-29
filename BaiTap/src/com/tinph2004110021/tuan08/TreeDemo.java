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
}