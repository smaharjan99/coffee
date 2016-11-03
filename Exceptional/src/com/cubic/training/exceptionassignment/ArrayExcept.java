package com.cubic.training.exceptionassignment;

public class ArrayExcept {

	
	public static void main(String[] args) {
		int i[]= {1,2,3,4,5};
		
		try {
			
			for(int j =4;j >=0; j--) {
			    System.out.println("The value of array is " +i[j]);
			 }
		} catch (ArrayIndexOutOfBoundsException e) {
			
				System.out.println("Exception Handled "+ e);
		}

	}
	
	

}
