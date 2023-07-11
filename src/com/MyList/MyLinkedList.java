package com.MyList;

public class MyLinkedList<T> implements MyList<T>{
    private static class Node<E>
    {
        E element;
        Node<E> next;
        Node<E> previous;

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
        Node<E> TestRemove = null;

        if (index == 0){
            TestRemove = head;
            head = head.next;
        } else if (index == size-1) {
            TestRemove = tail;
            tail = tail.previous;
        } else {
            TestRemove = getNode(index);
            Node<E> prevNode = TestRemove.previous;
            Node<E> nextNode = TestRemove.next;
            prevNode.next = nextNode;
            nextNode.previous = prevNode;
        }

        size--;
        return TestRemove.element;
    }

    private Node<E> getNode(int index){
        Node<E> thisNode = head;
        for (int i = 0; i < index; i++)
        {
            thisNode = thisNode.next;
        }
        return thisNode;
    }

    public static void main(String[] args)
    {
        MyLinkedList MyList = new MyLinkedList();

        MyList.add(1);
        MyList.add(2);
        MyList.add(3);

        System.out.println("get 2nd " + MyList.get(1));
        System.out.println("remove element " + MyList.get(0));

        System.out.println("size of element before" + MyList.size);

        MyList.remove(0);

        System.out.println("size of element now" + MyList.size);
    }
}
