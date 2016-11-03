package com.cubic.training.streams;

import java.io.FileReader;

public class FileReaderDemo {

	public static void main(String[] args) throws Exception {
		
		FileReader fr = new FileReader("apple.txt");
		int i;
		while((i=fr.read())!=-1){
			System.out.println((char)i);
		}
		fr.close();
	}

}
