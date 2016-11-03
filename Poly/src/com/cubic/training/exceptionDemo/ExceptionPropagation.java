package com.cubic.training.exceptionDemo;

public class ExceptionPropagation {

	void m(){
		int data = 50/0;
	}
	void n(){
		m();
	}
	void p(){
		n();
	}
	public static void main(String[] args) {
		ExceptionPropagation  ep =new ExceptionPropagation();
		try {
			ep.p();
		} catch (ArithmeticException e) {
			// TODO Auto-generated catch block
			System.out.println("Exception Handled");
		}
		System.out.println("rest of the code");
	}
}
