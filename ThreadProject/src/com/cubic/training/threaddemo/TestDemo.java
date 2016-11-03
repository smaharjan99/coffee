package com.cubic.training.threaddemo;

public class TestDemo extends Thread{
	
	public void run(){
		if(Thread.currentThread().isDaemon()){
			System.out.println("daemon thread is working");
		}else{
			System.out.println("user thread is working");
		}
	
	}
	public static void main(String[] args) {
		TestDemo t1 = new TestDemo();
		TestDemo t2 = new TestDemo();
		TestDemo t3 = new TestDemo();
		t1.setDaemon(true);
		t1.start();
		t2.start();
		t3.start();
	}
}
