package com.cubic.training.streams;


import java.io.FileOutputStream;
import java.io.ObjectOutput;
import java.io.ObjectOutputStream;

public class SerializationDemo {

	public static void main(String[] args) throws Exception {
		Student s1 = new Student(101, "Hank", 99);
		FileOutputStream fout = new FileOutputStream("han.txt");
		ObjectOutputStream out = new ObjectOutputStream(fout);
		out.writeObject(s1);//
		out.flush();
		out.close();
		System.out.println("success");

	}

}
