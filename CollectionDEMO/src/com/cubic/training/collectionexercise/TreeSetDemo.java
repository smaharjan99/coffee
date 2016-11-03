package com.cubic.training.collectionexercise;

import java.util.TreeSet;

public class TreeSetDemo {

	public static void main(String[] args) {
		TreeSet<String> hs = new TreeSet<String>();
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
