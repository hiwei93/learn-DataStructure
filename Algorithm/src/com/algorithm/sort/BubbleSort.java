package com.algorithm.sort;

import java.util.Arrays;
/**
 * 冒泡排序
 */
public class BubbleSort {

	public static void bubbleSort(int[] arr){
		for (int i = 0; i <= arr.length - 2; i++) {
			for (int j = 0; j < arr.length - i - 1; j++) {
				if(arr[j + 1] < arr[j])
					swap(arr, j, j + 1);
			}
			System.out.println("第" +( i + 1) +"趟排序：" + Arrays.toString(arr));
		}
	}
	
	public static void bubbleSortByBook(int[] arr) {
		int n = arr.length;
		boolean sorted = false; //整体排序标志
		while (!sorted) {
			sorted = true; // 假定已经排好序
			for (int i = 1; i < n; i++) {
				if (arr[i - 1] > arr[i]) {
					swap(arr, i - 1, i);
					sorted = false;
				}
			}
			System.out.println("第" +( arr.length - n ) +"趟排序：" + Arrays.toString(arr));
			--n;
		}
	}

	private static void swap(int[] arr, int i, int j) {
		int temp = arr[i];
		arr[i] = arr[j];
		arr[j] = temp;
	}
}
