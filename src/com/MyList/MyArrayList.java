package com.MyList;

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

}
