package com.epam.prep.arrays;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class GreedyAndSorting {
    public static int maximumToys(List<Integer> prices, int k) {
        // Write your code here
        Collections.sort(prices);
        int count=0;
        int sum = 0;
        for(int price: prices){
            if(sum + price >k){
                break;
            }

            sum += price;
            count++;
        }
        return count;
    }
    public static void main(String[] args){
        int k=12;
        List<Integer> list = new ArrayList<>(List.of(1,2,3,4,5,6,7));
        System.out.println(maximumToys(list, k));
    }

}
