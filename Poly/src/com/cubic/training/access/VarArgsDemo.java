package com.cubic.training.access;

public class VarArgsDemo {
	static void display(String...values){
		System.out.println("Display method invoked");
		for(String s:values){
			System.out.println(s);
		}
	}
	public static void main(String[] args) {
		
		display();
		display("HHX", "JHDFJ","KJSH");
	}

}
