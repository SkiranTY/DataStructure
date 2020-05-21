package com.tyss.basics;

public class CountNoOfDuplicates {
	
	public static void main(String[] args) {
		int arr[] = new int[5];
		
		arr[0] = 1;
		arr[1] = 2;
		arr[2] = 3;
		arr[3] = 4;
		arr[4] = 3;
		int repeat=0,count=1;
		
		for (int i = 0; i <= arr.length - 1; i++) {
			for (int j = i+1; j <= arr.length - 1; j++) {
				if (arr[i] == arr[j]) {                                               
					 repeat=arr[j];
					 count++;
					 System.out.println("repeating number : "+ repeat);                 // time complexity = O(n^2)
					 System.out.println("number of times repeated : "+count);
				}
			}
		}
	}
}
