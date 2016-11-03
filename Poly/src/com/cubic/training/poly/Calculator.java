package com.cubic.training.poly;

public class Calculator {
	
	/*void sum(int a, int b){
		System.out.println(a+b);
	}
	
	void sum(int a, int b, int c){
		System.out.println(a+b+c);
	}
	
	void sum(double a, double b){
		System.out.println(a+b);
	}*/
	int sum(int a, int b){
		return a+b;
	}
	double sum(double a, double b){
		return a+b;
	}
	public static void main(int b) {
		System.out.println(b);
		
	}
		public static void main(String[] args) {
		// TODO Auto-generated method stub
		Calculator c =new Calculator();
		//c.sum(10, 30);
		//c.sum(10, 20, 30);
		//c.sum(10.1, 20.4);
		int result = c.sum(10, 20);
		System.out.println(result);
		double r = c.sum(10.45, 12.22);
		System.out.println(r);
		main(5);
		
	}

}
