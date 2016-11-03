package com.cubic.training.organization;

import java.util.Scanner;

public class IT extends Sales{
	
	

	 Salary salary;
	  
	
	public void getSalary(){
		Scanner in = new Scanner(System.in);
		System.out.println("Enter Employee Salary for IT - ");
		salary.sal = in.nextInt(); 
	}
	
	
	public void minSal(){
		System.out.println("Minimum Salary-4000 and Max Salary 9000");
		
		if(salary.sal>= 4000 ){
			System.out.println("Too much");
		}else
			System.out.println("Not Enough");
		
		
	
		
	}
	
}
