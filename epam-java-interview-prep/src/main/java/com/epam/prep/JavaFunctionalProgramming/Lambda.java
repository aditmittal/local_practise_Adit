package com.epam.prep.JavaFunctionalProgramming;


@FunctionalInterface
interface Calculate{
    public int calc(int x, int y);
}


public class Lambda {
    public static void main(String[] args){
        Calculate power = (x, y) -> (int) Math.pow(x,y);
        Calculate summation = (x,y) -> x+y;
        Calculate subt = (x,y) -> x-y;

        System.out.println(subt.calc(3,4));
        System.out.println(power.calc(3,4));
        System.out.println(summation.calc(3,4));
    }
}
