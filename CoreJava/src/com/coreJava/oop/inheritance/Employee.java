package com.coreJava.oop.inheritance;

public class Employee {
    private int salary;

    public Employee(int salary) {
        this.salary=salary;
    }

    public Employee() {
        this.salary=10000;
    }
    public int getSalary(){
            return salary;}


    public void setSalary(int salary)
    {
        this.salary = salary;
    }
}
