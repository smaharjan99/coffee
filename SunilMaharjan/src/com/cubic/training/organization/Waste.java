package com.cubic.training.organization;

import java.util.Scanner;

public class Waste {

	
	 class Employee{
		 String name = "Ram";
		 int id = 21;
		 String dept = "IT";
	}
	
	/*void data(){
		Scanner in =new Scanner(System.in);
		System.out.println("Enter name - ");
		Employee.name = in.nextLine();
		System.out.println("Enter id - ");
		Employee.id = in.nextInt();
		System.out.println("Enter dept - ");
		Employee.dept = in.nextLine();
			
	}*/
	 void display(){
		 System.out.println("wajat");;
	 }
	
	public static void main(String[] args) {
		Waste emp = new Waste(Employee);
		emp.display();
		
	}

}
