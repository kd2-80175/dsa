package com.sol4;

public class Solution4 {
	public static void occ(int arr[],int size,int key,int n) {
		int count=0;
	
		for(int i=0;i<arr.length;i++) {
			if(key==arr[i])
				count++;
			if(count==n &&arr[i]==key)  
			{
				System.out.println(n+" Occurrence of "+key+" is "+i);
				
			}
		}
		
	}
public static void main(String[] args) {
	int arr[]= {1,2,3,2,5,3};
	int key=3;
	int n=1;
	occ(arr, arr.length,key,n);
	
	
}
}
