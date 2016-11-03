package com.cubic.training.threaddemo;

public class TestTable {

	public static void main(String[] args) {
		Table obj = new Table();
		Table obj1 = new Table();
		MyThread1 m1 = new MyThread1(obj);
		MyThread2 m2 = new MyThread2(obj);
		MyThread3 m3 = new MyThread3(obj1);
		MyThread4 m4 = new MyThread4(obj1);
		m1.start();
		m2.start();
		m3.start();
		m4.start();
	}

}
