package com.epam.prep.neetCode;

public class Practise {
    public boolean isChar(char c){
        return (c >= 'a' && c <= 'z') || (c >= 'A' && c <= 'Z');
    }
    public boolean isPalindrome(String s) {
        int i=0;
        int j = s.length()-1;
        boolean flag = true;
        while(i<=j){
            if(!isChar(s.charAt(i)))i++;
            if(!isChar(s.charAt(j)))j--;

            if(s.charAt(i) == s.charAt(j)){
                i++;j--;
            }else{
                flag = false;
            }
        }
        return flag;



    }
}
