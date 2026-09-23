package com.epam.prep.arrays;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ArrayProblemsTest {

    @Test
    void testFindSecondLargest() {

        int[] nums = {5, 8, 1, 3};

        assertEquals(5,
                ArrayProblems.findSecondLargest(nums));
    }

    @Test
    void testMoveZerosToEnd() {

        int[] nums = {1, 0, 2, 0, 3};

        ArrayProblems.moveZerosToEnd(nums);

        assertArrayEquals(
                new int[]{1, 2, 3, 0, 0},
                nums
        );
    }

    @Test
    void testMergeSortedArrays() {

        int[] arr1 = {1, 3, 5};
        int[] arr2 = {2, 4, 6};

        int[] result =
                ArrayProblems.mergeSortedArrays(arr1, arr2);

        assertArrayEquals(
                new int[]{1, 2, 3, 4, 5, 6},
                result
        );
    }
}
