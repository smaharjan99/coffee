package com.cubic.training.exceptionassignment;


//#1
public class Include extends Exception{
	
		//Constructor with String argument
		public Include(String s) {
			super(s);
		}
		
	//exception method
	static void validate(String a) throws Include{
		if (a != "What"){
			throw new Include("Not Right");
		}else{
			System.out.println("Questioned");
		}
	}

	public static void main(String[] args) {
		// try and catch
		try {
			validate("There");
		} catch (Include e) {
			System.out.println(e);
		}finally{
		System.out.println("Proof I was Here");
	}
	}

}
