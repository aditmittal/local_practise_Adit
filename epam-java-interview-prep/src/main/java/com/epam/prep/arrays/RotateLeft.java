package com.epam.prep.arrays;

import java.util.ArrayList;
import java.util.List;

public class RotateLeft {
    public static void rotate(List<Integer> arr, int start, int end){
        while(start<=end){
            int temp = arr.get(start);
            arr.set(start, arr.get(end));
            arr.set(end, temp);
            start++;
            end--;
        }

    }

    public static List<Integer> rotateLeft(int d, List<Integer> arr) {
        // Write your code here
        rotate(arr, 0, d-1);
        rotate(arr, d, arr.size()-1);
        rotate(arr, 0, arr.size()-1);

        return arr;

    }

    public static List<Integer> rotateRight(int d, List<Integer> arr) {
        // Write your code here
        rotate(arr, 0, arr.size()-1);
        rotate(arr, 0, d-1);
        rotate(arr, d, arr.size()-1);


        return arr;

    }

    public static void main(String[] args){
        List<Integer> arr = new ArrayList<>(List.of(1,2,3,4,5,6,7,8,9));
        List<Integer> arr2 = new ArrayList<>(List.of(1,2,3,4,5,6,7,8,9));
        int d = 3;

        System.out.println(rotateLeft(d, arr));
        System.out.println(rotateRight(d, arr2));
    }
}
