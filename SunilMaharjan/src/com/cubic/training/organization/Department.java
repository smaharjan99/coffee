package com.cubic.training.organization;

import java.util.Scanner;

public class Department extends Employee {
	int deptNum;
	int editNum;
	int choice;
	int choice2;
	Scanner in = new Scanner(System.in);
	Employee employee;



void chooseDepartment(){
	System.out.println("Which is Your Department: \n1.IT\n2.Marketint\n3.Sales\n4.Exit");
	deptNum = in.nextInt();
	choice = deptNum;
}
void editDepartment(){
	System.out.println("\n1.Add\n2.Edit\n3.Delete\n4.Display\n5.Exit");
	editNum = in.nextInt();
	choice2 = editNum;
}


	public static void main(String[] args) {
		
		Department d= new Department();
		
		
		
		//d.inArray();
		while (d.deptNum!=4){
			d.chooseDepartment();
		switch(d.choice){
		case 1: 
			System.out.println("You are in IT Department");
			
			break;
		case 2:
			System.out.println("You are in Marketing Department");
			break;
		case 3:
			System.out.println("You are in Sales Department");
			break;
		case 4:
			System.out.println("Exit");
			System.exit(0);
		default:
			System.out.println("Enter the numbers 1,2,3,4 and nothing else");
		
		}
		
		while(d.editNum!=5){
			d.editDepartment();
		switch(d.choice2){
		case 1: 
			for (int i=0; i<=d.empNum; i++){
			System.out.println("Add New Employee Data From Here");
			d.arraySize();
			d.inArray();
			d.addArray();
			
			}
			return;
		case 2:
			System.out.println("Edit Employee Data From Here");
			
			break;
		case 3:
			System.out.println("Fire and Remove Employee Data From Here");
			break;
		case 4:
			System.out.println("Display Current Employee Data Here");
			break;
		case 5:
			System.out.println("Exit");
			System.exit(0);
		default:
			System.out.println("Enter the numbers 1,2,3,4,5 and nothing else");
		}
		}
		
		d.displayArray();
		}
	}

}
