package com.tyss.basics;

public class RemoveDupicates {

	public static void main(String[] args) {
		int arr[] = new int[7];
		arr[0] = 1;
		arr[1] = 2;
		arr[2] = 3;
		arr[3] = 4;
		arr[4] = 3;
		arr[5] = 5;
		arr[6] = 6;
		int count = 1;
		int cpyarr[];

		for (int i = 0; i <= arr.length - 1; i++) {
			for (int j = i + 1; j <= arr.length - 1; j++) {
				if (arr[i] == arr[j]) {
					arr[j] = 0;
					count++;
					                                                        // time complexity = O(n^2)
				}
			}
		}
		System.out.println("count : " + count);
		cpyarr = new int[arr.length];
		
		System.out.println("cpyarr length : " + cpyarr.length);
		for (int m = 0; m <=arr.length - 1; m++) {
			for (int k = 0; k <= cpyarr.length - 1; k++) {
				if (arr[m] != 0) {
					cpyarr[k] = arr[m];                                        // time complexity = O(n^2)	                                                           // total O(n^2)
				}
			}
			System.out.println(cpyarr[m]);

		}
	}
}
