package com.coreJava.exceptionHandling;

public class ExceptionHandling {
    public static void main(String[] args) {
        int num=234;
        int[] divisor={2,4,6,0};
        for(int i=0;i<divisor.length;i++){
            try {
                double res=(double) (num/divisor[i]);
                System.out.println(res);
            }
            catch (ArithmeticException e)
            {
                System.out.println("arithmetic exception:"+e.getMessage());
            }
            catch (IndexOutOfBoundsException e)
            {
                System.out.println("Index Out Of Bound:"+e.getMessage());
            }
            catch (Exception e)
            {
                System.out.println(e.getMessage());
            }
        }
    }
}
