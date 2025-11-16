package com.demo.sorting;

public class sort2 {

	public static void mergeSort(String[] arr, int start, int end) {
		if (start < end) {
			int mid = start + (end - start) / 2; 

			mergeSort(arr, start, mid);
			mergeSort(arr, mid + 1, end);
			merge(arr, start, mid, end);
		}
	}

	public static void merge(String[] arr, int start, int mid, int end) {
		int n1 = mid - start + 1; 
		int n2 = end - mid;       

		String[] leftArr = new String[n1];
		String[] rightArr = new String[n2];

		for (int i = 0; i < n1; ++i) {
			leftArr[i] = arr[start + i];
		}
		for (int j = 0; j < n2; ++j) {
			rightArr[j] = arr[mid + 1 + j];
		}

		int i = 0, j = 0;
		int k = start; 

		while (i < n1 && j < n2) {
			if (leftArr[i].compareTo(rightArr[j]) <= 0) {
				arr[k] = leftArr[i];
				i++;
			} else {
				arr[k] = rightArr[j];
				j++;
			}
			k++;
		}

		while (i < n1) {
			arr[k] = leftArr[i];
			i++;
			k++;
		}

		while (j < n2) {
			arr[k] = rightArr[j];
			j++;
			k++;
		}
	}

    public void printArray(String[] arr) {
        for (String element : arr) {
            System.out.print(element + " ");
        }
        System.out.println();
    }
    
    
}