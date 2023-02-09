package com.coreJava.collection;

import java.util.Stack;

public class StackExample {
    public static void main(String[] args) {
        Stack<Integer> st=new Stack<>();
        st.push(23);
        st.push(32);
        st.push(45);
        while(!st.empty()){
            System.out.println(st.pop());
        }
    }
}
