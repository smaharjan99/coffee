package com.cubic.training.streams;
import java.io.FileOutputStream;
import java.io.IOException;


public class FileOutputStreamDemo {

	public static void main(String[] args) {
		try {
			FileOutputStream fout = new FileOutputStream("abc.txt");
			String s = "I am moistware developer";
			byte b[]=s.getBytes();
			fout.write(b);
			fout.close();
			System.out.println("Success");
		} catch (IOException e) {
			
			e.printStackTrace();
		} catch (Exception e){
			e.printStackTrace();
		}

	}

}
