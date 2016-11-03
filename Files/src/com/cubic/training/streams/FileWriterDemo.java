package com.cubic.training.streams;

import java.io.FileWriter;
import java.io.IOException;

public class FileWriterDemo {
	
	public static void main(String[] args) throws IOException {
		FileWriter fw = new FileWriter("apple.txt");
		fw.write("Knowledge in a tin can");
		fw.close();
		System.out.println("Success");
	}
}
