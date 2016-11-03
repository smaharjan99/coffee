package com.cubic.training.collectionexercise;

public class TestGen {

	public static void main(String[] args) {
		Test<Integer> t = new Test<Integer>();
		t.add(10);
		System.out.println(t.getObj());
	}
}
