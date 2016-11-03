package com.cubic.training.threaddemo;

public class TestCustomer {

	public static void main(String[] args) {
		Customer c= new Customer();
		new Thread(){
			public void run(){
				c.withdraw(8000);
			}
		}.start();
		
		new Thread(){
			public void run(){
				c.deposit(5000);
			}
		}.start();

	}

}
