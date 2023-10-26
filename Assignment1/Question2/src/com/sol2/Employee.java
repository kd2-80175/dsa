package com.sol2;

import java.util.Objects;
import java.util.Scanner;

public class Employee {
int empid;
String name;
double salary;
public Employee(int empid, String name, double salary) {
	super();
	this.empid = empid;
	this.name = name;
	this.salary = salary;
}
Scanner sc=new Scanner(System.in);
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
public void setSalary(double salary) {
	this.salary = salary;
}
@Override
public int hashCode() {
	return Objects.hash(empid, name, salary);
}
@Override
public boolean equals(Object obj) {
	if (this == obj)
		return true;
	if (obj == null)
		return false;
	if (getClass() != obj.getClass())
		return false;
	Employee other = (Employee) obj;
	return empid == other.empid && Objects.equals(name, other.name)
			&& Double.doubleToLongBits(salary) == Double.doubleToLongBits(other.salary);
}
public void accept() {
	System.out.print("Enter id: ");
	empid=sc.nextInt();
	System.out.println("Enter name: ");
	name=sc.next();
	System.out.println("Enter salary: ");
	salary=sc.nextDouble();
}
@Override
public String toString() {
	return "Employee [empid=" + empid + ", name=" + name + ", salary=" + salary + "]";
}



	

}
