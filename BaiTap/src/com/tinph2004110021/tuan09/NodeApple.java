package com.tinph2004110021.tuan09;

public class NodeApple {
   public Apple apple;
   public NodeApple next;
    public NodeApple(Apple apple)
    {
        this.apple = apple;
        this.next = null;
    }
    public void displayData()
    {
        apple.displayApple();
    }
    public boolean id(int id)
    {
        return this.apple.getId() == id;
    }
    public boolean color(String namecl)
    {
        return this.apple.getColor().equals(namecl);
    }
    public boolean weight(float w)
    {
        return this.apple.getWeight() == w;
    }
}
