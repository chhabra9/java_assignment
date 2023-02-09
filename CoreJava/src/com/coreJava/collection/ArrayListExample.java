package com.coreJava.collection;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListExample {
    public static void main(String[] args) {
        java.util.ArrayList<Integer>arr=new ArrayList<>();
        arr.add(1);
        arr.add(10);
        arr.add(3);
        arr.add(2);
        arr.add(8);
        arr.add(7);
        Iterator<Integer> i=arr.iterator();
        while(i.hasNext()){
            System.out.print(i.next()+" ");
        }
        System.out.println();
        arr.set(3,99);
        arr.add(2,34);
        for(Integer j:arr){
            System.out.print(j+" ");
        }
    }

}
