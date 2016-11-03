package com.cubic.training.exceptionDemo;

import java.io.IOException;

public class ExceptionPropagationChecked {
	void m() throws IOException{
		throw new java.io.IOException("device error");
		/*try {
			throw new java.io.IOException("device error");
		} catch (IOException e) {
			System.out.println("IOException Handled");
		}*/
	}
	
	void n() throws IOException{
		m();
		
	}
	
	void p(){
		try {
			n();
		} catch (IOException e) {
			System.out.println("IOException Handled");
		}
	}
	public static void main(String[] args) {
		ExceptionPropagationChecked epc = new ExceptionPropagationChecked();
		epc.p();
		System.out.println("rest of the code");
	}

}
