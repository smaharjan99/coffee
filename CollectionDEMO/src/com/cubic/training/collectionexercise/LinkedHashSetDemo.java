package com.cubic.training.collectionexercise;

import java.util.LinkedHashSet;

public class LinkedHashSetDemo {

	public static void main(String[] args) {
		LinkedHashSet<String> hs = new LinkedHashSet<String>();
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
