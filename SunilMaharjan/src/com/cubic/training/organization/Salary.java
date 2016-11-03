package com.cubic.training.organization;

public class Salary {

	int sal;
	int minSal;
	int maxSal;
	
	
	public Salary(int sal, int minSal, int maxSal) {
		this.sal = sal;
		this.minSal = minSal;
		this.maxSal = maxSal;
		
	}

	void display(){
		System.out.println(sal +minSal + maxSal);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			Salary s= new Salary(20, 4, 5);
			s.display();
			
	}




}
