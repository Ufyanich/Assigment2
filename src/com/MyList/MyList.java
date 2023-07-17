package com.MyList;



public interface MyList<T>{

    int size();
    boolean contains(Object o);
    void add(T element);
    void add(T element, int index);
    boolean remove(T item);
    T remove(int index);
    void clear();
    T get(int index);
    String getAllElements();
    //int indexOf(Object o);
    //int lastIndexOf(Object o);
    //void sort();
}


