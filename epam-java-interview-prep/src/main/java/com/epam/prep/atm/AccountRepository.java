package com.epam.prep.atm;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.*;
import java.util.stream.Collectors;

public class AccountRepository {
    public static void firstRep(){
        int[] input = new int[]{500,23,501,300, 500};
        int n = input.length;

        Map<Integer, Integer>map = new HashMap<>();

        for(int i=0;i<n;i++){
            map.put(input[i], map.getOrDefault(input[i], 0)+1);
            if(map.get(input[i]) > 1){
                System.out.println(input[i]);
                return;
            }
        }
        System.out.println("not found repeated error code");

    }



    public static void main(String[] args){
        firstRep();
    }

}
