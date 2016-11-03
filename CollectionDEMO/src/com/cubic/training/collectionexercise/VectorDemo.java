package com.cubic.training.collectionexercise;

import java.util.Vector;

public class VectorDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Vector<String> v = new Vector<String>(3,2);
		System.out.println("Size of vector is - "+v.size());
		System.out.println("Capacity of vector is - "+v.capacity());
	
		v.addElement("Hari");
		v.addElement("chetan");
		
		System.out.println("Size of vector is - "+v.size());
		System.out.println("Capacity of vector is - "+v.capacity());
	
		v.addElement("Ram");
		v.addElement("Krishna");
		
		System.out.println("Size of vector is - "+v.size());
		System.out.println("Capacity of vector is - "+v.capacity());
	
		v.addElement("Ram");
		//v.addElement("Krishna");
		
		System.out.println("Size of vector is - "+v.size());
		System.out.println("Capacity of vector is - "+v.capacity());
	
	}

}
