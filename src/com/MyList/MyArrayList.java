package com.MyList;

import java.util.List;
import java.util.Scanner;

public class MyArrayList{
    private Object[] arr;
    int size;

    MyArrayList(){
        this.arr = new Object[2];
        this.size = 0;
    }

    public void add(E element){
        if(size == arr.length)
        {
            InBuff();
        }

        arr[size++] = element;
    }

    private void InBuff(){
        Object[] arrNew = new Object[arr.length*2];

        for (int i = 0; i < arr.length; i++)
        {
            arrNew[i] = arr[i];
        }

        arr = arrNew;
    }

    public Object get(int index){
        checkInd(index);
        return arr[index];
    }


    public void remove(int index){
        checkInd(index);
        for(int i=index+1; i<size; i++){
            arr[i-1]= arr[i];
        }
        size-- ;
    }

    private void checkInd(int index) {
        if (index < 0 || index>size)
        {
            throw new IndexOutOfBoundsException("No index");
        }
    }

    public int size(){
        return size;
    }

    public void clear(){
        this.arr = new Object[2];
        this.size = 0;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        MyArrayList Array = new MyArrayList();
        MyArrayList.add(7);
        MyArrayList.add(6);
        MyArrayList.add(8);
        MyArrayList.add(11);
        MyArrayList.add(15);
        MyArrayList.add(scan.nextInt());
        System.out.println(MyArrayList.get(0));
        System.out.println(MyArrayList.size());
        System.out.println(MyArrayList.get(3));
        MyArrayList.remove(3);
        System.out.println(MyArrayList.get(3));
    }
}
