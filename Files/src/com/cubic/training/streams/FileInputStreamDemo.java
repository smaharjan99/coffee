package com.cubic.training.streams;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class FileInputStreamDemo {
	public static void main(String[] args) {
		
	
	try {
		FileInputStream fin = new FileInputStream("abc.txt");
		int i=0;
		while ((i=fin.read())!=-1){
			System.out.println((char)i);
			
		}
		fin.close();
	} catch (FileNotFoundException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	} catch (IOException e){
		e.printStackTrace();	
	
	}
}
}
