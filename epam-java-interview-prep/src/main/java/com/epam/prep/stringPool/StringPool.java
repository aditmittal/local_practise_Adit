package com.epam.prep.stringPool;

public class StringPool {

    //equals and ==
    public static void stringPool1(){
        String a = "hello";
        String b = "hello";
        String c = new String("hello");

        System.out.println(a == b);
        System.out.println(a == c);
        System.out.println(a.equals(c));
    }

    //String immutability
    public static void stringPool2(){

    }

    public static void main(String[] args) {
        stringPool1();

    }
}
