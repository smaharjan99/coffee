package com.cubic.training.exceptionassignment;

public class RepeatGgg extends Exception{

	public static void f(){
		try {
			g();
		} catch (StringInputError g) {
		System.out.println("Exception Handled "+g);
		throw new RuntimeException(g);
		}
	}
	public static void g() throws StringInputError{
		
	throw new StringInputError("Not here");
		}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		f();
		
	}
	

}
