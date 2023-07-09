package com.MyList;

public class MyLinkedList<E>{
    private static class Node<E>
    {
        E element;
        Node next;
        Node previous;

        public Node(E element){
            this.element = element;
            this.next = null;
            this.previous = null;
        }

    }
    private Node<E> head;
    private Node<E> tail;
    int size = 0;

    public void add(E element){
        Node<E> MyList = null;
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
            throw new IndexOutOfBoundsException(); //check for valid value
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

    public E remove(int index)
    {
        Node<E> TestRemove;

        if (index == 0){
            TestRemove = head
        }
    }

    public static void main(String[] args)
    {

    }
}
