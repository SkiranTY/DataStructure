package com.tyss.basics;

public class IntersectionOfArray {

	public static void main(String[] args) {
		int arr1[]= {1,2,3,4,5};
		int arr2[]= {4,5,6,7,8};
		int intersect[]=new int[arr1.length];
		for(int i=0;i<=arr1.length-1;i++) {
			for(int j=0;j<=arr2.length-1;j++) {
				if(arr1[i]==arr2[j]) {                                                //O(n^2)
					intersect[i]=arr2[j];
				}
			}
		}
		for(int k=0;k<=intersect.length-1;k++) {
			System.out.println(intersect[k]);
		}
	}
}
