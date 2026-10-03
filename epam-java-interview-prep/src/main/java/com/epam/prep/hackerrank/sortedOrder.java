package com.epam.prep.hackerrank;

import java.util.*;

public class sortedOrder {
    public static void findNum(){
        int[] heights = {1,1,3,3,4,1};
        int n = heights.length;

        int[] sortedHeights = heights.clone();
        Arrays.sort(sortedHeights);

        int count=0;
        for(int i=0;i<n;i++){
            if(sortedHeights[i]!=heights[i]){
                count++;
            }
        }
        System.out.println(count);
    }

    public static void smallestPossiblediffpairs(){
        int[] lats = {6,2,4,10};

        Arrays.sort(lats);
        int minDiff = Integer.MAX_VALUE;
        for(int i=1;i<lats.length;i++){
            minDiff = Math.min(minDiff, lats[i]-lats[i-1]);
        }
        List<List<Integer>> ans = new ArrayList<>();
        for(int i=1;i<lats.length;i++){
            if(lats[i]-lats[i-1] == minDiff){
                ans.add(List.of(lats[i-1], lats[i]));
            }
        }
        System.out.println(ans);
    }

    public static List<Integer> matchingStrings(List<String> stringList, List<String> queries) {
        // Write your code here
        List<Integer> result = new ArrayList<>();
        Map<String, Integer> freq = new HashMap<>();
        for(String s: stringList){
            freq.put(s, freq.getOrDefault(s, 0)+1);
        }

        for(String s: queries){
            int n = freq.getOrDefault(s, 0);
            result.add(n);
        }
        return result;


    }


    public static void minimumAbsoluteDifference(List<Integer> arr) {
        // Write your code here
        int minDiff = Integer.MAX_VALUE;
        List<Integer> sorted = new ArrayList<>(arr);
        Collections.sort(sorted);
        System.out.println(sorted);
        for(int i=0;i<sorted.size()-1;i++){
            minDiff = Math.min(minDiff, Math.abs(sorted.get(i)-sorted.get(i+1)));
        }
        System.out.println(minDiff);


    }

    public static String twoStrings(String s1, String s2) {
        // Write your code here
        Set<Character> set = new HashSet<>();
        for(char c: s1.toCharArray()){
            set.add(c);
        }
        for(char c: s2.toCharArray()){
            if(set.contains(c)){
                return "YES";
            }
        }
        return "NO";
    }

    public static void main(String[] args){
        findNum();
        smallestPossiblediffpairs();
        System.out.println(twoStrings("asjandsd","asjdaskjd"));
        System.out.println(twoStrings("iowqeuiqwe","asjdaskjd"));
        List<Integer> arr = List.of(1,4,39,87,95,54,32,59,69,76,67,98);
        minimumAbsoluteDifference(arr);
    }

}