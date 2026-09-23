package com.epam.prep.streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamsPractise {
    public static void evenNum(){
        List<Integer> nums = Arrays.asList(1,3,2,4,5,6,34,20,32,38,43,54);
        List<Integer> evens = nums.stream()
                .filter(n -> n%2==0)
                .sorted()
                .toList();
        for (int n : evens){
            System.out.print(n+", ");
        }
    }

    public static void startsWithA(){

    }

    public static void main(String[] args){
        evenNum();
    }
}
