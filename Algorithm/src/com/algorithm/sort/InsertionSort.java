package com.algorithm.sort;

import java.util.Arrays;

/**
 * 插入排序
 */
public class InsertionSort {
	/**
	 * 直接插入排序
	 */
	public static void directInsertionSort(int[] arr) {
		int temp = 0;
		for (int i = 1; i < arr.length; i++) {
			temp = arr[i];
			int j = i - 1;
			// 将大于temp的值后移
			for (; j >= 0 && temp < arr[j]; j--) {
				arr[j + 1] = arr[j];
			}
			arr[j + 1] = temp;
			System.out.println("第" +( i + 1) +"趟排序：" + Arrays.toString(arr));
		}
	}
	
	/**
	 * 希尔排序
	 */
	public static void shellSort(int[] arr) {
		double d1 = arr.length;
		int temp = 0;
		
		while (true) {
			d1 = Math.ceil(d1 / 2);
			int d = (int) d1;
			for(int n = 0; n < d; n++){
				for (int i = n + d; i < arr.length; i+=d) {
					int j = i - d;
					temp = arr[i];
					for(; j >= 0 && temp < arr[j]; j-=d){
						arr[j + d] = arr[j];
					}
					arr[j + d] = temp;
				}
			}
			
			if(d == 1){
				break;
			}
		}
	}
}
