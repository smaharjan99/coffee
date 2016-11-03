package com.cubic.training.filinfilinf;

import java.io.FileOutputStream;
import java.io.IOException;


public class Creation{

	public static void main(String[] args) {
		try {
			FileOutputStream fout = new FileOutputStream("3nums.txt");
			String a = "309  12  42";
			
			byte i[]= a.getBytes();
			fout.write(i);
			fout.close();
			System.out.println("Success");
		} catch (IOException e) {
			
			e.printStackTrace();
		} catch (Exception e){
			e.printStackTrace();
		}

	}
}