package com.demo.testing;

import java.util.Arrays;
import java.util.Scanner;

import com.demo.sorting.sort3;

public class TestSort3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size of array");
		int n=sc.nextInt();
		String[] arr=new String[n];
		System.out.println("Enter the strings in the array: ");
		
		for(int i=0;i<arr.length;i++) {
			arr[i]=sc.next();
			
		}
		System.out.println(Arrays.toString(arr));
		
		sort3.quicksort(arr, 0, n-1);

	}
	
	
}

        