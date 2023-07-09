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

    private void checkInd(int index) {
        if (index < 0 || index>size)
        {
            throw new IndexOutOfBoundsException("No index");
        }
    }

    public void remove(int index){
        checkInd(index);
        for(int i=index+1; i<size; i++){
            arr[i-1]= arr[i];
        }
        size--;
    }
}
