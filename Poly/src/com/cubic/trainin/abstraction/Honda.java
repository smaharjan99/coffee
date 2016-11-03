package com.cubic.trainin.abstraction;

public class Honda extends Bike {

	void start(){
		System.out.println("Honda is Starting");
	}
	
	void run(){
		System.out.println("Honda is running");
	}
	public static void main(String[] args) {
		Bike h = new Honda(); //upcasting //dynamic binding
		Bike h1 = new Hero();
		h.start();
		h.run();
		h1.run();
	}

}
