package com.cubic.training.streams;

import java.io.FileInputStream;
import java.io.SequenceInputStream;

public class SequenceInputStreamDemo {

	public static void main(String[] args) throws Exception {

		FileInputStream fin = new FileInputStream("f1.txt");
		FileInputStream fin1 = new FileInputStream("f2.txt");

		SequenceInputStream sin = new SequenceInputStream(fin, fin1);
		int i;
		while((i=sin.read())!=-1){
			System.out.println((char)i);
		}
		sin.close();
		fin1.close();
		fin.close();
	}

}
