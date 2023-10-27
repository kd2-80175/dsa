package com.solution2;

import java.util.Arrays;

public class Solution2 {
public static void bubbleSort(int arr[],int N) {
	int count=0;
	int passes=0;
	int flag;
	for(int i=1;i<N;i++) {
		flag=0;
		passes++;
		for(int j=0;j<N-i;j++) {
			count++;
			if(arr[j]>arr[j+1]) {
				int temp=arr[j];
				arr[j]=arr[j+1];
				arr[j+1]=temp;
				flag=1;
			}
		}
		if (flag==0)
		break;
	}
	System.out.println("total count: "+count);
	System.out.println("total passes: "+passes);
}
public static void main(String[] args) {
	int arr[]= {33,22,66,55,44,11};
	System.out.println("Befor Sorting: "+Arrays.toString(arr));
	int N=arr.length;
	bubbleSort(arr, N);
	System.out.println("After sort: "+Arrays.toString(arr));
	
	
}
}
