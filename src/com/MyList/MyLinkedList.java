package com.MyList;

public class MyLinkedList<E> {
    private static class Node<E>
    {
        E element;
        Node next;
        Node previous;

    }
    private Node<E> head;
    private Node<E> tail;
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

    public E get(int index){
        if ( index < 0 || index >= size)
        {
            throw new IndexOutOfBoundsException();
        }

        if(index == 0){
            return head.element;
        }

        if (index == size - 1)
        {
            return tail.element;
        }
        if (index <= size /2)
        {
            Node<E> MyListT;
            MyListT = head;

            for (int i = 0; i < index; i++ )
            {
                MyListT = MyListT.next;
            }

            return MyListT.element;
        } else {
            Node<E> MyListT;
            MyListT = tail;

            for (int i = size-1; i > index; i--)
            {
                MyListT = MyListT.previous;
            }
            return MyListT.element;
        }


    }

    public int size(){
        return size;
    }

    public static void main(String[] args)
    {

    }
}
