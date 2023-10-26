package com.sol6;

import java.util.Scanner;

public class Solution6 {
/*6. to find rank of an element in a stream of integers.
rank: rank of a given integer "x", in stream is "total no. of ele's less than or equal to x (including x).
	
	Input: { 10, 20, 15, 3, 4, 4, 1 }
	Ouput: Rank of 4 is: 4*/
	public static void linearsearch(int arr[],int size,int key) {
		int cnt=0;
		for(int i=0;i<arr.length;i++) {
			System.out.println("inside loop");
			
			if(arr[i]<=key) {
				
				cnt++;
			}
			
		
		}
		System.out.println("rank: "+cnt);
	}
	public static void main(String[] args) {
		int arr[]= { 10, 20, 15, 3, 4, 4, 1 };
		int x;
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter x: ");
		x=sc.nextInt();
		linearsearch(arr, arr.length, x);
		//System.out.println("Rank: "+rank);
		
	}
}
