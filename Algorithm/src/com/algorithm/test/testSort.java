package com.algorithm.test;

import java.util.Arrays;
import java.util.Scanner;

import com.algorithm.sort.BubbleSort;
import com.algorithm.sort.InsertionSort;

public class testSort {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("������һ����������֣��ԡ�,���ָ���");
		String str = input.next();
		String[] strp = str.split(",");
		int[] arr = new int[strp.length];
		for(int i = 0; i < strp.length; i++){
			arr[i] = Integer.valueOf(strp[i]);
		}
		
		System.out.println("ð�������Ϊ��");
		BubbleSort.bubbleSort(arr);
		System.out.println(Arrays.toString(arr));
	}

}
