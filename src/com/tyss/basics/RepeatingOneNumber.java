package com.tyss.basics;

public class RepeatingOneNumber {

	public static void main(String[] args) {
		int arr[] = new int[5];
		arr[0] = 1;
		arr[1] = 2;
		arr[2] = 3;
		arr[3] = 4;
		arr[4] = 3;
		for (int i = 0; i <=arr.length - 1; i++) {
			for (int j = i+1; j <=arr.length - 1; j++) {
				if (arr[i] == arr[j]) {                                               
					int repeat=arr[j];
					System.out.println("repeating number : "+ repeat);                 // time complexity = O(n^2)
				}
			}
		}
	}

}
