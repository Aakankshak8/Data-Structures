package com.demo.testing;

import com.demo.sorting.*;

import java.util.Scanner;

public class TestSort4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		

	        Scanner sc = new Scanner(System.in);

	        int[] arr = new int[10]; // size 10 array
	        int n = 0;

	        System.out.println("Enter 8 values:");
	        for (int i = 0; i < 8; i++) {
	            arr[i] = sc.nextInt();
	            n++;
	        }

	        // sort first 8 values
	        Sort4.insertionSort(arr, n);

	        System.out.println("Array after sorting first 8 values:");
	        Sort4.display(arr, n);

	        // Accept 2 more numbers one by one
	        for (int i = 0; i < 2; i++) {
	            System.out.println("Enter number to insert:");
	            arr[n] = sc.nextInt();
	            n++;

	            // sort again after each insertion
	            Sort4.insertionSort(arr, n);

	            System.out.println("Array after inserting new value:");
	            Sort4.display(arr, n);
	        }

	        sc.close();
	    

	}

	
}
