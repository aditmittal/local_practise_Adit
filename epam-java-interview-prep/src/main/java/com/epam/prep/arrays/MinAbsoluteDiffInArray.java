package com.epam.prep.arrays;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class MinAbsoluteDiffInArray {
    public static int minimumAbsoluteDifference(List<Integer> arr) {
        // Write your code here
        int minDiff = Integer.MAX_VALUE;
        Collections.sort(arr);
        for(int i=0;i<arr.size()-1;i++){
            minDiff = Math.min(minDiff, Math.abs(arr.get(i)-arr.get(i+1)));
        }
        return minDiff;
    }

    public static void main(String[] args){
        List<Integer> arr = new ArrayList<>(List.of(21,57,34,40,54,78,87,98,49,43,25,145,67,95));
        System.out.println(minimumAbsoluteDifference(arr));
    }
}
