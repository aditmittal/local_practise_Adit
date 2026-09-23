package com.epam.prep.arrays;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class ArrayProblems {

    // Find Second Largest
    public static int findSecondLargest(int[] nums) {

        int largest = Integer.MIN_VALUE;
        int secondLargest = Integer.MIN_VALUE;

        for (int num : nums) {

            if (num > largest) {
                secondLargest = largest;
                largest = num;

            } else if (num > secondLargest && num != largest) {
                secondLargest = num;
            }
        }

        return secondLargest;
    }

    // Move Zeros To End
    public static void moveZerosToEnd(int[] nums) {

        int index = 0;

        for (int num : nums) {
            if (num != 0) {
                nums[index++] = num;
            }
        }

        while (index < nums.length) {
            nums[index++] = 0;
        }
    }

    // Remove Duplicates From Sorted Array
    public static int removeDuplicates(int[] nums) {

        if (nums.length == 0) {
            return 0;
        }

        int index = 1;

        for (int i = 1; i < nums.length; i++) {

            if (nums[i] != nums[i - 1]) {
                nums[index++] = nums[i];
            }
        }

        return index;
    }

    // Merge Two Sorted Arrays
    public static int[] mergeSortedArrays(int[] arr1, int[] arr2) {

        int[] merged = new int[arr1.length + arr2.length];

        int i = 0;
        int j = 0;
        int k = 0;

        while (i < arr1.length && j < arr2.length) {

            if (arr1[i] < arr2[j]) {
                merged[k++] = arr1[i++];

            } else {
                merged[k++] = arr2[j++];
            }
        }

        while (i < arr1.length) {
            merged[k++] = arr1[i++];
        }

        while (j < arr2.length) {
            merged[k++] = arr2[j++];
        }

        return merged;
    }

    // Frequency Count
    public static Map<Integer, Integer> frequencyCount(int[] nums) {

        Map<Integer, Integer> frequencyMap = new HashMap<>();

        for (int num : nums) {

            frequencyMap.put(
                    num,
                    frequencyMap.getOrDefault(num, 0) + 1
            );
        }

        return frequencyMap;
    }

    // Missing Number
    public static int findMissingNumber(int[] nums) {

        int n = nums.length;
        int expectedSum = n * (n + 1) / 2;

        int actualSum = 0;

        for (int num : nums) {
            actualSum += num;
        }

        return expectedSum - actualSum;
    }

    // Rotate Array By K Steps
    public static void rotateArray(int[] nums, int k) {

        k = k % nums.length;

        reverse(nums, 0, nums.length - 1);
        reverse(nums, 0, k - 1);
        reverse(nums, k, nums.length - 1);
    }

    private static void reverse(int[] nums, int start, int end) {

        while (start < end) {

            int temp = nums[start];
            nums[start] = nums[end];
            nums[end] = temp;

            start++;
            end--;
        }
    }
}
