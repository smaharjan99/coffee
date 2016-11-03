package com.cubic.training.collectionexercise;

import java.util.ArrayList;
import java.util.Collections;

public class TestStudent {

	public static void main(String[] args) {

		ArrayList<Student> al = new ArrayList<Student>();
		Student s1=new Student(111, "Ned", 43);
		Student s2 = new Student(212, "Robert", 45);
		Student s3 = new Student(313, "Jamie", 34);
		Student s4 = new Student(101, "Jon", 23);
		al.add(s1);
		al.add(s2);
		al.add(s3);
		al.add(s4);
		
		Collections.sort(al);
		
		for (Student s:al){
			System.out.println(s.id+ "   "+s.name+ "      "+s.age);
		}

	}

}
