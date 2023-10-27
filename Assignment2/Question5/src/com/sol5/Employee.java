package com.sol5;

public class Employee {
	int id;
String name;
double sal;
public Employee() {
	this(0,"",0);
}
public Employee(int id, String name, double sal) {
	super();
	this.id = id;
	this.name = name;
	this.sal = sal;
}
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public double getSal() {
	return sal;
}
public void setSal(double sal) {
	this.sal = sal;
}
@Override
public String toString() {
	return "Employee [id=" + id + ", name=" + name + ", sal=" + sal + "]";
}

}
