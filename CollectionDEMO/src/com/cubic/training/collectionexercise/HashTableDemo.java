package com.cubic.training.collectionexercise;

import java.util.Hashtable;
import java.util.Map;


public class HashTableDemo{

	public static void main(String[] args) {
		Hashtable<Integer, String> hm = new Hashtable<Integer, String>();
		hm.put(111, "Subash");
		hm.put(101, "Hari");
		hm.put(102, "Santosh");
		hm.put(103, "Takendra");
		hm.put(103, "Gulzar");
		//hm.put(123, null);
		hm.put(13, "Lokesh");
		
		for(Map.Entry m:hm.entrySet()){
			System.out.println(m.getKey()+ "  "+ m.getValue());
		}

	}

}
