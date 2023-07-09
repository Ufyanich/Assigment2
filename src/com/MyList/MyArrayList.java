package com.MyList;

import java.util.*;

public class MyArrayList<E> implements List<E> {
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
        Scanner scanner = new Scanner(System.in);
        MyArrayList Array = new MyArrayList();
        Array.add("Test");
        Array.add(6);
        Array.add(8);
        Array.add(11);
        Array.add(15);
        Array.add(scanner.nextInt());
        System.out.println(Array.get(0));
        System.out.println(Array.size());
        System.out.println(Array.get(3));
        Array.remove(3);
        System.out.println(Array.get(3));
    }
}
