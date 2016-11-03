package com.cubic.training.threaddemo;

public class MyThread4 extends Thread{

	Table t;

	public MyThread4(Table t) {
		
		this.t = t;
	}
	
	public void run(){
		t.printTable(50);
	}
}
