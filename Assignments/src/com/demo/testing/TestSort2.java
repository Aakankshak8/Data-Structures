package com.demo.testing;

import com.demo.sorting.sort2;

public class TestSort2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
	        String[] data = {"banana", "apple", "cherry", "date", "fig"};
	        System.out.print("Original Array: ");
	        
	        sort2 ob=new sort2();
	        ob.mergeSort(data, 0, data.length-1);
	        ob.printArray(data);
	        
	       
	       
	    }

	

	}

