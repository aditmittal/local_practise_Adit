package com.epam.prep.strings;

public class MergeSorting {

    public static void mergeSort(int[] nums, int start, int end){
        if(start>=end){
            return;
        }

        int mid = start + (end - start)/2;

        mergeSort(nums, start, mid);
        mergeSort(nums, mid+1, end);

        merge(nums, start, mid, end);

    }

    public static void merge(int[] nums, int start, int mid, int end) {
        int i=start;
        int j = mid+1;
        int k=0;

        int[] temp = new int[end - start + 1];

        while(i<=mid && j<=end){
            if(nums[i]>=nums[j]){
                temp[k++] = nums[j++];
            }else{
                temp[k++] = nums[i++];
            }
        }

        while(j<=end){
            temp[k++] = nums[j++];
        }
        while(i<=mid){
            temp[k++] = nums[i++];
        }

        for (int x = 0; x < temp.length; x++) {
            nums[start + x] = temp[x];
        }

    }

    public static void main(String[] args){
        int[] nums = new int[]{4,3,2,9,8,7,98,6,4,3,2,56};
        int n = nums.length;
        mergeSort(nums, 0, n-1);
        for(int c:nums){
            System.out.print(c+" ");
        }
    }
}
