package com.cubic.training.threaddemo;

public class TestDeadLock {

	public static void main(String[] args) {
		final String resource1 = "Hari";
		final String resource2 = "Krishna";
		
		Thread t1 = new Thread(){//Anonymous Inner Class
			public void run(){
				synchronized (resource1) {
					System.out.println("Resource 1 is locked with Thread 1");
					try {
						Thread.sleep(100);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
					
					synchronized(resource2){
						System.out.println("Resource 2 is locked with Thread 1");
						
					}
				}
			}
		
		};
		Thread t2 = new Thread(){
			public void run(){
				synchronized (resource2) {
					System.out.println("Resource 2 is locked with Thread 2");
					try {
						Thread.sleep(100);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
					
					synchronized(resource1){
						System.out.println("Resource 1 is locked with Thread 2");
						
					}
				}
			}
			
		};
		t1.start();
		t2.start();
	
	}

}
