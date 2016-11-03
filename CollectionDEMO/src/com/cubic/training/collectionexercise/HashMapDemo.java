package com.cubic.training.collectionexercise;

import java.util.HashMap;
import java.util.Map;

public class HashMapDemo {

	public static void main(String[] args) {
		HashMap<Integer, String> hm = new HashMap<Integer, String>();
		hm.put(101, "Hari");
		hm.put(102, "Santosh");
		hm.put(103, "Takendra");
		hm.put(103, "Gulzar");
		hm.put(123, null);
		
		for(Map.Entry m:hm.entrySet()){
			System.out.println(m.getKey()+ "  "+ m.getValue());
		}

	}

}
