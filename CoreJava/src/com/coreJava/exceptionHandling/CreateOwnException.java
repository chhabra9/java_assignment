package com.coreJava.exceptionHandling;

public class CreateOwnException {
    static void catchException() throws Exception{
        throw new Exception("create own exception");
    }
    public static void main(String[] args) {

        try{
            catchException();
        }catch (Exception e){
            System.out.println(e.getMessage());
        }
    }
}
