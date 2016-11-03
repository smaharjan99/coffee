package com.cubic.training.emrp;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Employed {
	static int id;
	static String name;
	static String city;
	static String state;
	static int salary;
	static Scanner in = new Scanner(System.in);
	static int empNum;
	static int deptNum;
	static int editNum;
	static int choice;
	static int choice2;


	public Employed(int id, String name, String city, String state, int salary) {
		//super();
		this.id = id;
		this.name = name;
		this.city = city;
		this.state = state;
		this.salary = salary;
	}

public Employed() {
	// TODO Auto-generated constructor stub
}

	public static void main(String[] args) {
		ArrayList <Employed> employees = new ArrayList<Employed>();
		ArrayList<Employed> listIt = new ArrayList<Employed>();
		ArrayList<Employed> listMkt = new ArrayList<Employed>();
		ArrayList<Object> listSale = new ArrayList<Object>();
		
		Employed listIt = new Employed();
		Employed listMkt = new Employed();
		Employed listSale = new Employed();
		while(editNum!=5){
			System.out.println("\n1.Add\n2.Edit\n3.Delete\n4.Display\n5.Exit");
			editNum = in.nextInt();
			choice2 = editNum;
		switch(choice2){
		case 1: 
			
			System.out.println("Add New Employee Data From Here");
			System.out.println("Enter Number of Employees - ");
			empNum = in.nextInt();
			for (int i = 0; i < empNum; i++) {
				System.out.println("Enter Employee ID - ");
				id=in.nextInt();
				
				System.out.println("Enter Name - ");
				name =in.next();
				
				System.out.println("Enter City - ");
				city = in.next();
				
				System.out.println("Enter State - ");
				state = in.next();
				
				System.out.println("Enter Salary - ");
				salary = in.nextInt();
				
					   /* data.add(id);
						data.add(name);
						data.add(city);
						data.add(state);
						data.add(salary);*/
				
				 if (deptNum==1){
					//for (int a =0; a<empNum; a++){
					 	//listIt.add(id, name, city, state, salary);
						
					
				//listIt.add(data);
					//}
					 //System.out.println(data);
				 }else if(deptNum==2){
					 //listMkt.add(data);
					/* listIt.add(id);
						listMkt.add(name);
						listMkt.add(city);
						listMkt.add(state);
						listMkt.add(salary);*/
				 }else if(deptNum ==3){
				 //listSale.add(data);
					 /*listIt.add(id);
						listSale.add(name);
						listSale.add(city);
						listSale.add(state);
						listSale.add(salary);*/
				 }
				 
				}
			//addArray();
			
			
			
			displayArray();
			return;
		case 2:
			System.out.println("Edit Employee Data From Here");
			editArray();
			break;
		case 3:
			System.out.println("Fire and Remove Employee Data From Here");
			removeArray();
			break;
		case 4:
			System.out.println("Display Current Employee Data Here");
			displayArray();
			break;
		case 5:
			System.out.println("Exit to Main Menu");
			choiceDepartment();;
		default:
			System.out.println("Enter the numbers 1,2,3,4,5 and nothing else");
		}
		}

	}

}
