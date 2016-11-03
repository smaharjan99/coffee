package com.cubic.training.threaddemo;

public class Test {

	public static void main(String[] args) {
		Even e = new Even();
		Odd o = new Odd();
		e.setName("asd");
		o.setName("asdf");
		e.start();
		
		//e.setPriority(10);
		o.start();
		//o.setPriority(5);
		System.out.println("Name of even thread is "+ e.getName());
		System.out.println("Name of even thread is "+ o.getName());
	}
	
}
