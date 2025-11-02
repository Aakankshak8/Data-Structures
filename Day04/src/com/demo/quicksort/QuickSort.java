package com.demo.quicksort;

import java.util.Arrays;

public class QuickSort {

    public static int partition(int[] arr, int start, int end) {
        int pivotIndex = start;
        int pivot = arr[pivotIndex];
        int i = start;
        int j = end;

        while (i < j) {
            while (i < end && arr[i] <= pivot) {
                i++;
            }
            while (j > start && arr[j] > pivot) {
                j--;
            }

            if (i < j) {
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }

        // Swap pivot to correct position
        if (pivotIndex != j) {
            int temp = arr[pivotIndex];
            arr[pivotIndex] = arr[j];
            arr[j] = temp;
        }

        System.out.println(Arrays.toString(arr));
        System.out.println("Pivot position: " + j + "Pivot number: " + arr[j]);
        return j;
    }

    public static void quicksort(int[] arr, int start, int end) {
        if (start < end) {
            int p = partition(arr, start, end);
            quicksort(arr, start, p - 1);
            quicksort(arr, p + 1, end);
        }
    }
}
