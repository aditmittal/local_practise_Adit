package com.epam.prep.arrays;

import java.util.HashMap;
import java.util.Map;

public class FirstUniqueCharacterInString {
    public static int firstChar(String s){
        Map<Character, Integer> freq = new HashMap<>();
        for(char c: s.toCharArray()){
            freq.put(c, freq.getOrDefault(c,0)+1);
        }
        for(int i=0;i<s.length();i++){
            if(freq.get(s.charAt(i))==1){
                return i;
            }
        }
        return -1;
    }
    public static void main(String[] args){
        String s = "sssssssss";
        System.out.println("first unique character index is: "+ firstChar(s));
    }
}
