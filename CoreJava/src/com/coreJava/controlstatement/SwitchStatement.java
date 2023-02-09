package com.coreJava.controlstatement;

public class SwitchStatement {
    public static void main(String[] args) {
        String target="achint";
        switch (target){
            case "achint":
                System.out.println("hii achint");
                break;
            case "aman":
                System.out.println("hello aman");
            default:
                System.out.println("hello all");
        }
    }
}
