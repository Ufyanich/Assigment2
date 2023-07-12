package com.MyList;

public class MyLinkedList<T> implements MyList{
    private static class Node<T>
    {
        T element;
        Node<T> next;
        Node<T> previous;

        public Node(T element){
            this.element = element;
            this.next = null;
            this.previous = null;
        }

    }
    private Node<T> head;
    private Node<T> tail;
    int size = 0;

    public void add(Object element){
        Node<T> MyList = null;
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

    public T get(int index){
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
            Node<T> MyListT;
            MyListT = head;

            for (int i = 0; i < index; i++ )
            {
                MyListT = MyListT.next;
            }

            return MyListT.element;
        } else {
            Node<T> MyListT;
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

    public T remove(int index)
    {
        Node<T> TestRemove = null;

        if (index == 0){
            TestRemove = head;
            head = head.next;
        } else if (index == size-1) {
            TestRemove = tail;
            tail = tail.previous;
        } else {
            TestRemove = getNode(index);
            Node<T> prevNode = TestRemove.previous;
            Node<T> nextNode = TestRemove.next;
            prevNode.next = nextNode;
            nextNode.previous = prevNode;
        }

        size--;
        return TestRemove.element;
    }

    private Node<T> getNode(int index){
        Node<T> thisNode = head;
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
