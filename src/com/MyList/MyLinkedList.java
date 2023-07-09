package com.MyList;

public class MyLinkedList<E> {
    private static class Node<E>
    {
        E element;
        Node next;

    }
    private Node head;
    private Node tail;
    int size = 0;

    public void add(E element){
        Node MyList = new Node();
        MyList.element = element;
        MyList.next = null;

        if(head == null) //check for null
        {
            head = MyList;
        } else {
            Node NewList = head;
            while (NewList.next != null) // jump to last node
            {
                NewList = NewList.next;
            }
            NewList.next = MyList;
        }
    }

    public void get(int index){

    }

    public static void main(String[] args)
    {

    }
}
