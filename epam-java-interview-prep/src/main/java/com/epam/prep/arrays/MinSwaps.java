package com.epam.prep.arrays;

public class MinSwaps {
    public static int makingAnagrams(String s1, String s2) {
        // Write your code here
        int[] arr = new int[26];
        for(char c: s1.toCharArray()){
            arr[c-'a']++;
        }
        for(char c: s2.toCharArray()){
            arr[c-'a']--;
        }
        int count =0;
        for(int n: arr){
            count += Math.abs(n);
        }
        return count;

    }

    public static void main(String[] args){
        String s1 = "sdkjfnsjdf";
        String s2 = "kserufjksdf";

        System.out.println(makingAnagrams(s1,s2));
    }
}
