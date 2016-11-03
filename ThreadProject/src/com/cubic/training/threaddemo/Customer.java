package com.cubic.training.threaddemo;

public class Customer {

	int amount = 5000;
	synchronized void withdraw(int amount){
		System.out.println("Going to Withdraw");
		if(this.amount< amount){
			System.out.println("Less balance wait for deposit");
			try {
				wait();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			this.amount = this.amount - amount;
			System.out.println("withdraw completed");
		}
	}
	
	synchronized void deposit(int amount){
		System.out.println("going to deposit");
		this.amount = this.amount+amount;
		System.out.println("Deposit complete");
		notify();
	}
}

