package com.epam.prep.JavaFunctionalProgramming;

class Student {

    Student(){
        System.out.println("Constructor !!!!");
    }
}

@FunctionalInterface
interface createStudent{
    Student create();
}

public class InstanceCreation{

    public static void main(String[] args){
        createStudent factory = Student::new;
        Student stud = factory.create();
    }
}