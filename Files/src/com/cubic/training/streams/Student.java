package com.cubic.training.streams;

import java.io.Serializable;

public class Student implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	int id;
	String name;
	transient int age;
	
	public Student(int id, String name, int age) {
		
		this.id = id;
		this.name = name;
		this.age = age;
	}
	

	
}
