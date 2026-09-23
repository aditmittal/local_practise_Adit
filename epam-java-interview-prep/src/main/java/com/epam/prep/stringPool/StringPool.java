package com.epam.prep.stringPool;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

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
        String s = "Java";

        s.concat(" Backend");

        System.out.println(s);
    }

    //string builder immutability
    public static void stinrgBuilder(){
        StringBuilder sb = new StringBuilder("Java");

        sb.append("Backend");
        sb.reverse();

        System.out.println(sb);
    }

    public static void collections(){
        List<Integer> list = new ArrayList<>();

        list.add(10);
        list.add(20);

        List<Integer> list2 = list;

        list2.add(30);

        System.out.println(list);
        System.out.println(list2);
    }

    public static void hashSet(){
        Set<Integer> set = new HashSet<>();

        set.add(10);
        set.add(20);
        set.add(10);
        set.add(30);
        set.add(20);

        System.out.println(set.size());
    }

    public static void main(String[] args) {
        hashSet();

    }
}
