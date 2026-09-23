package com.epam.prep.JavaFunctionalProgramming;

@FunctionalInterface
interface login{
    boolean auth(String username, String password);
}

public class Authenticate {

    public static void main(String[] args){
        login au = (x,y) -> x.equals("adam")&&y.equals("adam21");

        System.out.println("LOGIN: "+au.auth("adam", "adam21"));
        System.out.println("LOGIN: "+au.auth("adam", "adam21"));

    }

}
