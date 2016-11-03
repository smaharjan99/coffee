package com.cubic.training.exceptionDemo;

public class TestThrow {
	static void validate(int age) throws InvalidAgeException{
		if (age<18){
			throw new InvalidAgeException("sorry you are not ready");
		}else{
			System.out.println("Welcome to vote");
		}
	}
	public static void main(String[] args) {
		try {
			validate(13);
		} catch (InvalidAgeException e) {
			// TODO Auto-generated catch block
			System.out.println(e);
		}
		System.out.println("rest of the code");
	}

}
