package com.sol5;

import java.util.Arrays;

public class EmpMain {
public static void sort(Employee d[],int size) {
	for(int i=0;i<size;i++) {
		for(int j=i+1;j<size-1;j++) {
			if(d[i].getSal()>d[j].getSal()) {
				Employee temp=d[i];
				d[i]=d[j];
				d[j]=temp;
			}
			
		}
	}
}
public static void main(String[] args) {
	Employee arr[] = new Employee[5];
	arr[0]=new Employee(1,"Raj",50000);
	arr[1]=new Employee(1,"Julhi",70000);
	arr[2]=new Employee(1,"Evan",40000);
	arr[3]=new Employee(1,"Joy",80000);
	arr[4]=new Employee(1,"Monica",20000);
	sort(arr, arr.length);
	System.out.println("After sort: "+Arrays.toString(arr));
	
}
}
