package com.cubic.training.collectionexercise;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayListDemo {

	public static void main(String[] args) {
		ArrayList<String>al = new ArrayList<String>();
		
		al.add("krishna");
		al.add("ram");
		al.add("hari");
		al.add("chetan");
		
		Collections.sort(al);
		
		for(String s:al){
			System.out.println(s);
		}
	}

}
