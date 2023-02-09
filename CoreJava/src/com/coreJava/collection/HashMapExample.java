package com.coreJava.collection;

import java.util.HashMap;

public class HashMapExample {
    public static void main(String[] args) {
        HashMap<String,Integer>mp=new HashMap<>();
        mp.put("achint",32);
        mp.put("Sharad",34);
        mp.put("shudha",98);
        System.out.println(mp.get("achint"));
        System.out.println(mp.get("shydha"));
        mp.remove("shudha");
        mp.replace("achint",32,55);
        System.out.println(mp.get("achint"));
    }
}
