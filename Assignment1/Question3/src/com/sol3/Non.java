package com.sol3;

import java.util.Arrays;
/*3. Implement binary search algorithm if array is sorted in descending order.
*/
public class Non {
	public static int binary(int arr[], int key) {
		int left = 0;
		int right = arr.length - 1;
		int mid;

		while (left <= right) {
			mid = (left + right) / 2;
			if (arr[mid] > key) {
				left = mid + 1;
			} else if (arr[mid] < key) {
				right = mid - 1;

			}

			else {
//				System.out.println("found at index " + mid);
				return mid;
			}

		}
		return -1;
	}

	public static void main(String[] args) {
		int arr[] = {9,8,7,6};
//		Arrays.sort(arr);
		int key = 7;
		int index = binary(arr, key);
		System.out.println("found at index: " + index);
	}
}
