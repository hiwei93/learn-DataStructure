package com.algorithm.sort;
/**
 * 选择排序
 */
public class SelectionSort {
	
	/**
	 * 直接（简单）选择排序
	 */
	public static void directSelectionSort(int[] arr){
		int position = 0;
		
		for (int i = 0; i < arr.length; i++) {
			int j = i + 1;
			position = i;
			int temp = arr[i];
			for(; j < arr.length; j++){
				if(arr[j] < temp) {
					temp = arr[j];
					position = j;
				}
			}
			arr[position] = arr[i];
			arr[i] = temp;
		}
	}
	

}
