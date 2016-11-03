package com.cubic.training.assignment;

import java.util.Scanner;
import java.util.Date;

public class Blinky extends Thread {
	public void blink(){
	Scanner in = new Scanner(System.in);
	 
	
	
	
		//Date date = new Date();
		System.out.println("Enter Name - ");
		String name = in.next();
		//System.out.println(name);
		//System.out.println(date.toString());
		for(int i =0; i<400; i++){
		try {
		
			Thread.sleep(5000);
			System.out.println(name);
			Date date = new Date();
			System.out.println(date.toString());
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			
		}
		}

	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Blinky b = new Blinky();
		b.blink();	
		}


}
