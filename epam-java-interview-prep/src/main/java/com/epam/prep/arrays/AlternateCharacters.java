package com.epam.prep.arrays;

public class AlternateCharacters {
    public static int alternatingCharacters(String s) {
        // Write your code here
        int count =0;
        int i=0;
        int j = i;
        while(j<s.length()){
            if(s.charAt(i) == s.charAt(j) && i!=j){
                count++;
            }else if(s.charAt(i)!=s.charAt(j)){
                i=j;
            }
            j++;
        }
        return count;

    }

    public static void main(String[] args){
        String s = "AAABBBABABABABAAABABBAB";
        System.out.println(alternatingCharacters(s));
    }
}
