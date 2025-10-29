package com.demo.array;
import java.util.Arrays;


public class Array {




	private int[] arr;
	private int count;

	public Array() {
		arr = new int[10];
		count = 0;

	}

	public Array(int[] arr, int count) {
		this.arr = arr;
	}

	public Array(int size) {
		arr = new int[size];
		count = 0;
	}

	public int getCapacity() {
		return arr.length;
	}

	public int getSize() {
		return count;
	}

	public boolean add(int x) {
		if (count < arr.length) {
			arr[count] = x;
			count++;
			return true;
		}
		return false;
	}
	
	public boolean add(int value,int pos) {
		if(count<arr.length && count >pos) {
			for(int i=count;i>=pos;i--) {
				arr[i]=arr[i+1];
			}
			arr[pos]=value;
			return true;
		}
		return false;
	}
	public boolean deleteByPos(int pos) {
		if(pos!=count) {
			for(int i=0;i<count-1;i++) {
				arr[i]=arr[i+1];
				
			}
			return true;
		}
		return false;
		
	}
	
	public int searchByValue(int value) {
		for(int i=0;i<count;i++) {
			if(arr[i]==value) {
				return i;
			}
		}
		return -1;
	}
	
	public boolean deleteByValue(int value) {
		int p = searchByValue(value);
		if(p!=-1) {
			
			return deleteByPos(p);
		}
		return false;
	}
	public void rotateArray(boolean flag,int num) {
		if(flag) { //Right Rotation Array
			for(int i=0;i<num;i++) {
				int temp=arr[count];
				for(int j=count-1;j>0;j--) {
					arr[j]=arr[j-1];
					
				}
				arr[0]=temp;
			}
		}
		else {//left Rotation of Array
			for(int i=0;i<num;i++) {
				int temp=arr[0];
				for(int j=0;j<count-1;j++) {
					arr[j]=arr[j+1];
					
				}
				arr[count-1]=temp;
			}
		}
	}
	
	public int[] reverseArray(boolean flag) {
		if(flag) {//InPlace Reverse Array
			for(int i=0,j=count-1;i<count;i++,j--) {
				int temp=arr[i];
				arr[i]=arr[i+1];
				arr[j]=temp;
			}
			return arr;
		}
		else {//Reverse in a new Array
			int[] a= new int[count];
			for(int i=count-1,k=0;i>=0;i--,k++) {
				a[k]=arr[i];
			}
			return a;
		}
	}
	public int findmax() {
		int max =arr[0];
		for(int i=1;i<count;i++) {
			if(max<arr[i]) {
				max=arr[i];
			}
		}
		return max;
	}
	public int [] exchangeIndexValue() {
		int max=findmax();
		int[] arr1=new int[max+1];
		for(int i=0;i<arr1.length;i++) {
			arr[i]= -1;
		}
		for(int i =0; i<count; i++) {
			int idx = arr[i];
			int value = i;
			arr1[idx]=value;
		}
		return arr1;
	}
	
	public int findSum() {
		int sum=0;
		for(int i=0;i<count;i++) {
			sum+=arr[i];
		}
		return sum;
	}


	@Override
	public String toString() {
		return "MyArray [arr=" + Arrays.toString(arr) + ", count=" + count + "]";
	}
	
	
}



