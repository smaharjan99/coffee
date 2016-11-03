package com.cubic.training.streams;

import java.io.FileInputStream;
import java.io.ObjectInputStream;

public class DeserializationDemo {

	public static void main(String[] args) throws Exception {
		ObjectInputStream in = new ObjectInputStream(new FileInputStream("han.txt"));
		Student s = (Student)in.readObject();
		System.out.println(s.id +" "+ s.name+" "+s.age);
		in.close();

	}

}
