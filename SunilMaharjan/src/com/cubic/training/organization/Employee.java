package com.cubic.training.organization;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Employee {
	int id;
	String name;
	String city;
	String state;
	int salary;
	Scanner in = new Scanner(System.in);
	int empNum;
	int deptNum;
	//int[] emp = new int[empNum];
	//int deptNum;
	int editNum;
	int choice;
	int choice2;
	
	
	//ArrayList<ArrayList<Object>> listIt = new ArrayList<ArrayList<Object>>();
	//ArrayList<ArrayList<Object>> listMkt= new ArrayList<ArrayList<Object>>();
	//ArrayList<ArrayList<Object>> listSale = new ArrayList<ArrayList<Object>>();
	ArrayList<Object> data = new ArrayList<Object>();
	ArrayList<Object> listIt = new ArrayList<Object>();
	ArrayList<Object> listMkt = new ArrayList<Object>();
	ArrayList<Object> listSale = new ArrayList<Object>();
	
	//constructor
	public Employee(int id, String name, String city, String state, int salary) {
			//super();
			this.id = id;
			this.name = name;
			this.city = city;
			this.state = state;
			this.salary = salary;
		}
	
	public Employee() {
		// TODO Auto-generated constructor stub
	}
	void EmInt(){
		
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", city=" + city + ", state=" + state + ", salary=" + salary
				+ ", in=" + in + "]";
	}
	
	
	 void arraySize(){
		System.out.println("Enter Number of Employees - ");
		empNum = in.nextInt();
		//empNum = data.size();
	}
	
	 
	 public void inArray(){
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
			 	listIt.add(id);
				listIt.add(name);
				listIt.add(city);
				listIt.add(state);
				listIt.add(salary);
			
		//listIt.add(data);
			//}
			 //System.out.println(data);
		 }else if(deptNum==2){
			 //listMkt.add(data);
			 listIt.add(id);
				listMkt.add(name);
				listMkt.add(city);
				listMkt.add(state);
				listMkt.add(salary);
		 }else if(deptNum ==3){
		 //listSale.add(data);
			 listIt.add(id);
				listSale.add(name);
				listSale.add(city);
				listSale.add(state);
				listSale.add(salary);
		 }
		 
		}
		 
	}
	
	 void addArray(){
	
		 
	 }
	 void editArray(){
		 if (deptNum==1){
			 //listIt.set(id,id);
			 System.out.println("Enter the Id of the employee - ");
			 //id=in.nextInt();
				
				System.out.println("Enter Name - ");
				name =in.next();
				//listIt.set(id,name);
				System.out.println("Enter City - ");
				city = in.next();
				//listIt.set(id,city);
				System.out.println("Enter State - ");
				state = in.next();
				//listIt.set(id,state);
				System.out.println("Enter Salary - ");
				salary = in.nextInt();
				//listIt.set(id,salary);
				/*listIt.set(id,name);
				listIt.set(id,city);
				listIt.set(id,state);
				listIt.set(id,salary);*/
				 }else if(deptNum==2){
					//listMkt.add(id, data);
					 //listMkt.set(id,id);
						/*listMkt.set(id,name);
						listMkt.set(id,city);
						listMkt.set(id,state);
						listMkt.set(id,salary);*/
				 }else if(deptNum ==3){
					//listSale.add(id, data);
					// listSale.set(id,id);
						/*listSale.set(id,name);
						listSale.set(id,city);
						listSale.set(id,state);
						listSale.set(id,salary);*/
				 }
	 }
	void removeArray(){
		 if (deptNum==1){
				//listIt.remove(data);
			// listIt.remove(id);
				
				 }else if(deptNum==2){
					 //listMkt.remove(id);
				 }else if(deptNum ==3){
					 //listSale.remove(id);
				 }
	}
	void displayArray(){
		 if (deptNum==1){
			 for (int empNum = 0; empNum<listIt.size(); empNum++ ){
			 //for (int k = 1; k >listIt.size(); k++) {
				 //for(int h = 1; h >data.size(); h++){
				 System.out.print(listIt.get(empNum));
			 //}
				 
			 }
				
				 }else if(deptNum==2){
					/* for (Object data: listMkt){
						 System.out.println(data);
					 };*/
					 for (int k = 0; k < empNum; k++) {
						 System.out.println(listMkt);
					 }
				 }else if(deptNum ==3){
					 for (Object data: listSale){
						 System.out.println(data);
					 }
				 }
		
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

	void employeeMenu(){
		while(editNum!=5){
			editDepartment();
		switch(choice2){
		case 1: 
			
			System.out.println("Add New Employee Data From Here");
			arraySize();
			inArray();
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




void choiceDepartment(){
	while (deptNum!=4){
		chooseDepartment();
	switch(choice){
	case 1: 
		System.out.println("You are in IT Department");
		employeeMenu();
		
		break;
	case 2:
		System.out.println("You are in Marketing Department");
		employeeMenu();
		break;
	case 3:
		System.out.println("You are in Sales Department");
		employeeMenu();
		break;
	case 4:
		System.out.println("Exit");
		System.exit(0);
		break;
	default:
		System.out.println("Enter the numbers 1,2,3,4 and nothing else");
	break;
	}
	}
	
}


	public static void main(String[] args) {
		 Employee e= new Employee();
		/* e.arraySize();
		 
		 for (int i=e.empNum; i<=1; i--){
		 e.inArray();
		 System.out.println(e.empNum);
		 //System.out.println("Current array list is:" + e.data);
		 */
		 
		 e.choiceDepartment();
		 //e.employeeMenu();
			
	}
	 
}
