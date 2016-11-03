package com.cubic.training.maining;

import java.util.Comparator;
import java.util.Date;
import java.util.Scanner;

public class Employee {
	
	Scanner in = new Scanner(System.in);
		@Override
	public String toString() {
		 System.out.println( ind +"      "+ id + "      "+name+"     "+city+"      "+state+"      "+salary);
		return "";
	}


		private int ind;
		private int id;
		String name;
		String city;
		private String state;
		int salary;
		
	
	public Employee() {
			//super();
			// TODO Auto-generated constructor stub
		}
	public Employee(int ind, int id, String name, String city, String state, int salary) {
			//super();
			this.ind = ind;
			this.id = id;
			this.name = name;
			this.city = city;
			this.state = state;
			this.salary = salary;
		}
	public int getInd() {
		return ind++;
	}
	public void setInd(int ind) {
		this.ind = ind;
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
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	 
	public void itSalary(){
		while (salary<4000 || salary>9000){
			System.out.println("Enter Salary Again Between 4000-9000 - ");
			salary = in.nextInt();
		}
	}

	public void mktSalary(){
		while (salary<5000 || salary>8500){
			System.out.println("Enter Salary Again Between 5000-8500 - ");
			salary = in.nextInt();
		}
	}
	public void saleSalary(){
		while (salary<3000 || salary>7000){
			System.out.println("Enter Salary Again Between 3000-7000 - ");
			salary = in.nextInt();
		}
	}
	
	
	public void inArray(){
		
		//ind =ind++;
		//System.out.println("Enter Employee Index - "+ ind);
		
		//id = id++;
		System.out.println("----------------------------------------------------------");
		System.out.print("Enter Employee ID - ");
		id=in.nextInt();
		
		
		System.out.print("Enter Name - ");
		name =in.next();
		
		System.out.print("Enter City - ");
		city = in.next();
		
		System.out.print("Enter State - ");
		state = in.next();
		
		if(city=="Irving"){
			salary = 5000;
		}
		if(state =="California"){
			salary = 6000;
		}
		if(city!="Irving"&&state!="California"){
			System.out.print("Enter Salary - ");
			salary = in.nextInt();
		}
			/*if(city=="Irving"){
				salary = 5000;
			}
			if(state=="California"){
				salary = 6000;
			}
		}*/
		System.out.println("----------------------------------------------------------");
		
}
	public void blink(){
	for(int i =0; i<50; i++){
			try {
				Date date = new Date();
				Thread.sleep(5000);
				System.out.print("My name is "+name+" and the date and time is ");
				
				System.out.println(date.toString());
			} catch (InterruptedException e) {
				
				System.out.println("Nothing to see here");
			}

	}
	}
	public Comparator<Employee> sorter= new Comparator<Employee>(){
		public int compare(Employee salary1, Employee salary2){
			int salaryMore = salary1.getSalary();
			int salaryLess = salary2.getSalary();
			return salaryLess-salaryMore;
			
		}
	};
}