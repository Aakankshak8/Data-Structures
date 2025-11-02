package com.demo.insertionsort;

import java.util.Arrays;

public class InsertionSort {
    
    public static void insertionsort(int[] arr) {
        for (int i = 1; i < arr.length; i++) {
            int key = arr[i];
            int j = i - 1;

            // Shift elements greater than key to one position ahead
            while (j >= 0 && arr[j] > key) {
                arr[j + 1] = arr[j];
                j--;
            }

            // Insert key at correct position
            arr[j + 1] = key;

            // Print array after each iteration
            System.out.println(Arrays.toString(arr));
        }
    }
}
