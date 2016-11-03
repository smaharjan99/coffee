package com.cubic.training.threaddemo;

public class TestRunnable implements Runnable{


	@Override
	public void run() {
		System.out.println("TestRunnable is running");
		
	}
	
	public static void main(String[] args) {
		TestRunnable tr = new TestRunnable();
		Thread t = new Thread(tr);
		t.start();

	}


}
