package com.epam.prep.stringPool;

import java.math.BigDecimal;
import java.util.*;

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

    static int test() {
        try {
            return 10;
        } catch (Exception e) {
            return 30;
        } finally {
            return 20;
        }
    }

    public static void streamsPractise(){
        List<Integer> nums = Arrays.asList(1, 2, 3);

        nums.stream()
                .filter(x -> {
                    System.out.println("filter: " + x);
                    return x > 1;
                })
                .map(x -> {
                    System.out.println("map: " + x);
                    return x * 10;
                });
    }

    static class Person {
        int id;

        Person(int id) {
            this.id = id;
        }

        @Override
        public boolean equals(Object obj) {
            Person p = (Person) obj;
            return this.id == p.id;
        }

        @Override
        public int hashCode() {
            return id;
        }
    }

    static  class Person2 {
        int id;

        Person2(int id) {
            this.id = id;
        }

        @Override
        public boolean equals(Object obj) {
            Person p = (Person) obj;
            return this.id == p.id;
        }
    }

    public static void main(String[] args) {

        Set<Person2> set = new HashSet<>();

        set.add(new Person2(1));
        set.add(new Person2(1));

        System.out.println(set.size());

        BigDecimal bd = new BigDecimal(1000.00);
    }
}
