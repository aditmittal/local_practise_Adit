package com.epam.prep.arrays;

import java.lang.management.ManagementPermission;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Twosum {
    public static int[] twoSum(int[] nums, int sum){
        Map<Integer, Integer> num = new HashMap<>();

        for(int i =0;i<nums.length;i++){
            int complement = sum - nums[i];
            if(num.containsKey(complement)){
                return new int[]{num.get(complement), i};
            }
            num.put(nums[i], i);
        }
        return new int[]{-1,-1};
    }

    public static void main(String[] args){
        int[] arr = {2,4,5,7,72,4,6,9,8};
        int sum = 14;

        System.out.println(Arrays.toString(twoSum(arr, sum)));
    }
}
