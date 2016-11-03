package com.cubic.training.threaddemo;

public class MyThread2 extends Thread {
	
	Table t;
	public MyThread2 (Table t){
		this.t= t;
	}
	public void run(){
		t.printTable(10);
	}
}
