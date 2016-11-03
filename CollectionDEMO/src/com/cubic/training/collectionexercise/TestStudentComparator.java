package com.cubic.training.collectionexercise;

import java.util.ArrayList;
import java.util.Collections;

public class TestStudentComparator {

	public static void main(String[] args) {

		ArrayList<StudentComp> al = new ArrayList<StudentComp>();
		AgeComparator a = new AgeComparator();
		
		StudentComp s1=new StudentComp(111, "Ned", 43);
		StudentComp s2 = new StudentComp(212, "Robert", 45);
		StudentComp s3 = new StudentComp(313, "Jamie", 34);
		StudentComp s4 = new StudentComp(101, "Jon", 23);
		al.add(s1);
		al.add(s2);
		al.add(s3);
		al.add(s4);
		
		System.out.println("Sorting based on age - ");
		//Collections.sort(al, a);//ascending order
		//descending order
		Collections.sort(al, Collections.reverseOrder(a));
		
		for (StudentComp s:al){
			System.out.println(s.id+ "   "+s.name+ "      "+s.age);
		}
		
		System.out.println("Sorting based on name - ");
		Collections.sort(al, new NameComparator());
		
		
		for (StudentComp s:al){
			System.out.println(s.id+ "   "+s.name+ "      "+s.age);
		
	}
	}
}
