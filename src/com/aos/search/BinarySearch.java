package com.aos.search;

import java.util.Arrays;

public class BinarySearch {

	public static void main(String[] args) {
		
		int[] arr=new int[] {1,64,5, 34, 25, 12, 11, 8};
		Arrays.sort(arr);
		Arrays.stream(arr).forEach(val->{
			System.out.println(val);
		});
		
		System.out.println("Searching...");
		int index=binarySearch(arr,64);
		
		if(index>=0) {
			System.out.println("value found at "+index);
		}else {
			System.out.println("Not found..");
		}
	}
	
	public static int binarySearch(int[] arr,int searchVal) {
		
		
		int left=0;
		int right=arr.length-1;
		
		while(left<=right) {
			
			int mid=(right-left)/2 + left;
			
			if(arr[mid]==searchVal) {
				return mid;
			}
			if(arr[mid]<searchVal) {
				left=mid+1;
			}else {
				right=mid-1;
			}
			
			System.out.println(left+"---"+mid+"------"+right+"----"+arr[mid]);
		}
		
		
		return -1;
	}
	

}
