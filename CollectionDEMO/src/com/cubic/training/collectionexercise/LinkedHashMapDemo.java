package com.cubic.training.collectionexercise;


import java.util.LinkedHashMap;
import java.util.Map;

public class LinkedHashMapDemo {

	public static void main(String[] args) {
		LinkedHashMap<Integer, String> hm = new LinkedHashMap<Integer, String>();
		hm.put(101, "Hari");
		hm.put(102, "Santosh");
		hm.put(103, "Takendra");
		hm.put(103, "Gulzar");
		hm.put(null, null);
		
		for(Map.Entry m:hm.entrySet()){
			System.out.println(m.getKey()+ "  "+ m.getValue());
		}

	}

}
