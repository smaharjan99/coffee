package com.cubic.training.exceptionassignment;

public class TwoTwo {
	
	static void f(){
		try {
			g();
		} catch (Exception e) {
		System.out.println("Exception Handled "+e);
		}
	}
	static void g() throws StringInputError{
		
	throw new StringInputError("Not here");
		}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		f();
		
	}

}
