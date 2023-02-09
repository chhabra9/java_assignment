package com.coreJava.collection;

import java.util.Iterator;
import java.util.LinkedList;

public class LinkListExample {
    public static void main(String[] args) {
        LinkedList<Integer> list=new LinkedList<>();
        list.add(2);
        list.add(3);
        list.add(88);
        list.add(98);
        Iterator<Integer>it= list.iterator();
        while(it.hasNext()){
            System.out.println(it.next()+" ");
        }
        list.addFirst(12);
        list.removeLast();
        for(Integer j:list){
            System.out.print(j+" ");
        }
    }

}
