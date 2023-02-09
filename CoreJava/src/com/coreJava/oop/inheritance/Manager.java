package com.coreJava.oop.inheritance;

public class Manager extends Employee{
    private String [] clientsHandle;
    public Manager(String[] clientsHandle) {
        this.clientsHandle = clientsHandle;
    }
    public Manager(){
        this.clientsHandle=new String[]{};
    }
    public Manager(String[] clientsHandle,int salary) {
        super(salary);
        this.clientsHandle = clientsHandle;
    }
}
