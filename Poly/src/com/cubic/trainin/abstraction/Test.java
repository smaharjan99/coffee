package com.cubic.trainin.abstraction;

public class Test implements Readable {
	
/*	@Override
	public void print(){
		System.out.println("printing something");
	}*/

	

	@Override
	public void print() {
		// TODO Auto-generated method stub
		System.out.println("Printing something");
	}

	@Override
	public void show() {
		// TODO Auto-generated method stub
		System.out.println("Reading something");
	}

	@Override
	public void read() {
		// TODO Auto-generated method stub
		System.out.println("Showing something");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Test t = new Test();
		t.print();
		t.read();
		t.show();
		
	}
	
	

}
