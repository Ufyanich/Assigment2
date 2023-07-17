package com.MyList;
import java.util.*;

public class Main {
    public static void main(String[] args){
        MyArrayList myTest = new MyArrayList();
        myTest.add(1);
        myTest.add(2);

        myTest.getAllElements();
        //System.out.println("index "+myTest.indexOf(1));

        System.out.println("The 1st element " + myTest.get(0));

        if(myTest.contains(1) == true)
        {
            System.out.println("exist");
        } else {
            System.out.println("not exist");
        }
        System.out.println("Im here");
        myTest.remove(0);
        System.out.println("The size " + myTest.size);
        myTest.clear();


        if(myTest.contains(3) == true)
        {
            System.out.println("exist");
        } else {
            System.out.println("not exist");
        }

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
