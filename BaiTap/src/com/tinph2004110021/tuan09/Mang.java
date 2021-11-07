package com.tinph2004110021.tuan09;

import java.util.Scanner;

public class Mang {
    int[] arr;
    Scanner sc = new Scanner(System.in);
    public void input(int[] arr)
    {
        System.out.println("Input Sum Number Arrays");
        int index = sc.nextInt();
        for(int i = 0; i < index; i++)
        {
            System.out.printf("Input Number{Arr:}:");
            arr[i] = sc.nextInt();
        }
    }
    public void display(int[] arr)
    {
        for(int i = 0; i < arr.length; i++)
        {
            System.out.println(arr[i]);
        }
    }
    public void selectionSort(int[] arr)
    {
        for(int i = 0; i < arr.length - 1; i++)
        {
            int index = i;
            for(int j = i + 1; j < arr.length;j++)
            {
                if(arr[j] < arr[index])
                {
                    index = j;
                }
            }
            int smallerNumber = arr[index];
            arr[index] = arr[i];
            arr[i] = smallerNumber;
        }
    }
    public void bubbleSort(int[] arr)
    {
        int n = arr.length;
        int temp = 0;
        for(int i = 0; i < n; i++)
        {
            for(int j = 1; j < (n-1);j++)
            {
                if(arr[j-1] > arr[j])
                {
                    temp = arr[j-1];
                    arr[j-1] = arr[j];
                    arr[j] = temp;
                }
            }
        }
    }
    public void sort(int[] arr)
    {
        int n = arr.length;
        for(int i = 1; i < n; i++)
        {
            int key = arr[i];
            int j = i - 1;
            while(j >= 0 && arr[j] > key)
            {
                arr[j + 1] = arr[j];
                j = j - 1;
            }
            arr[j + 1] = key;
        }
    }
    public int search(int[] arr, int x)
    {
        int n = arr.length;
        for(int i = 0; i < n; i++)
        {
            if(arr[i] == x)
            return i;
        }
        return -1;
    }
    public int binarySearch(int[] arr, int x)
    {
        int l = 0, r = arr.length;
        while(l <= r)
        {
            int m = l + (r -l)/2;
            if(arr[m] == x)
            return m;
            if(arr[m] < x)
            l = m + 1;
            else
            r = m - 1;
        }
        return -1;
    }
}
