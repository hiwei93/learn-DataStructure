package com.algorithm.test;

import java.util.Arrays;
import java.util.Scanner;

import com.algorithm.sort.BubbleSort;
import com.algorithm.sort.InsertionSort;

public class testSort {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("请输入一组待排序数字，以‘,’分隔：");
		String str = input.next();
		String[] strp = str.split(",");
		int[] arr = new int[strp.length];
		for(int i = 0; i < strp.length; i++){
			arr[i] = Integer.valueOf(strp[i]);
		}
		
		System.out.println("冒泡排序后为：");
		BubbleSort.bubbleSort(arr);
		System.out.println(Arrays.toString(arr));
	}

}
