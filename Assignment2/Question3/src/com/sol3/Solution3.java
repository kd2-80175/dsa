package com.sol3;

import java.util.Arrays;

public class Solution3 {
public static void insertSort(int arr[],int N) {
	int count=0;
	for(int i=1;i<N;i++) {
		int temp=arr[i];
		int j=i-1;
		while(j>=0&&arr[j]>temp) {
			arr[j+1]=arr[j];
			j--;
				}
		arr[j+1]=temp;
		}
	}
	
public static void main(String[] args) {
	
	int arr[] = {55, 44, 22, 66, 11, 33};
	
	System.out.println("Array before sort : " + Arrays.toString(arr));
	insertSort(arr, arr.length);
	System.out.println("Array after sort : " + Arrays.toString(arr));
}

}
