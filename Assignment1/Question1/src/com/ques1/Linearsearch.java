package com.ques1;

import java.util.Scanner;

public class Linearsearch {
	static int com=0;
public static int linearsearch(int arr[],int size,int key) {
	for(int i=0;i<=size;i++) {
		if(arr[i]==key)
	return com;	
com++; 
	}
return -1;
}
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	int arr[]= {66,22,33,44,55,78,55,99};
	int key;
	System.out.print("Enter key to find: ");
	key=sc.nextInt();
	int comparision=linearsearch(arr, arr.length, key);
	System.out.println("the key at index: "+comparision);
	
	
	
	
}
}
