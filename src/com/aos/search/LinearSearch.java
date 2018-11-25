package com.aos.search;

public class LinearSearch {

	public static void main(String[] args) {
		int index=linearSearch(new int[] {64, 34, 25, 12, 22, 11, 90},12);
		if(index>=0) {
			System.out.println("value found at "+index);
		}else {
			System.out.println("Not found..");
		}
	}
	
	public static int linearSearch(int[] arr,int searchValue) {
		for (int i = 0; i < arr.length; i++) {
			if(arr[i]==searchValue) {
				return i;
			}
		}
		return -1;
	}

}
