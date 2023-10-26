package com.ques1;

public class Binary {

	public static int binary(int arr[], int mid, int key) {
		int com = 0;
		int left = 0;
		int right = arr.length - 1;
		while (left <= right) {
			mid = (left + right) / 2;
			if (arr[mid] >key) {
				right = mid - 1;
			}
			if (arr[mid ]<key) {
				left = mid + 1;
				
			}
			
			else {
				System.out.println("found at index "+mid);
				com++;
				return com;	
				}
			com++;
			
		}
		return com;
	}

	public static void main(String[] args) {
		int arr[] = { 11, 22, 33, 44, 55, 66 };
		int left = 0;
		int right = arr.length - 1;
		int mid = (left + right) / 2;
		int key=55;
		int comparision = binary(arr, mid,key );
		System.out.println("Number of comparision: " + comparision);
	}
}
