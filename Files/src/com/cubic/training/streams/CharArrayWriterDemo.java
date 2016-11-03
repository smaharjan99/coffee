package com.cubic.training.streams;

import java.io.CharArrayWriter;
import java.io.FileWriter;

public class CharArrayWriterDemo {

	public static void main(String[] args) throws Exception {

		CharArrayWriter cw = new CharArrayWriter();
		cw.write("Into the wild");
		FileWriter fw = new FileWriter("c.txt");
		FileWriter fw1 = new FileWriter("d.txt");
		FileWriter fw2 = new FileWriter("e.txt");
		
		cw.writeTo(fw);
		cw.writeTo(fw1);
		cw.writeTo(fw2);
		fw.close();
		fw1.close();
		fw2.close();
		System.out.println("success");


	}

}
