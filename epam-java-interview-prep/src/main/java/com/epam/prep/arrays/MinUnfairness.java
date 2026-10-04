package com.epam.prep.arrays;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class MinUnfairness {
    public static int maxMin(int k, List<Integer> arr) {
        // Write your code here
        Collections.sort(arr);
        int unfairness = 0;
        int MinUnfairness = Integer.MAX_VALUE;
        int i=0;
        int j = k-1;

        while(j<arr.size()){
            unfairness = arr.get(j) - arr.get(i);
            MinUnfairness = Math.min(unfairness, MinUnfairness);
            i++;j++;
        }
        return MinUnfairness;

    }
    public static void main(String[] args){
        List<Integer> list = new ArrayList<>(List.of(10, 100, 300, 200, 1000, 20, 30));
        int k = 3;
        System.out.println(maxMin(k, list));
    }
}
