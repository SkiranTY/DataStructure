package com.tyss.basics;

public class FindSmallAndLarge {

	public static void main(String[] args) {
		int arr[] = new int[5];
		arr[0] = 1;
		arr[1] = 10;
		arr[2] = 100;
		arr[3] = 40;
		arr[4] = 500;
		
		int i,max=arr[0],min=arr[0];
		
		for (i = 0; i <=arr.length - 1; i++) {
			if(arr[i]>max) {
				max = arr[i];                                     // time complexity = O(n);
			}else if(arr[i]< min) {
				min = arr[i];
			}
		}
		System.out.println("largest number is :"+max);
		System.out.println("smallest number is :"+min);
	}
}
