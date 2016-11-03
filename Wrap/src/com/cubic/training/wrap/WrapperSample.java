package com.cubic.training.wrap;

public class WrapperSample {

	public static void main(String[] args) {
		int a=5;
		Integer i =Integer.valueOf(a); // Converting int to Integer
		Integer j=a;//autoboxing
		
		System.out.println(a+ " "+i+" "+j);
	}

}
