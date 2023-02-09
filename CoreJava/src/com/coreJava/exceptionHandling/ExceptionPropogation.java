package com.coreJava.exceptionHandling;

public class ExceptionPropogation {
    void a(){
        int m=98/0;
    }
    void b(){
        a();
    }
    void c(){
        try{
            b();
        }catch (Exception e){
            System.out.println(e.getMessage());
        }
    }

    public static void main(String[] args) {
        ExceptionPropogation e1=new ExceptionPropogation();
        e1.c();
        System.out.println("Thanks");
    }
}
