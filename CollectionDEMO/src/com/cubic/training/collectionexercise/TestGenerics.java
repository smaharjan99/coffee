package com.cubic.training.collectionexercise;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;

public class TestGenerics {

	public static void main(String[] args) {
		LinkedList<String> al = new LinkedList<String>();
		al.add("Hari");
		al.add("Krishna");
		al.add("Krishna");
		al.add("chetan");
		al.set(0, "lokesh");
		
		ArrayList<String> all = new ArrayList<String>();
		all.add("lokesh");
		all.add("adsf");
		
		//al.addAll(all);
		//al.removeAll(all);
		
		ListIterator<String> it = al.listIterator();
		while(it.hasNext()){
			System.out.println(it.next());
		}
		while(it.hasPrevious()){
			System.out.println(it.previous());
		}
		System.out.println("For each loop");
		for (String s:al){
			System.out.println(s);
		}
		
	}

}
