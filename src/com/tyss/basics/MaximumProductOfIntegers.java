package com.tyss.basics;

public class MaximumProductOfIntegers {

	public static void main(String[] args) {
		int arr[] = new int[5];
		
		arr[0] = 1;
		arr[1] = 2;
		arr[2] = 3;
		arr[3] = 4;
		arr[4] = 5;
		
		int i,j,product=0;
		for(i=0,j=i+1; i<arr.length-1; i++,j++) {                                   //time complexity = O(n);
//			for(j=i+1; j<=arr.length-1;j++) {                                       //time complexity = O(n^2);
				if(product < arr[i]*arr[j]) {
					product = arr[i]*arr[j];
				}
//			}
			
		}
		System.out.println("product :"+product);
	}
}
