package com.cubic.training.wrap;

public class Wrapper2 {

	public static void main(String[] args) {
		Integer i=new Integer(20);
		int j =i.intValue();//manually converting Integer to int
		int k=i; //Unboxing
		System.out.println(i+ " "+j+" "+k);
	}

}
