package com.sol1;

import java.util.Arrays;

public class Solution1 {
public static void selectionSort(int arr[],int N) {
	int count =0;
	for(int i=0;i<N;i++) {
		for(int j=i+1;j<N-1;j++) {
			count++;
			if(arr[i]>arr[j]) {
				int temp=arr[i];
				arr[i]=arr[j];
				arr[j]=temp;
				
			}
			
		}
	}
	System.out.println("total count : "+count);
	
}
public static void main(String[] args) {
	int arr[]= {44,11,55,22,66,33};
	System.out.println("Before sort: "+Arrays.toString(arr));
	selectionSort(arr, arr.length);
	System.out.println("After sort: "+Arrays.toString(arr));
}
}
