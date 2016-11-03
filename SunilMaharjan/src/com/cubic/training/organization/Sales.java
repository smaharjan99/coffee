package com.cubic.training.organization;

import java.util.Scanner;

public class Sales  {
	 Employee employee;
	 Scanner in = new Scanner(System.in); 

	public void setEmployee(Employee employee) {
			this.employee = employee;
		}
		public Employee getEmployee() {
			return employee;
		}

	
		
		public static void main(String[] args) {
			Sales s= new Sales();
			s.getEmployee();
		}
	
}
