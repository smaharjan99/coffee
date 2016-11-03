package com.cubic.training.collectionexercise;

public class Student implements Comparable<Student> {

	int id;
	String name;
	int age;
	
	public Student(int id, String name, int age) {
		
		this.id = id;
		this.name = name;
		this.age = age;
	}
	@Override
	public int compareTo(Student st) {
		if(age ==st.age){
			return 0;
		}else if(age>st.age){
			return 1;
		}else
		return -1;
	}
	
	
}
