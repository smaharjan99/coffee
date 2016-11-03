package com.cubic.training.collectionexercise;


import java.util.Map;
import java.util.TreeMap;

public class TreeMapDemo {

	public static void main(String[] args) {
		TreeMap<Integer, String> hm = new TreeMap<Integer, String>();
		hm.put(111, "subash");
		hm.put(101, "Hari");
		hm.put(102, "Santosh");
		hm.put(103, "Takendra");
		hm.put(103, "Gulzar");
		hm.put(123, null);
		hm.put(13, "Lokesh");
		
		for(Map.Entry m:hm.entrySet()){
			System.out.println(m.getKey()+ "  "+ m.getValue());
		}

	}

}
