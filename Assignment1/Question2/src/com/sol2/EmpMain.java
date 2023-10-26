package com.sol2;
import java.util.*;
public class EmpMain {
	public static int idSearch(Employee e[],int size,int id) {
		for(int i=0;i<e.length;i++) {
			if(id==e[i].getEmpid())
			return i;
		}
		return -1;
	}
	public static int nameSearch(Employee e[],int size,String name) {
		for(int i=0;i<e.length;i++) {
			if(name==e[i].getName())
			return i;
		}
		return -1;
	}
	public static int salSearch(Employee e[],int size,double sal) {
		for(int i=0;i<e.length;i++) {
			if(sal==e[i].getSalary())
			return i;
		}
		return -1;
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		Employee e1[]=new Employee[5];
		e1[0]=new Employee(1,"Payal",5000);
		e1[1]=new Employee(8,"Mohit",10000);
		e1[2]=new Employee(2,"Mohan",8000);
		e1[3]=new Employee(4,"Abhay",7000);
		e1[4]=new Employee(5,"Ritesh",9000);
		int id1;
		id1=sc.nextInt();
		int index=idSearch(e1, e1.length, id1);
		System.out.println("id found at index: "+index);
		String name=sc.next();
		int index1=nameSearch(e1, e1.length, name);
		System.out.println("id found at index: "+index1);
		double salary=sc.nextDouble();
		int index2=salSearch(e1, e1.length, salary);
		System.out.println("id found at index: "+index2);
		
		
	
 


}
	}
