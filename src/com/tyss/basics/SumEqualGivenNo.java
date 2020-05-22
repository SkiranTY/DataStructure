package com.tyss.basics;

public class SumEqualGivenNo {

	public static void main(String[] args) {
		int givenNo = 5;
		
		int arr[] = new int[5];
		arr[0] = 2;
		arr[1] = 3;
		arr[2] = 5;
		arr[3] = 4;
		arr[4] = 1;
		
		int sum=0;
		
		for(int i=0; i<=arr.length-1; i++) {
			for(int j=i+1;j<=arr.length-1; j++) {                                   // time complexity = O(n^2)
				sum=arr[i]+arr[j];
			
			if(sum==givenNo) {
				System.out.println("["+arr[i]+","+arr[j]+"]");
			}
			}
		}
	}
}
