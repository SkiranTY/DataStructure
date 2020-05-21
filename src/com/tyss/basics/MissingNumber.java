package com.tyss.basics;

public class MissingNumber {

	public int findmissingnumber(int arr[], int n) {
		int i;                                                    
		for (i = 0; i < n - 1; i++) {
			if (arr[i] != i + 1) {
				return i + 1;
			}
		}                                                          // time complexity=O(n)
																   //space complexity=O(n)
		return 0;
	}

	public static void main(String[] args) {
		int arr[] = new int[100];
		
		MissingNumber findmiss = new MissingNumber();
		int missnumber = findmiss.findmissingnumber(arr, 100);
		System.out.println("missing number in the array : "+ missnumber);
	}
}
