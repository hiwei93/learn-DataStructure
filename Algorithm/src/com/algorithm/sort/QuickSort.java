package com.algorithm.sort;
/**
 * 快速排序
 */
public class QuickSort {

	private static int partition(int[] arr, int low, int high){
		int pivotPointer = low;
		int pivotkey = arr[low];  // 标记枢纽
		
		while (low < high) {
			while (low < high && arr[high] >= pivotkey) {
				high--;
			}
			while (low < high && arr[low] <= pivotkey) {
				low++;
			}
			swap(arr, low, high);
		}
		swap(arr, pivotPointer, low);
		return low;
	}
	
	private static void quickSort(int[] arr, int low, int high){
		if(low >= high) return;
		int pivotloc = partition(arr, low, high);
		quickSort(arr, low, pivotloc - 1);
		quickSort(arr, pivotloc + 1, high);
	}
	
	public static void sort(int[] arr) {
		if(arr == null || arr.length == 0)
			return;
		quickSort(arr, 0, arr.length-1);
	}

	private static void swap(int[] arr, int low, int high) {
		int temp = arr[low];
		arr[low] = arr[high];
		arr[high] = temp;
	}
}
