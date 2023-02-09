package com.coreJava.oop.MethodOverloading;

public class Main {
    public static void main(String[] args) {
        Sum s1=new Sum();
        System.out.println(s1.sum(2,3));
        System.out.println(s1.sum(2,3,4));
    }
}
