package com.cubic.training.emrp;

import java.util.ArrayList;
import java.util.Scanner;

public class Total {
	static Scanner in = new Scanner(System.in);
	
	class Employee{
		private int id;
		private String name;
		private String city;
		private String state;
		private int salary;
		
	
	public Employee() {
			//super();
			// TODO Auto-generated constructor stub
		}
	public Employee(int id, String name, String city, String state, int salary) {
			//super();
			this.id = id;
			this.name = name;
			this.city = city;
			this.state = state;
			this.salary = salary;
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
	 public void inArray(){
			
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
			
	}
	
	class Department{
		private int empNum;
		private int deptNum;
		private int editNum;
		private int choice;
		private int choice2;
		
		
		public Department() {
			//super();
			// TODO Auto-generated constructor stub
		}

		public Department(int empNum, int deptNum, int editNum, int choice, int choice2) {
			//super();
			this.empNum = empNum;
			this.deptNum = deptNum;
			this.editNum = editNum;
			this.choice = choice;
			this.choice2 = choice2;
		}

		public int getEmpNum() {
			return empNum;
		}

		public void setEmpNum(int empNum) {
			this.empNum = empNum;
		}

		public int getDeptNum() {
			return deptNum;
		}

		public void setDeptNum(int deptNum) {
			this.deptNum = deptNum;
		}

		public int getEditNum() {
			return editNum;
		}

		public void setEditNum(int editNum) {
			this.editNum = editNum;
		}

		public int getChoice() {
			return choice;
		}

		public void setChoice(int choice) {
			this.choice = choice;
		}

		public int getChoice2() {
			return choice2;
		}

		public void setChoice2(int choice2) {
			this.choice2 = choice2;
		}
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
		
	}
	
	public void main(String[] args) {
		Employee e= new Employee();
		Department d = new Department();
		//Employee itEmp=new Employee(id, name, city, state, salary);
		ArrayList<Employee> emp = new ArrayList<Employee>();
		ArrayList<Employee> itEmp = new ArrayList<Employee>();
		ArrayList<Employee> mktEmp = new ArrayList<Employee>();
		ArrayList<Employee> saleEmp = new ArrayList<Employee>();
		
		System.out.println("Enter Number of Employees - ");
		d.empNum = in.nextInt();
		
		for (int i = 0; i < d.empNum; i++) {
			e.inArray();
		}
			if (d.deptNum==1){
				itEmp.add(new Employee(e.id, e.name, e.city, e.state, e.salary));
				System.out.println(itEmp);
			}
			if (d.deptNum==2){
				mktEmp.add(new Employee(e.id, e.name, e.city, e.state, e.salary));
			}
			if (d.deptNum==3){
				saleEmp.add(new Employee(e.id, e.name, e.city, e.state, e.salary));
			}
	}
		

}
}