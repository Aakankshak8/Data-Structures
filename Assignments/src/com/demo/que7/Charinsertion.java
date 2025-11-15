package com.demo.que7;

import java.util.Arrays;

public class Charinsertion {
    
    public static void insertionsort(char[] arr) {
        for (int i = 1; i < arr.length; i++) {

            char key = arr[i];
            int j = i - 1;

            while (j >= 0 && arr[j] > key) { // ascending compare
                arr[j + 1] = arr[j];
                j--;
            }

            arr[j + 1] = key;

            System.out.println(Arrays.toString(arr));
            
        }
    }
}
