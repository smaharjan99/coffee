package com.cubic.training.streams;

import java.io.BufferedOutputStream;
import java.io.FileOutputStream;

public class BufferedOutputStreamDemo {

	public static void main(String[] args) throws Exception {
		FileOutputStream fout =new FileOutputStream("babana.txt");
		BufferedOutputStream bout = new BufferedOutputStream(fout);
		String s ="Welcome to the Banana Land ";
		byte b[]=s.getBytes();
		bout.write(b);
		bout.flush();
		bout.close();
		fout.close();
		System.out.println("success");
		
	}

}
