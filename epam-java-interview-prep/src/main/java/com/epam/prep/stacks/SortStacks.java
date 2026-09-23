package com.epam.prep.stacks;

import java.util.Stack;

public class SortStacks {

    public static void stackSort(Stack<Integer> stack){
        Stack<Integer> temp = new Stack<>();
        while(!stack.isEmpty()){
            int current = stack.pop();

            while (!temp.isEmpty() && temp.peek()<current){
                stack.push(temp.pop());
            }
            temp.push(current);
        }
        while (!temp.isEmpty()){
            stack.push(temp.pop());
        }
    }

    public static void main(String[] args){
        Stack<Integer>stack = new Stack<>();
        stack.push(3);
        stack.push(7);
        stack.push(8);
        stack.push(4);
        stack.push(6);
        stack.push(1);
        stack.push(9);

        stackSort(stack);
        System.out.println(stack);

    }
}
