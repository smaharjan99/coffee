package com.cubic.training.organization;


import java.util.Scanner;

public class Departmen extends IT {
		
	


		public static void main(String[] args) {
			Scanner in = new Scanner(System.in);
			System.out.println("What is your Department (IT, Marketing, Sales) - ");
			String deptment = in.nextLine();
			IT dept1 = new Departmen();
			Marketing dept2 = new Departmen();
			Sales dept3 = new Departmen();
			dept1.getSalary();
			dept2.getSalary();
			dept3.getSalary();
			dept1.minSal();
			if(deptment=="IT"||deptment == "it" || deptment =="It"){
				System.out.println();
				
			}	
			
		}
}

		
