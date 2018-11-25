package com.aos.sort;

import java.util.Arrays;

public class SelectionSort {
	public static void main(String[] args) {
		int[] arr=selectionSort(new int[] {64, 34, 25, 12, 22, 11, 90});
		Arrays.stream(arr).forEach(val->{
			System.out.println(val);
		});
	}
	public static int[] selectionSort(int[] arr) {

		for (int i = 0; i < arr.length; i++) {
			int min=i;
			for (int j = i+1; j < arr.length; j++) {
				if(arr[min]>arr[j]) {
					min=j;
				}
			}
			int temp = arr[min];
			arr[min]=arr[i];
			arr[i]=temp;
			
		}
		return arr;
	}
}

