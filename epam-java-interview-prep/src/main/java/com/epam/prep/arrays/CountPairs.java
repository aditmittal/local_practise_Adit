package com.epam.prep.arrays;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class CountPairs {

    /*
        Given an array of integers and a target value, determine the number of pairs of array elements that have
         a difference equal to the target value.Example

        There are three values that differ by : , , and . Return .

        Function Description

        Complete the pairs function below.

        pairs has the following parameter(s):

        int k: an integer, the target difference
        int arr[n]: an array of integers
        Returns

        int: the number of pairs that satisfy the criterion
        Input Format

        The first line contains two space-separated integers  and , the size of  and the target value.
        The second line contains  space-separated integers of the array .

        Constraints

        each integer  will be unique
    *
    * */
    public static int pairs(int k, List<Integer> arr) {
        // Write your code here
        int count =0;
        Set<Integer> set = new HashSet<>(arr);
        for(int n: arr){
            if(set.contains(n+k)){
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args){
        List<Integer> arr = new ArrayList<>(List.of(1,2,3,4,5,6,7,8,9));
        int k = 3;
        System.out.println(pairs(k,arr));
    }
}
