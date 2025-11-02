package com.demo.quicksort;

import java.util.Arrays;

public class TestQuickSort {

    public static void main(String[] args) {

        int[] arr = {11, 23, 22, 5, 1, 7, 8, 10, 3, 17};

        System.out.println("Original Array: " + Arrays.toString(arr));

        QuickSort.quicksort(arr, 0, arr.length - 1);

        System.out.println("Sorted Array: " + Arrays.toString(arr));
    }
}
