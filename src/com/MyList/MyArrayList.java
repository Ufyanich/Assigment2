package com.MyList;

import java.util.*;
import java.util.concurrent.LinkedBlockingDeque;

public class MyArrayList<T> implements MyList<T>{
    private T[] arr;
    int size;

    public MyArrayList(){
        this.arr = (T[]) new Object[5];
        this.size = 0;
    }

    public int size(){
        return size;
    }

    public boolean contains(Object o){
        int i = size;

        while (o != arr[i])
        {
            if(i <= 0)
            {
                i--;
            }
            else if (i == 0)
            {
                return false;
            }

        }

        return true;
    }

    public void add(T element){
        if(size == arr.length)
        {
            InBuff();
        }

        arr[size++] = element;
    }

    private void InBuff(){
        T[] arrNew = (T[]) new Object[arr.length*2];

        for (int i = 0; i < size; i++)
        {
            arrNew[i] = arr[i];
        }

        arr = arrNew;
    }

    public void add(T element, int index)
        {
            checkInd(index);
            if(size== arr.length){
                InBuff();
            }
            for (int i = size - 1; i> index; i--)
            {
                arr[i] = arr[i+1];
            }
            arr[index] = element;
        }

    public T get(int index){
        return arr[index];
    }


    public boolean remove(Object element){
        int index = 0;
        boolean found = false;
        for (int i = 0; i < size; i++)
        {
            if(arr[i] == element){
            index = i;
            found = true;}
        }

        if(found){
            remove(index);
        }
        return found;
    }

    public T remove(int index){
        T temp = arr[index];
        for(int i = index - 1; i < size; i++)
        {
            arr[i-1] = arr[i];
        }
        size--;
        return temp;
    }

    private void checkInd(int index) {
        if (index < 0 && index>=size)
        {
            System.out.println("No index");
        }
    }

    public void clear(){
        this.arr = (T[]) new Object[5];
        this.size = 0;
    }
    public String getAllElements(){

        return Arrays.toString(arr);
    }

    /*public boolean indexOf(Object o){

    }

    public int indexOf(Object o) {
        int a;
        int i = arr.length - 1;

        while(o != arr[i])
        {
            if(o == arr[i])
            {
                return a = i;
            }

            else {
                i--;
            }
        }

    }*/
}
