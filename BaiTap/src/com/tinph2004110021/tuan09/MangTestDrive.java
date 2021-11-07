package com.tinph2004110021.tuan09;

public class MangTestDrive {
    static int[]arr, index;
    public static void main(String[] args) {
        int[] a = {10,9,7,101,23,44,12,78,34,23};
        for(int i = 0; i < 10; i++)
        {
            int temp = a[i];
            int j = i -1;
            while(j >= 0 && temp <= a[j])
            {
                a[j + 1] = a[j];
                j = j - 1;
            }
            a[j+1] = temp;
        }
        System.out.println("Printing Sort Elements...");
        for(int i = 0; i< 10;i++)
        {
            System.out.println(a[i]);
        }
        // ==================================================
        Mang mang = new Mang();
        int[] arr = {2,3,4,10,40};
        int n = arr.length;
        int x = 10;
        int result = mang.binarySearch(arr, x);
        if(result == -1)
            System.out.println("Element Not Present");
        else
            System.out.println("Element Found At" + " Index " + result);
    }
}
