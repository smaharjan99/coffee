package com.cubic.training.exceptionassignment;

public class Nullify {
	void display(){
	System.out.println("Attack");
	}
	
	public Nullify() {
		// TODO Auto-generated constructor stub
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Nullify n = null;
		try {
			n.display();
		} catch (Exception e) {
			System.out.println("Exception Handled "+e);
		}
		System.out.println("I was here");
		
	}

}
