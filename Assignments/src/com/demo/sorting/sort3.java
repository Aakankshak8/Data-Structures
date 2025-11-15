package com.demo.sorting;

import java.util.Arrays;

public class sort3 {

    private static int partition(String[] arr, int start, int end) {

        int pivotindex = start;
        String pivot = arr[pivotindex];
        int i = start;
        int j = end;

        while (i < j) {

            while (i < end && arr[i].compareTo(pivot) <= 0) {
                i++;
            }

            while (j > pivotindex && arr[j].compareTo(pivot) > 0) {
                j--;
            }

            if (i < j) {
                String temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }

        if (pivotindex != j) {
            String temp = arr[pivotindex];
            arr[pivotindex] = arr[j];
            arr[j] = temp;
        }

        System.out.println(Arrays.toString(arr));
        System.out.println("Pivot position: " + j + " Pivot Value: " + arr[j]);

        return j;
    }

    public static void quicksort(String[] arr, int start, int end) {
        if (start < end) {
            int p = partition(arr, start, end);
            quicksort(arr, start, p - 1);
            quicksort(arr, p + 1, end);
        }
    }
}
