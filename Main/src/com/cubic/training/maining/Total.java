package com.cubic.training.maining;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Total {
	//input
	static Scanner in = new Scanner(System.in);
	

	
	public static void main(String[] args) {
		//Object for Classes
		Employee e= new Employee();
		Department d = new Department();
		//ArrayList
		ArrayList<Employee> itEmp = new ArrayList<Employee>();
		ArrayList<Employee> mktEmp = new ArrayList<Employee>();
		ArrayList<Employee> saleEmp = new ArrayList<Employee>();
	
		while(d.deptNum <4){//loop for department
			
			while(d.editNum!=8){//loop for choice
				
			d.editDepartment();
			d.chooseDepartment();
			
			switch(d.choice2){
			
			case 1://add
			System.out.print("Enter Number of Employees - ");
				d.empNum = in.nextInt();
			System.out.println("Add New Employee Data From Here");
			
			if (d.deptNum==1){
				for (int index = 0; index < d.empNum; index++) {
					e.inArray();
					e.itSalary();
					if(d.empNum >=2||index>=1){
						e.salary = e.salary +500;
					}
				
				System.out.println("Index" + "  Id   "+"    Name    " + " City   " + "  State   "
						  + "   Salary    "  + "\n" );
				
				itEmp.add(new Employee(e.getInd(), e.getId(), e.getName(), e.getCity(), e.getState(), e.getSalary()));
				
				System.out.println(itEmp);
				}
			}
			if (d.deptNum==2){
				for (int index = 0; index < d.empNum; index++) {
					e.inArray();
					e.mktSalary();
					System.out.println("Employee id   "+"    Name    " + " City   " + "  State   "
							  + "   Salary    "  + "\n" );
				mktEmp.add(new Employee(e.getInd(), e.getId(), e.getName(), e.getCity(), e.getState(), e.getSalary()));
				System.out.println(mktEmp);
				}
				}
			if (d.deptNum==3){
				for (int index = 0; index < d.empNum; index++) {
					e.inArray();
					e.saleSalary();
					System.out.println("Employee id   "+"    Name    " + " City   " + "  State   "
							  + "   Salary    "  + "\n" );
				saleEmp.add(new Employee(e.getInd(), e.getId(), e.getName(), e.getCity(), e.getState(), e.getSalary()));
				System.out.println(saleEmp);
				}
				}
			
			break;
			case 2://edit
			System.out.println("Edit Employee Data");
			if (d.deptNum==1){
				
				System.out.print("Enter the Employee Index to edit - ");
				int index =in.nextInt();
				e.inArray();
				e.itSalary();
				itEmp.set(index, new Employee(e.getInd(), e.getId(), e.getName(), e.getCity(), e.getState(), e.getSalary()));
				System.out.println(itEmp);
				
				}
			if (d.deptNum==2){
				System.out.print("Enter the Employee Index to edit - ");
				int index =in.nextInt();
				e.inArray();
				e.mktSalary();
				mktEmp.add(index, new Employee(e.getInd(), e.getId(), e.getName(), e.getCity(), e.getState(), e.getSalary()));
				System.out.println(mktEmp);
			}
			if (d.deptNum==3){
				System.out.print("Enter the Employee Index to edit - ");
				int index =in.nextInt();
				e.inArray();
				e.saleSalary();
				saleEmp.add(index, new Employee(e.getInd(), e.getId(), e.getName(), e.getCity(), e.getState(), e.getSalary()));
				System.out.println(saleEmp);
				}
			break;
			
			case 3://remove
				if (d.deptNum==1){
					System.out.print("Enter the Employee Index to remove - ");
					int index = in.nextInt();
					itEmp.remove(index);
				}
				
				if (d.deptNum==2){
					System.out.print("Enter the Employee Index to remove - ");
					int index = in.nextInt();
					mktEmp.remove(index);
				}
				if (d.deptNum==3){
					System.out.print("Enter the Employee Index to remove - ");
					int index = in.nextInt();
					saleEmp.remove(index);
				}
				break;
				
			case 4://display
				
				if (d.deptNum==1){
					System.out.println("INDEX  "+"ID   "+"  NAME    " + "  CITY   " + "  STATE   "
							  + "   SALARY    "  + "\n" );
					for ( int i= 0;i<itEmp.size(); i++){
					System.out.println(itEmp.get(i));
					}
				}
				if (d.deptNum==2){
					System.out.println("INDEX  "+"ID   "+"  NAME    " + "  CITY   " + "  STATE   "
							  + "   SALARY    "  + "\n" );
					for ( int i= 0;i<mktEmp.size(); i++){
						
						System.out.println(mktEmp.get(i));
						}
				}
				if (d.deptNum==3){
					System.out.println("INDEX  "+"ID   "+"  NAME    " + "  CITY   " + "  STATE   "
							  + "   SALARY    "  + "\n" );
					for ( int i= 0;i<saleEmp.size(); i++){
						
						System.out.println(saleEmp.get(i));
						}
				}
				break;
				
			case 5://Total
				int totalcost = 0;
				if(d.deptNum==1){
				
				for (Employee pricelist : itEmp) {
				     totalcost += pricelist.getSalary();
			}
				System.out.println("Total Income for IT Department- $"+ totalcost);
				}
				
				if(d.deptNum==2){
					
					for (Employee pricelist : mktEmp) {
					     totalcost += pricelist.getSalary();
				}
					System.out.println("Total Income for Marketing Department- $"+ totalcost);
					}
				if(d.deptNum==3){
					
					for (Employee pricelist : saleEmp) {
					     totalcost += pricelist.getSalary();
				}
					System.out.println("Total Income for Sales Department- $"+ totalcost);
					}
				break;
				
			case 6://Search

				System.out.println("Enter the letter to seacrh");
				String find = in.next();
				if(d.deptNum ==1){
				for(int i=0;i<itEmp.size();i ++){
						if(itEmp.get(i).name.contains(find)){
							System.out.println(itEmp.get(i));
							//System.out.println(itEmp.get(i).name.contains(find));			
					}
					}
				
				}
				if(d.deptNum ==2){
				for(int i=0;i<mktEmp.size();i ++){
							if(mktEmp.get(i).name.contains(find)){
								System.out.println(mktEmp.get(i));
								}
						}
					
					}
				if(d.deptNum ==3){
				for(int i=0;i<saleEmp.size();i ++){
							if(saleEmp.get(i).name.contains(find)){
								System.out.println(saleEmp.get(i));
					
						}
						}
					}
				
				break;
				case 7://Sort
				if (d.deptNum==1){
					Collections.sort(itEmp, e.sorter);
					System.out.println(itEmp);
				}
				if (d.deptNum==2){
					Collections.sort(mktEmp, e.sorter);
					System.out.println(mktEmp);
				}
				if (d.deptNum==3){
					Collections.sort(saleEmp, e.sorter);
					System.out.println(saleEmp);
				}
			break;
			case 8:
				System.out.println("Exit the Program");
				System.exit(0);
				break;
			case 9:
				System.out.println("Blink");
				e.blink();
			default:
				System.out.println("Enter the numbers 1,2,3,4,5,6,7,8 and nothing else");
				break;
			}
				
		}
	}	
	
	
	}
	
}
