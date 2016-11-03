package com.cubic.training.threaddemo;

public class Even extends Thread{
	
	public void run(){
		for(int i=0; i<20; i+=2){
			System.out.println("Even number   " + i);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				System.out.println(e);
			}
		}
		
	}

}
