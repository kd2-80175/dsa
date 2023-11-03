package com.solution10;

import java.util.Scanner;

public class Employees {
private int empid;
private String name;
private double salary;
public Employees(int empid,String name,double salary) {
	
	this.empid=empid;
	this.name=name;
	this.salary=salary;
}
public Employees() {
	
}
public int getEmpid() {
	return empid;
}
public void setEmpid(int empid) {
	this.empid = empid;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public double getSalary() {
	return salary;
}
public void setSalary(double sal) {
	this.salary=sal;
}
public void accept() {
	Scanner sc = new Scanner(System.in);
	System.out.print("Enter ID : ");
	this.empid = sc.nextInt();
	sc.nextLine();
	System.out.print("Enter Name : ");
	this.name = sc.nextLine();
	System.out.print("Enter Salary : ");
	this.salary = sc.nextDouble();
}
@Override
public String toString() {
	return "Employees [empid=" + empid + ", name=" + name + ",salary=" + salary + "]";
}



}
