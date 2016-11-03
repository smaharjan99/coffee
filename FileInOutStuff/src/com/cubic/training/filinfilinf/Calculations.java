package com.cubic.training.filinfilinf;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

public class Calculations {

	

	private static Scanner scanner;

	public static void main(String[] args) {
		
	
	try {
		FileInputStream fin = new FileInputStream("3nums.txt");
		scanner = new Scanner(fin);
		int sum=0;
		while (scanner.hasNextInt()){
			sum += scanner.nextInt();
		
		}	
		System.out.println(sum);
		fin.close();
	} catch (FileNotFoundException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	} catch (IOException e){
		e.printStackTrace();	
	
	}
}
}



