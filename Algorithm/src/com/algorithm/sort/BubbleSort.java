package com.algorithm.sort;

import java.util.Arrays;
/**
 * ð������
 */
public class BubbleSort {

	public static void bubbleSort(int[] arr){
		for (int i = 0; i <= arr.length - 2; i++) {
			for (int j = 0; j < arr.length - i - 1; j++) {
				if(arr[j + 1] < arr[j])
					swap(arr, j, j + 1);
			}
//			System.out.println("��" +( i + 1) +"������" + Arrays.toString(arr));
		}
	}

	private static void swap(int[] arr, int i, int j) {
		int temp = arr[i];
		arr[i] = arr[j];
		arr[j] = temp;
	}
}
