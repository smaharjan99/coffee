package com.cubic.training.exceptionassignment;
//#2
public class ExceptMain {

	//method to check the exception 
	static void validate(String s)throws StringInputError{
		if (s != "Apple"){
			throw new StringInputError("Wrong Fruit ");
		}else{
			System.out.println("Eat your apple");
		}
		}
	
	
	//main method
	public static void main(String[] args) {

		//try and catch exception
		try {
			validate("Banana");
		} catch (StringInputError e) {			
			System.out.println(e);
			}finally {//finally exception
				System.out.println("Proving I was Here");
			}
			
		}

}
