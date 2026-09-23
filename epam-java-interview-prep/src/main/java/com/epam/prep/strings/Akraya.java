package com.epam.prep.strings;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Akraya {


    public static int binSearch(int[] nums, int num, int start, int end){
        //    Searching:
//    Question: Implement a binary search algorithm for a sorted array of integers and provide its complexity analysis.
//    Input: A sorted array of integers and a target integer.
//            Output: Index of the target integer or -1 if not found.
//    Time Complexity: O(log n), where n is the number of elements in the array.
//    Space Complexity: O(1) for iterative implementation.
        while(start<=end){
            int mid = end + (start - end)/2;

            if(nums[mid] == num){
                return  mid;
            }
            else if(num > nums[mid]){
                return binSearch(nums, num, mid+1, end);
            }else{
                return binSearch(nums, num, start, mid -1);
            }
        }
        return -1;
    }


    public static int[] twoSum(int[] nums, int sum){
        //    Two Sum Problem:
//    Question: Given an array of integers, find two numbers such that they add up to a specific target number. Use a hashmap to achieve an efficient solution.
//    Input: An array of integers and a target sum.
//    Output: Indices of the two numbers that add up to the target sum.
//    Skills Tested: Usage of hashmaps to reduce time complexity, understanding of hashing.
        Map<Integer, Integer> map = new HashMap<>();
        for(int i=0;i<nums.length;i++){
            int compliment = sum - nums[i];

            if(map.containsKey(compliment)){
                return new int[]{map.get(compliment), i};
            }
            map.put(nums[i], i);
        }
        return new int[]{-1,-1};
    }

    public static void main(String[] args){
        int[] nums = {1,3,4,5,6,7,8};
        int num = 2;



        System.out.println(Arrays.toString(twoSum(nums, 21)));

//        System.out.println(binSearch(nums, num, 0, nums.length-1));
    }
}
