package com.cubic.training.wrap;

public class MemberOuter {
	private int data = 50;
	
	//Member Inner Class
	class Inner{
		void print(){
			System.out.println("Inner class print method "+ data);
		}
		
	}
	
	public static void main(String[] args) {
		MemberOuter m = new MemberOuter();
		MemberOuter.Inner in = m.new Inner();
		in.print();
	}

}
