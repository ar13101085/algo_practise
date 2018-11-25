package com.aos.sort;

import java.util.Arrays;

public class BubbleSort {

	public static void main(String[] args) {
		int[] arr=bubbleSort(new int[] {64, 34, 25, 12, 22, 11, 90});
		Arrays.stream(arr).forEach(val->{
			System.out.println(val);
		});
	}
	public static int[] bubbleSort(int arr[]) {
		
		int len=arr.length;
		
		for (int i = 0; i < len; i++) {
			for (int j = 0; j < len-i-1; j++) {
				
				if(arr[j]>arr[j+1]) {
					
					int temp=arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=temp;
				}
			}
		}
		
		return arr;
	}

}
