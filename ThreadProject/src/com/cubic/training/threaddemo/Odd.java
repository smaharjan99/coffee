package com.cubic.training.threaddemo;

public class Odd extends Thread {

	public void run(){
		for(int i=1; i<=20; i+=2){
			System.out.println("Odd number   " + i);
			try {
				Thread.sleep(3000);
			} catch (InterruptedException e) {
				System.out.println(e);
			}
		}
		
	}
}
