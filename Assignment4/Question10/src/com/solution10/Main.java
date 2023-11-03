package com.solution10;

import java.util.Scanner;

public class Main {
public static void main(String[] args) {
	Scanner sc =new Scanner(System.in);
	LinkedList l1=new LinkedList();
	
	int choice;
	do {
		System.out.println("----------MENU-----------");
		System.out.println("0.Exit");
			System.out.println("1.Add");
			System.out.println("2.display");
			System.out.println("3.find by name");
			System.out.println("4.Delete  by id");
			System.out.println("5.Update Salary");
		System.out.println("Enter your choice: ");
		choice =sc.nextInt();
		System.out.println("--------------------------");
		switch(choice) {
		case 1:Employees e1=new Employees();
			e1.accept();
	            l1.addFirst(e1);
	break;
		case 2: l1.display();
		break;
	case 3: {String name;

		System.out.print("Enter name for searching : ");
		//Scanner sc1=new Scanner(System.in);
		 name = sc.next();
		e1 = l1.searchByName(name);
		if (e1 != null) {
			System.out.println(e1);
			System.out.println("-------------------");
		} else {
			System.out.println("Employee not found.");
			System.out.println("-------------------");
		}
		}
	
			break;
		case 4:int id;
		     System.out.println("Enter Id for deletion: ");
		      id=sc.nextInt();
		      l1.deleteById(id);
		      break;
		case 5:{System.out.println("Enter id for salary update: ");
		      id=sc.nextInt();
		    System.out.println("Enter new salary: ");
		    double salary=sc.nextDouble();
		    if(l1.updateSalary(id, salary)) {
		    	System.out.println("Salary updated successfully.");
		    	System.out.println("--------------");
		    }else {
		    	System.out.println("ID not found.");
		    }
		    System.out.println("----------------------");
		    }
	break;
		}
	}while(choice!=0);

	}

}
