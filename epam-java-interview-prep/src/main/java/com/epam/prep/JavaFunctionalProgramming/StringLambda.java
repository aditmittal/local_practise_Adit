package com.epam.prep.JavaFunctionalProgramming;

@FunctionalInterface
interface StrLambda{
    String spacing(String s);
}

public class StringLambda {
    public static void main(String[] args){
        StrLambda fill = s -> String.join(" ", s.split(""));
        System.out.println(fill.spacing("skdjfn"));
    }
}
