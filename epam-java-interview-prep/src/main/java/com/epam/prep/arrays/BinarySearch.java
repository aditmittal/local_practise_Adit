package com.epam.prep.arrays;

public class BinarySearch {
    private static int findMid(int l, int r, int[] arr, int num) {
        while (l<=r){
            int mid = l+(r-l)/2;
            if(arr[mid]==num){
                return mid;
            }else if (num>arr[mid]){
                return findMid(mid+1, r, arr, num);
            }else {
                return findMid(l, mid-1, arr, num);
            }
        }
        return -1;
    }

    public static void main(String[] args){
        int[] nums = {1,3,4,5,6,7,8,9};
        int num = 5;
        System.out.println(findMid(0,nums.length-1, nums,num));
        System.out.println(findMid(0,nums.length-1, nums,87));
        System.out.println(findMid(0,nums.length-1, nums,8));
    }
}
