package com.algorithm.sort;

public class MergeSort {

	public static void mergeSort(int[] arr) {
		mSort(arr, 0, arr.length - 1);
	}

	/**
	 * 递归分治
	 * @param arr
	 * @param low
	 * @param high
	 */
	private static void mSort(int[] arr, int low, int high) {
		if(low >= high) return;
		int mid = (low + high) / 2;
		
		mSort(arr, low, mid);
		mSort(arr, mid + 1, high);
		merge(arr, low, mid, high);
	}

	/**
	 * 合并两个有序数组
	 * @param arr
	 * @param low
	 * @param mid
	 * @param high
	 */
	private static void merge(int[] arr, int low, int mid, int high) {
		int[] temp = new int[arr.length];
		
		int i = low;
		int j = mid + 1;
		int k = 0;
		while (i < high) {
			if(arr[i] < arr[j]){
				temp[k++] = arr[i++];
			} else {
				temp[k++] = arr[j++];
			}
		}
		
		while (i < mid) {
			temp[k++] = arr[i++];
		}
		
		while(j < high) {
			temp[k++] = arr[j++];
		}
		
		for(int n = 0; n < temp.length - 1; n++) {
			arr[low + n] = temp[n];
		}
	}
}
