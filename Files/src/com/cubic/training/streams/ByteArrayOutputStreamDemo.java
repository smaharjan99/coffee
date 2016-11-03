package com.cubic.training.streams;

import java.io.ByteArrayOutputStream;
import java.io.FileOutputStream;

public class ByteArrayOutputStreamDemo {

	public static void main(String[] args) throws Exception {
		FileOutputStream fout =new FileOutputStream("f1.txt");
		FileOutputStream fout1 =new FileOutputStream("f2.txt");

		ByteArrayOutputStream bout = new ByteArrayOutputStream();
		bout.write(6346);
		bout.writeTo(fout);
		bout.writeTo(fout1);
		bout.flush();
		System.out.println("success");

	}

}
