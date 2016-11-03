package com.cubic.training.collectionexercise;

import java.util.HashSet;

public class HashSetDemo {

	public static void main(String[] args) {
		HashSet<String> hs = new HashSet<String>();
		hs.add("abid");
		hs.add("azeem");
		hs.add("hari");
		hs.add("brad");
		hs.add("abid");
		
		hs.add("azeem");
		hs.add("lokesh");
		for(String s:hs){
			System.out.println(s);
			//System.out.println(hs.size());
		}
	}

}
