package com.cubic.training.poly;

public class Dog extends Animal{
	String name ="lion";
	
	
	
	/*public Dog() {
		System.out.println("Child class constructor is invoked");
	}
*/

	void eat(){
		System.out.println( this.name + " is eating");
	}
	
	void anotherEat(){
		this.eat();
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Dog d = new Dog();
		Animal a = new Animal();
		
		d.eat();
		a.eat();
		d.anotherEat();
	}

}
