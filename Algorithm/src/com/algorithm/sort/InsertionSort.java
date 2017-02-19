package com.algorithm.sort;

public class InsertionSort {
	
	/**
	 * ÷±Ω”≤Â»Î≈≈–Ú
	 */
	public static void directIntertionSort(int[] arr){
		int temp = 0;
		for (int i = 1; i < arr.length; i++) {
			if (arr[i] < arr[i - 1]) {
				int j = i - 1;
				temp = arr[i];
				for (; j >= 0 && temp < arr[j]; j--) {
					arr[j + 1] = arr[j];
				}
				arr[j + 1] = temp;
			}
		}
	}

}
