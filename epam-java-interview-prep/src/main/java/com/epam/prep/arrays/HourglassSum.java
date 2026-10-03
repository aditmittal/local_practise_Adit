package com.epam.prep.arrays;

import java.util.ArrayList;
import java.util.List;

public class HourglassSum {
    public static int hourglassSum(List<List<Integer>> arr) {
        // Write your code here
        int maxSum = Integer.MIN_VALUE;
        for(int i=1;i<=4;i++){
            for(int j=1;j<=4;j++){
                int currentSum =
                        arr.get(i - 1).get(j - 1)
                                + arr.get(i - 1).get(j)
                                + arr.get(i - 1).get(j + 1)
                                + arr.get(i).get(j)
                                + arr.get(i + 1).get(j - 1)
                                + arr.get(i + 1).get(j)
                                + arr.get(i + 1).get(j + 1);

                maxSum = Math.max(maxSum, currentSum);
            }
        }
        return maxSum;

    }
    public static void main(String[] args){
        List<List<Integer>> arr = new ArrayList<>(
                List.of(
                        List.of(-9, -9, -9, 1, 1, 1),
                        List.of(0, -9, 0, 4, 3, 2),
                        List.of(-9, -9, -9, 1, 2, 3),
                        List.of(0, 0, 8, 6, 6, 0),
                        List.of(0, 0, 0, -2, 0, 0),
                        List.of(0, 0, 1, 2, 4, 0)
                )
        );
        System.out.println(hourglassSum(arr));
    }
}
