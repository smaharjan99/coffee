package com.cubic.training.wrap;

public class StaticNestedDemo {

	static int data = 50;
	int speed = 100;
	static void display(){
		System.out.println("display");
	}
	
	static class Inner{
		void print(){
			System.out.println("Inner class print method "+data);
			//System.out.println(speed);
			//cannot call non-static inside static class
			}
		
	}
	public static void main(String[] args) {
		StaticNestedDemo.Inner in = new StaticNestedDemo.Inner();
		in.print();
		display();
		Inner in1=new Inner();
		in1.print();
	}

	
}
